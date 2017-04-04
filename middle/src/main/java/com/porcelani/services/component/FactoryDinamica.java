package com.porcelani.services.component;

import com.porcelani.models.PasswordCharacters;
import org.reflections.Reflections;
import com.porcelani.services.roles.Additions;
import com.porcelani.services.roles.Deductions;
import com.porcelani.services.roles.Rules;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class FactoryDinamica {

	private static final int DEFAULT_MIN = 0;
	private static final int DEFAULT_MAX = 100;

	public Integer executa(PasswordCharacters passwordCharacters) {
		int additions = additions(passwordCharacters);
		int deductions = deductions(passwordCharacters);
		int total = additions - deductions;

		if(total < 0)
			return DEFAULT_MIN;
		if(total >100)
			return DEFAULT_MAX;
		return  total;
	}

	private int additions(PasswordCharacters passwordCharacters) {
		final Class<Additions> statusClass = Additions.class;
		final Set<Class<? extends Additions>> subClasses = new Reflections(
				statusClass.getPackage().getName()).getSubTypesOf(statusClass);
		int rate = 0;
		for (final Class<? extends Rules> class1 : subClasses) {
			rate = getRate(passwordCharacters, rate, class1);
		}
		return rate;
	}

	private int deductions(PasswordCharacters passwordCharacters) {
		final Class<Deductions> statusClass = Deductions.class;
		final Set<Class<? extends Deductions>> subClasses = new Reflections(
				statusClass.getPackage().getName()).getSubTypesOf(statusClass);
		int rate = 0;
		for (final Class<? extends Rules> class1 : subClasses)
			rate = getRate(passwordCharacters, rate, class1);
		return rate;
	}

	private int getRate(PasswordCharacters passwordCharacters, int rate, Class<? extends Rules> class1) {
		try {
			final Rules clazz = class1.newInstance();
			rate = clazz.rate(passwordCharacters);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return rate;
	}
}

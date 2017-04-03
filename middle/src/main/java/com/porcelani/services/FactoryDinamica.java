package com.porcelani.services;

import com.porcelani.models.Password;
import org.reflections.Reflections;
import com.porcelani.services.roles.Additions;
import com.porcelani.services.roles.Deductions;
import com.porcelani.services.roles.Rules;

import java.util.Set;

public class FactoryDinamica {

	private static final int DEFAULT_MIN = 0;
	private static final int DEFAULT_MAX = 100;

	public int executa(Password password) {
		int additions = additions(password);
		int deductions = deductions(password);
		int total = additions - deductions;

		if(total < 0)
			return DEFAULT_MIN;
		if(total >100)
			return DEFAULT_MAX;
		return  total;
	}

	private int additions(Password password) {
		final Class<Additions> statusClass = Additions.class;
		final Set<Class<? extends Additions>> subClasses = new Reflections(
				statusClass.getPackage().getName()).getSubTypesOf(statusClass);
		int rate = 0;
		for (final Class<? extends Rules> class1 : subClasses) {
			rate = getRate(password, rate, class1);
		}
		return rate;
	}

	private int deductions(Password password) {
		final Class<Deductions> statusClass = Deductions.class;
		final Set<Class<? extends Deductions>> subClasses = new Reflections(
				statusClass.getPackage().getName()).getSubTypesOf(statusClass);
		int rate = 0;
		for (final Class<? extends Rules> class1 : subClasses)
			rate = getRate(password, rate, class1);
		return rate;
	}

	private int getRate(Password password, int rate, Class<? extends Rules> class1) {
		try {
			final Rules clazz = class1.newInstance();
			rate = clazz.rate(password);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return rate;
	}
}

package com.porcelani.services.component;

import com.porcelani.models.PasswordCharacters;
import com.porcelani.services.roles.Additions;
import com.porcelani.services.roles.Deductions;
import com.porcelani.services.roles.Rules;
import org.reflections.Reflections;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class DynamicFactory {

    private static final int DEFAULT_MIN = 0;
    private static final int DEFAULT_MAX = 100;

    public Integer command(PasswordCharacters passwordCharacters) {
        int additions = additions(passwordCharacters);
        int deductions = deductions(passwordCharacters);
        int total = additions + deductions;

        if (total < 0)
            return DEFAULT_MIN;
        if (total > 100)
            return DEFAULT_MAX;
        return total;
    }

    protected int additions(PasswordCharacters passwordCharacters) {
        final Class<Additions> statusClass = Additions.class;
        String name = statusClass.getPackage().getName();
        final Set<Class<? extends Additions>> subClasses = new Reflections(name).getSubTypesOf(statusClass);

        return getRateAddition(passwordCharacters, subClasses);
    }

    private int deductions(PasswordCharacters passwordCharacters) {
        final Class<Deductions> statusClass = Deductions.class;
        final Set<Class<? extends Deductions>> subClasses = new Reflections(
                statusClass.getPackage().getName()).getSubTypesOf(statusClass);
        return getRateDeduction(passwordCharacters, subClasses);
    }

    private int getRateAddition(PasswordCharacters passwordCharacters, Set<Class<? extends Additions>> subClasses) {
        int rate = 0;

        for (final Class<? extends Rules> class1 : subClasses) {
            rate = rate + getRate(passwordCharacters, rate, class1);
        }
        return rate;
    }

    private int getRateDeduction(PasswordCharacters passwordCharacters, Set<Class<? extends Deductions>> subClasses) {
        int rate = 0;

        for (final Class<? extends Rules> class1 : subClasses)
            rate = rate + getRate(passwordCharacters, rate, class1);
        return rate;
    }

    private int getRate(PasswordCharacters passwordCharacters, int rate, Class<? extends Rules> class1) {
        try {
            final Rules clazz = class1.newInstance();
            rate = clazz.rate(passwordCharacters);
            System.out.println("Rules - "+ class1.getSimpleName());
            System.out.println("Bonus - "+ rate );
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return rate;
    }
}

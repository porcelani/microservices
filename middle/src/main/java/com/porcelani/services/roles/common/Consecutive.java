package com.porcelani.services.roles.common;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

public abstract class Consecutive {

	private static final String EMPTY = "";

	public int consecutive(String password) {
		List<String> list = ListOfConsecutive(password);

		int consecutiveElements = 0;
		for (String string : list) 
			consecutiveElements = consecutiveElements + string.length() - 1;

		return consecutiveElements;
	}

	private List<String> ListOfConsecutive(String password) {
		List<String> list = new ArrayList<String>();

		String consecutive = EMPTY;
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (extracted(c)) {
				consecutive = consecutive + valueOf(c);
				if (i != password.length()-1)
					continue;
			}

			if (consecutive.length() > 1)
				list.add(consecutive);
			consecutive = EMPTY;
		}
		return list;
	}

	protected abstract boolean extracted(char c);
}

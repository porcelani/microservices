package com.porcelani.models;

import java.text.Normalizer;

import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

public class Password {

	private static final String EMPTY = "";
	private static final String REGEX = "[^a-zA-Z1-9 ]";
	private String password;

	public Password(String senha) {
		this.password = senha;
	}

	public int totalChars() {
		return password.length();
	}

	public int totalNumbers() {
		int cont = 0;
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (isDigit(c))
				cont++;
		}
		return cont;
	}

	public int totalLetters() {
		return totalChars() - totalSymbols() - totalNumbers();
	}

	public int totalUpercaseLetters() {
		int cont = 0;
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (isUpperCase(c))
				cont++;
		}
		return cont;
	}

	public int totalLowercaseLetters() {
		return totalLetters() - totalUpercaseLetters();
	}

	public int totalSymbols() {
		String senhaSemSymbols = removeSymbols();
		return totalChars() - senhaSemSymbols.length();
	}

	public String value(){
		return password;
	}
	
	private String removeSymbols() {
		String text = Normalizer.normalize(password, Normalizer.Form.NFD);
		return text.replaceAll(REGEX, EMPTY);
	}

	
}

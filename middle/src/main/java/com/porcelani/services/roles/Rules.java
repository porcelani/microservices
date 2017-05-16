package com.porcelani.services.roles;

import com.porcelani.models.PasswordCharacters;

public interface Rules {
	int rate(PasswordCharacters passwordCharacters);
}

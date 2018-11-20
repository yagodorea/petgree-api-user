package com.dorea.petgree.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundByEmailException extends RuntimeException {
	public UserNotFoundByEmailException(String email) { super("Não foi encontrado um usuário com o email " + email); }
}

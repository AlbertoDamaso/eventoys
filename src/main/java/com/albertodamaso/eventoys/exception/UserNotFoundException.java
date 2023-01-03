package com.albertodamaso.eventoys.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Não foi possível encontrar o usuário pelo id "+ id);
    }
}

package com.example.demo.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handleException(Exception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static class ProductoExistenteException extends Throwable {
        public ProductoExistenteException(String producto_already_exists) {
        }
    }

    public static class UsuarioExistenteException extends Throwable {
        public UsuarioExistenteException(String producto_already_exists) {
        }
    }
}

package com.example.clientsservice.common.validation;

import java.io.FileNotFoundException;

/**
 * @param <T>
 * Интерфейс валидации
 */
public interface BaseValidator<T> {
    void validate(T obj) throws FileNotFoundException;
}

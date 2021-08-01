package com.example.football.util;

import javax.validation.ConstraintViolation;
import java.util.Set;

public interface ValidationUtil {

    <T> boolean isValid(T entity);

    <E> Set<ConstraintViolation<E>> violation(E entity);
}

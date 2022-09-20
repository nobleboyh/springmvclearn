package com.luv2code.customer.helpers;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
    public String value() default "";
    public String message() default "Invalid";

    //groups: Constraint with others annotations
    public Class<?>[] groups() default {};

    //payload: detail of validator
    public Class<? extends Payload>[] payload() default {};
}

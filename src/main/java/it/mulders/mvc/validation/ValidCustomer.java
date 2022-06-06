package it.mulders.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.TYPE_USE;

@Retention(RUNTIME)
@Target({ TYPE_USE })
@Documented
@Constraint(validatedBy = { ValidCustomerCheck.class })
public @interface ValidCustomer {
    String message() default "Value is not valid";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}

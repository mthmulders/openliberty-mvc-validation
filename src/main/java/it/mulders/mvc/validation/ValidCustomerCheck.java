package it.mulders.mvc.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCustomerCheck implements ConstraintValidator<ValidCustomer, Customer> {
    @Override
    public void initialize(ValidCustomer constraintAnnotation) {
    }

    @Override
    public boolean isValid(Customer value, ConstraintValidatorContext context) {
        return value.getTaxId() != null && value.getTaxId().trim().length() > 0;
    }

}

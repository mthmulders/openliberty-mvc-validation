package it.mulders.mvc.validation;

import jakarta.ws.rs.FormParam;

@ValidCustomer
public class Customer {
    @FormParam("customer.name")
    private String name;
    @FormParam("customer.taxId")
    private String taxId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }
}

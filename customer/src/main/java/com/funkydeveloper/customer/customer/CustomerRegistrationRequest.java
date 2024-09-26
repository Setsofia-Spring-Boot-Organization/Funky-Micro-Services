package com.funkydeveloper.customer.customer;

public record CustomerRegistrationRequest(
        String firstname,
        String lastname,
        String email
) { }

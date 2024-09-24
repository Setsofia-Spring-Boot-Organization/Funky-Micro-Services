package com.funky_micro_service.app.customer;

public record CustomerRegistrationRequest(
        String firstname,
        String lastname,
        String email
) { }

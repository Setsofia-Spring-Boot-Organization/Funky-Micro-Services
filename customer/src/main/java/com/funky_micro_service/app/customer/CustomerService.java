package com.funky_micro_service.app.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService() {

    public void creatNewCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstname(request.firstname())
                .lastname(request.lastname())
                .email(request.email())
                .build();
    }
}

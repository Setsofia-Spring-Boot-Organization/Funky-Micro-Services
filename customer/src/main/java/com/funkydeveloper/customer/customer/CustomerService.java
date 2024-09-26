package com.funkydeveloper.customer.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final RestTemplate restTemplate;

    public void creatNewCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstname(request.firstname())
                .lastname(request.lastname())
                .email(request.email())
                .build();

        customerRepository.saveAndFlush(customer);

        boolean isFraudulentCustomer = Boolean.TRUE.equals(restTemplate.getForObject(
                "http://localhost:8081/api/v1/fraud-check/{{customerId}}",
                Boolean.class,
                customer.getId()
        ));

        if (isFraudulentCustomer) {
            throw new IllegalStateException("user is a fraud");
        }
    }
}

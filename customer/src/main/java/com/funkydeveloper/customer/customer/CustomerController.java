package com.funkydeveloper.customer.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "api/v1/customer")
public record CustomerController(
        CustomerService customerService
) {

    @PostMapping
    public void creatNewCustomer(
            @RequestBody CustomerRegistrationRequest request
    ) {
        log.info("The new customer request data {}", request);

        customerService.creatNewCustomer(request);
    }
}

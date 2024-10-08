package com.funkydeveloper.fraud.fraud;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/fraud-check")
@RequiredArgsConstructor
public class FraudCheckController {

    private final FraudCheckService fraudCheckService;

    @GetMapping(path = "{customerId}")
    public boolean checkFraudulentCustomer(
            @PathVariable("customerId") Integer customerId
    ) {
        return fraudCheckService.isFraudulentCustomer(customerId);
    }
}

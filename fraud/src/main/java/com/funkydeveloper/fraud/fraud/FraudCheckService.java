package com.funkydeveloper.fraud.fraud;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public record FraudCheckService(
        FraudCheckHistoryRepository fraudCheckHistoryRepository
) {

    // check if the customer is fraudulent
    public boolean isFraudulentCustomer(Integer customerId) {

        // save the time the check took place
        fraudCheckHistoryRepository.save(
          FraudCheckHistory.builder()
                  .customerId(customerId)
                  .isFraudster(false)
                  .createdAt(LocalDateTime.now())
                  .build()
        );

        return false;
    }
}

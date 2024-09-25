package com.funkydeveloper.fraud.fraud;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FraudCheckHistory {

    @Id
    @SequenceGenerator(name = "fraud_id_sequence", sequenceName = "fraud_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "frau_id_sequence")
    private Integer id;
    private Integer customerId;
    private Boolean isFraudster;
    private LocalDateTime createdAt;
}

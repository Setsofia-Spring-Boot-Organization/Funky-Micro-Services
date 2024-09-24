package com.funky_micro_service.app.customer;

import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
}

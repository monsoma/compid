package com.example.contract;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.*;

@Builder
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(PartnerId.class)
public class Partner {

    @Id
    private Integer contractId;
    @Id
    private Person person;

    private String role;
}

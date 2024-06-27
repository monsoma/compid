package com.example.contract;

import jakarta.persistence.Embedded;
import lombok.Data;

@Data
public class PartnerId {
    private Integer contractId;
    @Embedded
    private Person person;
}

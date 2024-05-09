package com.bms.curl.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DimUrl {
    
    @Id
    private String id;

    private String url;

    private LocalDate dateAdded;
}

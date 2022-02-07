package com.gcp.cloudFun.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor @NoArgsConstructor
@Document(collection = "customer")
public class Customer {

    @Id
    @NotNull
    private String id;
    private String name;
    private String lastName;
    private String idType;
    private String idNumber;
    private Integer age;
    private String city;
}

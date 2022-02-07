package com.gcp.cloudFun.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CustomerData {

    public static List<Customer> getCustomers(){
        List<Customer> customers = new ArrayList<>();

        customers.add(Customer.builder()
                .name("Michinomiya")
                .lastName("Hirohito")
                .idType("CE")
                .idNumber("25121926711989")
                .city("Tokio")
                .age(62)
                .build());

        customers.add(Customer.builder()
                .name("Ho Chi")
                .lastName("Minh")
                .idType("CE")
                .idNumber("190518902081969")
                .city("Saigon")
                .age(79)
                .build());

        return customers;
    }
}

package com.gcp.cloudFun.functions;

import com.gcp.cloudFun.models.Customer;
import com.gcp.cloudFun.repositories.CustomerRepository;

import java.util.function.Function;

public class GetCustomer implements Function<String, Customer> {
    private final CustomerRepository customerRepository;

    public GetCustomer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer apply(String s) {
        return customerRepository.findById(s).orElse(Customer.builder().build());
    }
}

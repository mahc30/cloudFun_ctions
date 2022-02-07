package com.gcp.cloudFun.functions;

import com.gcp.cloudFun.models.Customer;
import com.gcp.cloudFun.repositories.CustomerRepository;

import java.util.function.Function;

public class CreateCustomer implements Function<Customer, Customer> {

    private final CustomerRepository customerRepository;

    public CreateCustomer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer apply(Customer customer) {

        Customer result = customerRepository.save(customer);
        return result;
    }
}

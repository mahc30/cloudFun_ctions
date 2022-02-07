package com.gcp.cloudFun.functions;

import com.gcp.cloudFun.models.Customer;
import com.gcp.cloudFun.models.CustomerData;
import com.gcp.cloudFun.repositories.CustomerRepository;

import java.util.List;
import java.util.function.Supplier;

public class GetCustomers implements Supplier<List<Customer>> {

    private final CustomerRepository customerRepository;

    public GetCustomers(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> get() {
        List<Customer> customers = customerRepository.findAll();
        return customers;
    }
}

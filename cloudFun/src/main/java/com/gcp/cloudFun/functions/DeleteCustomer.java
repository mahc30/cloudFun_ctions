package com.gcp.cloudFun.functions;

import com.gcp.cloudFun.repositories.CustomerRepository;

import java.util.function.Consumer;

public class DeleteCustomer implements Consumer<String> {
    private final CustomerRepository customerRepository;

    public DeleteCustomer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void accept(String s) {
        customerRepository.deleteById(s);
    }
}

package com.gcp.cloudFun.functions;

import com.gcp.cloudFun.models.Customer;
import com.gcp.cloudFun.repositories.CustomerRepository;

import java.util.function.Function;

public class UpdateCustomer implements Function<Customer, Customer> {

    private final CustomerRepository customerRepository;

    public UpdateCustomer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer apply(Customer customer) {
        Customer customerDB = customerRepository.findById(customer.getId()).orElse(null);
        if(customerDB == null) return Customer.builder().build();

        customerDB.setName(customer.getName());
        customerDB.setLastName(customer.getLastName());
        customerDB.setIdType(customer.getIdType());
        customerDB.setIdNumber(customer.getIdNumber());
        customerDB.setAge(customer.getAge());
        customerDB.setCity(customer.getCity());

        customerDB = customerRepository.save(customerDB);
        return customerDB;
    }
}

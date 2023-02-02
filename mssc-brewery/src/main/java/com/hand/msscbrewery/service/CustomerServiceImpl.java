package com.hand.msscbrewery.service;

import com.hand.msscbrewery.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements  CustomerService{
    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder().id(UUID.randomUUID()).build();
    }
}

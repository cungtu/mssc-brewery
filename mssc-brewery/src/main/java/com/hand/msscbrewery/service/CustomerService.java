package com.hand.msscbrewery.service;

import com.hand.msscbrewery.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;


public interface CustomerService {

    CustomerDTO getCustomerById(UUID customerId);
}

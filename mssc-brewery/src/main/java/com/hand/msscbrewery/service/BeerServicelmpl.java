package com.hand.msscbrewery.service;

import com.hand.msscbrewery.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class BeerServicelmpl implements BeerService{
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public BeerDTO save(BeerDTO beerDTO) {
        return BeerDTO.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void update(BeerDTO beerDTO) {
        beerDTO.builder().id(beerDTO.getId()).beerName("Update").build() ;
    }
}

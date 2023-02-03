package com.hand.msscbrewery.service;

import com.hand.msscbrewery.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
      BeerDTO getBeerById(UUID beerId);
      BeerDTO save(BeerDTO beerDTO);

      void update(BeerDTO beerDTO);
}

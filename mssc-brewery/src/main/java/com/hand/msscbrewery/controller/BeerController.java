package com.hand.msscbrewery.controller;

import com.hand.msscbrewery.model.BeerDTO;
import com.hand.msscbrewery.service.BeerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
    private BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDTO> getBeer(@PathVariable("beerId") UUID beerId)
    {
        return  new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity handlePost(BeerDTO beerDTO)
    {
        BeerDTO savedBeer=  beerService.save(beerDTO);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", "/api/v1/beer/"+ savedBeer.getId().toString());
        return new ResponseEntity(httpHeaders,HttpStatus.CREATED) ;
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(BeerDTO beerDTO)
    {
        beerService.update(beerDTO);
        return new ResponseEntity(HttpStatus.NO_CONTENT) ;
    }

}

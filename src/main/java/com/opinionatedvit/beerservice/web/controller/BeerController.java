package com.opinionatedvit.beerservice.web.controller;

import com.opinionatedvit.beerservice.web.model.BeerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDTO> getBeerById(@PathVariable("beerId") UUID beerId) {

        //todo impl
        return new ResponseEntity<>((BeerDTO.builder().build()), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HttpStatus> saveBeer(@RequestBody BeerDTO beerDTO) {
        //todo impl
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<HttpStatus> updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDTO beerDTO) {
        //todo impl
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

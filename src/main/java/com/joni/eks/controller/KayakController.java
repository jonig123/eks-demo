package com.joni.eks.controller;

import com.joni.eks.models.Kayak;
import com.joni.eks.repositories.KayakRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/kayaks")
public class KayakController {

    private final KayakRepository kayakRepository;

    @Autowired
    public KayakController(KayakRepository kayakRepository) {
        this.kayakRepository = kayakRepository;
    }

    @PostMapping()
    public @ResponseBody
    Mono<Kayak> addKayak(@RequestBody Kayak kayak) {
        return kayakRepository.save(kayak);
    }

    @GetMapping()
    public @ResponseBody
    Flux<Kayak> getAllKayaks() {
        Flux<Kayak> result = kayakRepository.findAll();
        return result;
    }
}

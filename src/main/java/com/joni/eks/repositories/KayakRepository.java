package com.joni.eks.repositories;

import com.joni.eks.models.Kayak;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface KayakRepository extends ReactiveMongoRepository<Kayak, Long> {
}
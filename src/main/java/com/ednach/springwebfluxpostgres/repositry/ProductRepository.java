package com.ednach.springwebfluxpostgres.repositry;

import com.ednach.springwebfluxpostgres.model.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ReactiveCrudRepository<Product, Integer> {
}

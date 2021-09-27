package com.example.CassandraDemoProject.repository;

import com.example.CassandraDemoProject.model.Customer;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Repository
public interface CustomerRepository extends ReactiveCassandraRepository<Customer, Long> {


    @AllowFiltering
    Flux<Customer> findByageLessThan(int age);
}

package com.challenge.counter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.counter.entity.Counter;

/**
 * CounterRepository
 * 
 * @author ramanjanelu.k
 *
 */
@Repository
public interface CounterRepository extends JpaRepository<Counter, Long> {

}

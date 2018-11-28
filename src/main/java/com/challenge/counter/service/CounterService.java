package com.challenge.counter.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.counter.entity.Counter;
import com.challenge.counter.repository.CounterRepository;

/**
 * CounterService
 * 
 * @author ramanjanelu.k
 * 
 */
@Service
public class CounterService {

	@Autowired
	private CounterRepository counterRepository;
	
	/**
	 *  Method gets counter value
	 *  
	 * @return int
	 */
	public int getCounterValue() {
		Optional<Counter> counter = counterRepository.findById(1L); 
		return counter.get().getValue();
	}
	
	/**
	 * Method increments the counter value by 1
	 * @param value
	 * 
	 * @return int
	 */
	public int incrementCounter(int value){
		Counter counter = counterRepository.getOne(1L);
		counter.setValue(counter.getValue()+1);
		counterRepository.save(counter);
		return counter.getValue();
	}
	
	/**
	 * Method increments the counter value by 1
	 * @param value
	 * @return int
	 */
	public int decrementCounter(int value){
		Counter counter = counterRepository.getOne(1L);
		counter.setValue(counter.getValue()-1);
		counterRepository.save(counter);
		return counter.getValue();
	}
	
}

package com.challenge.counter.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.counter.dto.Counter;
import com.challenge.counter.service.CounterService;

/**
 * CounterController
 * 
 * @author ramanjanelu.k
 *
 */
@RestController
public class CounterController {

	@Autowired
	private CounterService counterService;

	int counter = 0;
	
	/**
	 * gets counter value
	 * 
	 * @return int
	 */
	@GetMapping("getCounterValue")
	public int counterValue() {
		int counterValue = counterService.getCounterValue();
		return counterValue;
	}
	
	/**
	 * Increments counter value
	 *  
	 * @param count
	 * @param request
	 * @return int
	 */
	@PostMapping("increment")
	public int incrementCounter(@RequestBody(required = true) Counter count, HttpServletRequest request){
		if(count.getCount() == 1) {
			counter = counterService.incrementCounter(count.getCount());
		}
		return counter;
	}
	
	/**
	 * Decrements count value
	 * 
	 * @param count
	 * @param request
	 * @return int
	 */
	@PostMapping("decrement")
	public int decrementCounter(@RequestBody(required = true) Counter count, HttpServletRequest request){
		if(count.getCount() == 1) {
			counter = counterService.decrementCounter(count.getCount());
		}
		return counter;
	}
}

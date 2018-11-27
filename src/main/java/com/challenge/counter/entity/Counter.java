package com.challenge.counter.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Counter Entity class
 * @author ramanjanelu.k
 *
 */
@Entity
@Table(name="counter")
public class Counter {

	/**
	 * id
	 */
	@Id
	@GeneratedValue
	private Long id;
	/**
	 * value
	 */
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Counter [id=" + id + ", value=" + value + "]";
	}
	
}

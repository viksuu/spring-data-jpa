package com.viksuutechie.spring.boot.data.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

/**
 * @author vkumar
 *
 */

@ToString
@Entity
@Table(name = "LAPTOP")
public class Laptop implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LAPTOP_ID", unique = true, nullable = false)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getLapCode() {
		return lapCode;
	}

	public void setLapCode(String lapCode) {
		this.lapCode = lapCode;
	}

	public Boolean getIsAssigned() {
		return isAssigned;
	}

	public void setIsAssigned(Boolean isAssigned) {
		this.isAssigned = isAssigned;
	}

	private String brand;

	private String lapCode;
	
	private Boolean isAssigned;

	
	
}

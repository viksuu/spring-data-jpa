package com.viksuutechie.spring.boot.data.jpa.dto;

import java.io.Serializable;

import lombok.Data;


@Data
public class LaptopDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String brand;

	private String lapCode;

	private Boolean isAssigned;

}

package com.viksuutechie.spring.boot.data.jpa.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AddressDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String landmark;
	private Long pincode;
	
	
	
}

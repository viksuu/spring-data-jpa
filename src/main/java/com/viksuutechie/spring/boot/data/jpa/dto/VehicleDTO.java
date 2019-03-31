package com.viksuutechie.spring.boot.data.jpa.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class VehicleDTO implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String vehicleNo;
	
	private Integer employeeId;

	/*
//	@JsonIgnore
	private Employee employee;
*/
}

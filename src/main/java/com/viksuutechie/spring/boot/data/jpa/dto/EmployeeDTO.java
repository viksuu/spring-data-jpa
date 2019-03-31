package com.viksuutechie.spring.boot.data.jpa.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class EmployeeDTO implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String employee_name;


	// ONE TO ONE
	private Integer laptopId;

	// ONE TO MANY
	private List<VehicleDTO> vehicle;
	
	
	private List<EmailIdDTO> emailId ;

	// MANY TO MANY
	private List<AddressDTO> addresses;
	
	
	@JsonIgnore
	private LaptopDTO laptop;
	
}

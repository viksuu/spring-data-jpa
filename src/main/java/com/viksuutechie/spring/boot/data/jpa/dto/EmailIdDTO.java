package com.viksuutechie.spring.boot.data.jpa.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class EmailIdDTO {

	private Integer id;
	
	private String username;
	
	private String email_id;

	private Integer employeeId;
	
	@JsonIgnore
	private EmployeeDTO employeeDTO;
}

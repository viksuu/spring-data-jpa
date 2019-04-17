package com.viksuutechie.spring.boot.data.jpa.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@Data
@JsonInclude(value = Include.NON_NULL)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class BaseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1205734701907560150L;
	
	@JsonIgnore
	private LocalDateTime createdOn;

	@JsonIgnore
	private String createdBy;

	@JsonIgnore
	private LocalDateTime modifiedOn;

	@JsonIgnore
	private String modifiedBy;

}

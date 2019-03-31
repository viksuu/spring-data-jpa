package com.viksuutechie.spring.boot.data.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

/**
 * @author vkumar
 *
 */
@Data
@ToString
@Entity
@Table(name = "VEHICLE")
public class Vehicle implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VEHICLE_ID", unique = true, nullable = false)
	private Integer id;

	@Column(name = "VEHICLE_NO", unique = true, nullable = false)
	private String vehicleNo;
	

/*	
 	@ManyToOne(fetch = FetchType.LAZY)
 	private Employee employee;
*/
	
	@Column(name="EMPLOYEE_ID")
	private Integer employeeId;

}

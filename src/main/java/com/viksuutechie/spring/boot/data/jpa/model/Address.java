package com.viksuutechie.spring.boot.data.jpa.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "ADDRESS")
public class Address implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ADDRESS_ID", unique = true, nullable = false)
	private int id;

	
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String landmark;
	private Long pincode;

	@JoinTable(name = "employee_address", joinColumns = {@JoinColumn(name = "ADDRESS_ID", referencedColumnName = "ADDRESS_ID")}, inverseJoinColumns = {@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID")})
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Employee> employee;


}

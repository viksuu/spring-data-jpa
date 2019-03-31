package com.viksuutechie.spring.boot.data.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

/**
 * @author vkumar
 *
 */
@Data
@Entity
@Table(name = "EMAIL_ID", uniqueConstraints = @UniqueConstraint(columnNames = { "EMAIL_ID", "USERNAME" }))
public class EmailId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer id;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="EMAIL_ID")
	private String email_id;
	
	@Column(name="EMPLOYEE_ID", insertable = false, updatable = false)
	private Integer employeeId;
	
	@ManyToOne
	@JoinColumn(name="EMPLOYEE_ID")
	private Employee employee;
	
	

}

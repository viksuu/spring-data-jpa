package com.viksuutechie.spring.boot.data.jpa.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author vkumar
 *
 */
@Data
@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPLOYEE_ID", unique = true, nullable = false)
	private Integer id;

	@Column(name = "EMPLOYEE_NAME", unique = false, nullable = false, columnDefinition = "VARCHAR(100)")
	private String employee_name;

	@Column(name = "LAPTOP_ID", nullable = false)
	private Integer laptopId;

	// ONE TO ONE
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LAPTOP_ID", insertable = false, updatable = false, referencedColumnName = "LAPTOP_ID")
	private Laptop laptop;

	// ONE TO MANY - Uni directional
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "EMPLOYEE_ID")
	private List<Vehicle> vehicle;

	// ONE TO MANY - Bi directional
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy="employee",orphanRemoval= true)
	private List<EmailId> emailId = new ArrayList<>();

	// MANY TO MANY
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "EMPLOYEE_ADDRESS", joinColumns = @JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID"), inverseJoinColumns = @JoinColumn(name = "ADDRESS_ID", referencedColumnName = "ADDRESS_ID"))
	private List<Address> addresses;

	
/*	
	 public void addEmailAddress(EmailId email) {
		 emailId.add(email);
		 email.setEmployee(this);
	    }
	 
	    public void removeEmailAddress(EmailId email) {
	        emailId.remove(emailId);
	        email.setEmployee(null);
	    }*/
}

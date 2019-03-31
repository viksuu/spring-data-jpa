package com.viksuutechie.spring.boot.data.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viksuutechie.spring.boot.data.jpa.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	Employee findByLaptopLapCode(String lapCode);
	Employee findByVehicleVehicleNo(String vehicleNo);
//	Employee findByLaptopIsAssignedTrue();

}

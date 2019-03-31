
package com.viksuutechie.spring.boot.data.jpa.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.viksuutechie.spring.boot.data.jpa.dto.EmployeeDTO;
import com.viksuutechie.spring.boot.data.jpa.model.Employee;

/**
 * @author vkumar
 *
 */

@Mapper(componentModel="spring" ,uses = { VehicleMapper.class, AddressMapper.class,LaptopMapper.class,EmailIdMapper.class })
public interface EmployeeMapper {

//	@Mapping(target = "laptopId", source = "laptop.id")
	EmployeeDTO employeeToEmployeeDTO(Employee employee);

//	@Mapping(source = "laptopId", target = "laptop.id")
	Employee employeeDTOToEmployee(EmployeeDTO employeeDTO);

	List<Employee> listEmployeeDTOToEmployee(List<EmployeeDTO> employeesDto);

	List<EmployeeDTO> listEmployeeToEmployeeDTO(List<Employee> employees);

}
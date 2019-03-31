package com.viksuutechie.spring.boot.data.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viksuutechie.spring.boot.data.jpa.dto.EmployeeDTO;
import com.viksuutechie.spring.boot.data.jpa.mapper.AddressMapper;
import com.viksuutechie.spring.boot.data.jpa.mapper.EmployeeMapper;
import com.viksuutechie.spring.boot.data.jpa.model.EmailId;
import com.viksuutechie.spring.boot.data.jpa.model.Employee;
import com.viksuutechie.spring.boot.data.jpa.repository.EmployeeRepository;

@Service
public class EmployeeBusiness {

	@Autowired
	private EmployeeRepository empRepo;

	@Autowired
	private EmployeeMapper employeeMapper;

	@Autowired
	AddressMapper addressMapper;

	public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {

	
		
		Employee employeeModel = employeeMapper.employeeDTOToEmployee(employeeDTO);
	/*	List<Employee> employeeList = new ArrayList<>();

		for (Address address : employeeModel.getAddresses()) {
			employeeList.add(employeeModel);
			address.setEmployee(employeeList);
		}*/

		for(EmailId e:employeeModel.getEmailId() ) {
			e.setEmployee(employeeModel);
		}
	
		
		/*
		 * //setting employee to every bike object 
		 * for(Vehicle v : employeeModel.getVehicle())
		 *  { v.setEmployee(employeeModel); }
		 */

		
		employeeModel = empRepo.save(employeeModel);

		employeeDTO = employeeMapper.employeeToEmployeeDTO(employeeModel);

		return employeeDTO;
		
	}

	public List<EmployeeDTO> getAllEmployee() {
		List<Employee> allEmployeeEntity = empRepo.findAll();

		return allEmployeeEntity == null ? null :employeeMapper.listEmployeeToEmployeeDTO(allEmployeeEntity);
	}

	public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO) {
		Employee employee = employeeMapper.employeeDTOToEmployee(employeeDTO);
		employee = empRepo.saveAndFlush(employee);

		return employee == null ? null : employeeMapper.employeeToEmployeeDTO(employee);
	}

	
	public EmployeeDTO getByLaptopCode(String lapCode) {
		Employee employee = empRepo.findByLaptopLapCode(lapCode);
		return employeeMapper.employeeToEmployeeDTO(employee);
	}
	
	public EmployeeDTO getByVehicleNo(String vehicleNo) {
		Employee employee = empRepo.findByVehicleVehicleNo(vehicleNo);
		return employeeMapper.employeeToEmployeeDTO(employee);
	}
}

package com.viksuutechie.spring.boot.data.jpa.v1.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viksuutechie.spring.boot.data.jpa.dto.EmployeeDTO;
import com.viksuutechie.spring.boot.data.jpa.service.EmployeeBusiness;

/**
 * @author vkumar
 *
 */
@RestController
@RequestMapping("/employee")
public class EmployeeResources {

	
	
	@Autowired
	private EmployeeBusiness service;
	
	
	@PostMapping
	public EmployeeDTO addEmployee(@RequestBody EmployeeDTO employeeDTO) {
		return service.saveEmployee(employeeDTO);
	}
	
	@GetMapping
	public List<EmployeeDTO> getAllEmployee() {
		
		return service.getAllEmployee();
	}
	
	@PutMapping
	public EmployeeDTO updateEmployee(@RequestBody EmployeeDTO employeeDTO) {
		
		return service.updateEmployee(employeeDTO);
	}
	
	@GetMapping("/laptop/{lapCode}")
	public EmployeeDTO getByLaptopCode(@PathVariable("lapCode") String lapCode) {
		return service.getByLaptopCode(lapCode);
	}
	
	@GetMapping("/vehicle/{vehicleNo}")
	public EmployeeDTO getByVehicleNo(@PathVariable("vehicleNo") String vehicleNo) {
		return service.getByVehicleNo(vehicleNo);
	}
}


/**
 
{
    "employee_name": "Vikash",
    "laptopId" : 2,
    "vehicle" : [{
    	"vehicleNo" : "bh-415" 
    }],
    "emailId" :[{
    	"username" :"pika",
    	"email_id": "pika@chika.com"
    	
    },
    {
    	"username" :"dhum",
    	"email_id": "dhum@dham.com"
    	
    }],
    "addresses": [
      {
        "addressLine1": "abcd",
        "addressLine2": "abcd",
        "city": "Patna",
        "landmark": "kbagh",
        "pincode": 23453
      },
      {
        "addressLine1": "abcd",
        "addressLine2": "abcd",
        "city": "Patna",
        "landmark": "kbagh",
        "pincode": 23455
      }
    ]
 }

 */


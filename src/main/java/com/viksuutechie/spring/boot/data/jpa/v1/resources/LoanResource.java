package com.viksuutechie.spring.boot.data.jpa.v1.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viksuutechie.spring.boot.data.jpa.dto.LoanDTO;
import com.viksuutechie.spring.boot.data.jpa.service.LoanBusinessService;

/**
 * Class that provides end points to manage
 * {@link LoanResource} data.
 * 
 * @author vkumar
 *
 */
@RestController
@RequestMapping("v1/loan")
public class LoanResource {

	@Autowired
	private LoanBusinessService loanBusinessService;

	/**
	 * Method for saving the {@link LoanDTO} object.
	 * 
	 * @param LoanDTO
	 * @return Returns saved {@link LoanDTO} object.
	 */
	@PostMapping
	public LoanDTO createLoan(@RequestBody LoanDTO loanDTO) {
	
			loanDTO = loanBusinessService.createLoan(loanDTO);
		
		return loanDTO;
	}

	/**
	 * 
	 * Method for updating the {@link LoanDTO} object.
	 * @param loanDTO
	 * @return Returns the updated {@link LoanDTO} object.
	 */
	@PutMapping
	public LoanDTO updateLoan(@RequestBody LoanDTO loanDTO) {		

			loanDTO = loanBusinessService.updateLoan(loanDTO);
		
		return loanDTO;
	}

	
	/**
	 * Method for getting the employee loan {@link List} by client code and employee code
	 * 
	 * @param employeeCode
	 * @return Returns {@link List} of {@link LoanDTO} object.
	 */
	@GetMapping(path="/employee/{employee_code}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public List<LoanDTO> getLoanByEmployeeCode( @PathVariable("employee_code") String employeeCode)
		{
		List<LoanDTO> loanDTO = null;

			loanDTO = loanBusinessService.getLoanByEmployeeCode(employeeCode);
		
		return loanDTO;
	}


	/**
	 * Method for getting the Loan by Loan Number
	 *  
	 * @param loanNumber
	 * @return LoanDTO {@link LoanDTO} object.
	 */
	@GetMapping(path="/{loan_number}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public LoanDTO getLoanByLoanNumber( @PathVariable("loan_number") String loanNumber)
		{
		LoanDTO loanDTO = null;
	
			loanDTO = loanBusinessService.getLoanByLoanNumber(loanNumber);
		
		return loanDTO;
	}

	

}

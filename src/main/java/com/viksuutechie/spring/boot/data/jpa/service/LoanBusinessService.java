package com.viksuutechie.spring.boot.data.jpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viksuutechie.spring.boot.data.jpa.dto.LoanDTO;
import com.viksuutechie.spring.boot.data.jpa.mapper.LoanMapper;
import com.viksuutechie.spring.boot.data.jpa.model.Loan;
import com.viksuutechie.spring.boot.data.jpa.repository.EmployeeRepository;
import com.viksuutechie.spring.boot.data.jpa.repository.LoanRepository;

/**
 * 
 * Class that publish the behavior provided by {@link LoanBusinessService}
 * interface
 * 
 * @author vkumar
 *
 */
@Service
public class LoanBusinessService {

	@Autowired
	private LoanRepository loanRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private LoanMapper loanMapper;

	public LoanDTO createLoan(LoanDTO loanDTO) {
		Loan loan = null;
		try {
			/* validate and save employee activity */

			loan = loanMapper.loanDTOToLoan(loanDTO);

			loan = loanRepository.saveAndFlush(loan);

		} catch (Exception e) {

			System.out.println("LoanBusiness:::");
		}

		return loanMapper.loanToLoanDTO(loan);
	}

	@Transactional
	public LoanDTO updateLoan(LoanDTO loanDTO) {
		Loan loan = null;
		try {

			loan = loanMapper.loanDTOToLoan(loanDTO);
			loan = loanRepository.saveAndFlush(loan);

		} catch (Exception e) {

		}

		return loanMapper.loanToLoanDTO(loan);
	}

	public List<LoanDTO> getLoanByEmployeeCode(String employeeCode) {

		List<Loan> loans = null;
		try {

			loans = loanRepository.findByEmployeeCodeIgnoreCase(employeeCode);

		} catch (Exception e) {

		}

		return loanMapper.loanListToLoanDTOList(loans);
	}

	public LoanDTO getLoanByLoanNumber( String loanNumber) {
		Loan loan = null;
		try {
			/* validate and save employee activity */

			loan = loanRepository.findByLoanNumber( loanNumber);
		} catch (Exception e) {
			
		}
		return loanMapper.loanToLoanDTO(loan);
	}



}

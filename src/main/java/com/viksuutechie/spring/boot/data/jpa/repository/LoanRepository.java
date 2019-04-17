package com.viksuutechie.spring.boot.data.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.viksuutechie.spring.boot.data.jpa.model.Loan;


/**
 *  * Interface that publishes the methods to persist {@link Loan}
 * information.
 * 
 * @author vkumar
 *
 */
@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {

//	List<Loan> findByEmployeeCodeIgnoreCase(String employeeCode);

	Loan findByLoanNumber(String loanNumber);

	@Query(value = "select new com.viksuutechie.spring.boot.data.jpa.model.Loan(id, loanNumber, totalPaybackAmount, isActive, loanReason, deductionAmount, totalRepaidAmount) from Loan where employeeCode=?2")
	List<Loan> findByEmployeeCodeIgnoreCase(String employeeCode);



}

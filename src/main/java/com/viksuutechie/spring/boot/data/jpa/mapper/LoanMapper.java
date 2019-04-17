package com.viksuutechie.spring.boot.data.jpa.mapper;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.apache.commons.collections4.CollectionUtils;

import com.viksuutechie.spring.boot.data.jpa.dto.LoanDTO;
import com.viksuutechie.spring.boot.data.jpa.dto.PaymentHistoryDTO;
import com.viksuutechie.spring.boot.data.jpa.model.Loan;
import com.viksuutechie.spring.boot.data.jpa.model.PaymentHistory;



@Mapper(componentModel="spring",nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface LoanMapper {

	@Mapping(target = "isActive", source = "status")
	public Loan loanDTOToLoan(LoanDTO loanDTO);

	@Mapping(target = "status", source = "isActive")
	public LoanDTO loanToLoanDTO(Loan loan);
	
	public PaymentHistoryDTO paymentHistoryToPaymentHistoryDTO(PaymentHistory paymentHistory);
	public PaymentHistory paymentHistoryDTOToPaymentHistory(PaymentHistoryDTO paymentHistory);

	public default List<LoanDTO> loanListToLoanDTOList(List<Loan> loan) {
		return CollectionUtils.isNotEmpty(loan)
				? loan.stream().map(m -> loanToLoanDTO(m)).collect(Collectors.toList())
				: Collections.emptyList();
	}

	public default List<Loan> loanDTOListToLoanList(List<LoanDTO> loanDTO) {
		return CollectionUtils.isNotEmpty(loanDTO)
				? loanDTO.stream().map(m -> loanDTOToLoan(m)).collect(Collectors.toList())
				: Collections.emptyList();
	}
}

package com.viksuutechie.spring.boot.data.jpa.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class LoanDTO {
	
	
	private static final long serialVersionUID = 1L;

	private long id;
	
	private String loanNumber;
	
	private BigDecimal loanAmount;
	
	private BigDecimal interestAmount;
	
	private String clientCode;
	
	private BigDecimal totalPaybackAmount;
	
	private String loanDate;
	
	private String loanReason;
	
	private BigDecimal deductionFrequency;
	
	private BigDecimal deductionAmount;
	
	private String deductionStartDate;
	
	private String deductionEndDate;
	
	private String deductionCode;
	
	private BigDecimal totalRepaidAmount;
		
	private Boolean status;
	
	private String employeeCode;
	
	private List<PaymentHistoryDTO> paymentHistory;
	
	
	private long employeeId;
	
	private long version;
}

package com.viksuutechie.spring.boot.data.jpa.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class PaymentHistoryDTO  {
	
	
	
    private long id;
	
	private LocalDateTime paymentDate;
	
	private String voucherNumber;
	
	private BigDecimal amountPaid;
	
	private BigDecimal outstandingBalance;
	
	private long loanId;
	
	private Boolean isManualPayment;
	
	private long version;
}

package com.viksuutechie.spring.boot.data.jpa.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "PaymentHistory")
@Entity
public class PaymentHistory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "PAYMENT_DATE", nullable = false)
	private LocalDateTime paymentDate;
	
	@Column(name = "VOUCHER_NUMBER", nullable = false)
	private String voucherNumber;
	
	@Column(name = "AMOUNT_PAID", nullable = false)
	private BigDecimal amountPaid;
	
	@Column(name = "IS_MANUAL_PAYMENT", nullable = false)
	private Boolean isManualPayment = Boolean.FALSE;
	
	@Column(name = "OUTSTANDING_BALANCE", nullable = false)
	private BigDecimal outstandingBalance;
	
	@Column(name = "LOAN_ID")
	private long loanId;
	
	@ManyToOne
	@JoinColumn(name = "LOAN_ID", insertable = false, updatable = false)
	private Loan loan;
	
}

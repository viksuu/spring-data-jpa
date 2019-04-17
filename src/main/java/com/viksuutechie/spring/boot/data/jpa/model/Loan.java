package com.viksuutechie.spring.boot.data.jpa.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name = "Loan", uniqueConstraints = @UniqueConstraint(columnNames = { "LOAN_NUMBER"}))
@Entity
public class Loan  {


	public Loan(long id, String loanNumber, BigDecimal totalPaybackAmount, Boolean isActive, String loanReason,
			BigDecimal deductionAmount, BigDecimal totalRepaidAmount) {
		super();
		this.id= id;
		this.loanNumber = loanNumber;
		this.totalPaybackAmount = totalPaybackAmount;
		this.isActive = isActive;
		this.loanReason = loanReason;
		this.deductionAmount = deductionAmount;
		this.totalRepaidAmount = totalRepaidAmount;
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "LOAN_NUMBER", nullable = false)
	private String loanNumber;
	
	@Column(name = "CLIENT_CODE", updatable = false, length = 30)
	private String clientCode;
	
	@Column(name = "LOAN_AMOUNT", nullable = false)
	private BigDecimal loanAmount;
	
	@Column(name = "INTEREST_AMOUNT", nullable = false)
	private BigDecimal interestAmount;
	
	@Column(name = "TOTAL_PAYBACK_AMOUNT", nullable = false)
	private BigDecimal totalPaybackAmount;
	
	@Column(name = "IS_ACTIVE", nullable = false)
	private Boolean isActive = Boolean.TRUE;
	
	@Column(name = "LOAN_DATE")
	private String loanDate;
	
	@Column(name = "LOAN_REASON")
	private String loanReason;
	
	@Column(name = "DEDUCTION_FREQUENCY", nullable = false)
	private Integer deductionFrequency;
	
	@Column(name = "DEDUCTION_AMOUNT", nullable = false)
	private BigDecimal deductionAmount;
	
	@Column(name = "DEDUCTION_START_DATE")
	private String deductionStartDate;
	
	@Column(name = "DEDUCTION_END_DATE")
	private String deductionEndDate;
	
	@Column(name = "DEDUCTION_CODE", nullable = false, length = 30)
	private String deductionCode;
	
	@Column(name = "TOTAL_REPAID_AMOUNT")
	private BigDecimal totalRepaidAmount;
	
	@Column(name = "EMPLOYEE_ID",  nullable = false)
	private Integer employeeId;
	
	/*@ManyToOne
	@JoinColumn(name = "EMPLOYEE_ID", insertable = false, updatable = false, nullable = false)
	private Employee employee;*/
	
	@OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
	@JoinColumn(name = "LOAN_ID")
	private List<PaymentHistory> paymentHistory;

}

package com.cda.pinfo.domain;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Table("pinfo.expense")
public class Expense {
	@Id
	@Column("expense_id")
	private Integer expenseId;
	@Column("expense_name")
	private String expenseName;
	@Column("billing_start_day")
	private Integer billingStartDay;
	@Column("billing_end_day")
	private Integer billingEndDay;
	@Column("billing_due_day")
	private Integer billingDueDay;
	@Column("frequency")
	private Character frequency;
	@Column("estimated_amount")
	private Float estimatedAmount;
	@Column("notes")
	private String notes;
	@Column("date_created")
	private LocalDate dateCreated;
	@Column("date_updated")
	private LocalDate dateUpdated;
	@Column("date_effective")
	private LocalDate dateEffective;
	@Column("date_expiration")
	private LocalDate dateExpiration;
}

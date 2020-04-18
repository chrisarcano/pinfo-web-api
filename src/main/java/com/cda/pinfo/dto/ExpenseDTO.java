package com.cda.pinfo.dto;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExpenseDTO {
	private Integer expenseId;
	private String expenseName;
	private Integer billingStartDay;
	private Integer billingEndDay;
	private Integer billingDueDay;
	private Character frequency;
	private Float estimatedAmount;
	private String notes;
	private LocalDate dateCreated;
	private LocalDate dateUpdated;
	private LocalDate dateEffective;
	private LocalDate dateExpiration;
}

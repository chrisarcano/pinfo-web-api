package com.cda.pinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cda.pinfo.dto.ExpenseDTO;
import com.cda.pinfo.exception.PInfoException;
import com.cda.pinfo.repo.ExpenseRepository;

import reactor.core.publisher.Flux;

@Service
public class ExpenseServiceBasic implements ExpenseService {
	
	@Autowired
	private ExpenseRepository expenseRepository;

	@Override
	public Flux<ExpenseDTO> getExpenses() throws PInfoException {
		return expenseRepository
				.findAll()
				.map( o -> ExpenseDTO
						.builder()
						.expenseId(o.getExpenseId())
						.expenseName(o.getExpenseName())
						.build()
				);
	}

}

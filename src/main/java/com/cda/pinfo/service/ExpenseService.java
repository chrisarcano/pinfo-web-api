package com.cda.pinfo.service;

import com.cda.pinfo.dto.ExpenseDTO;
import com.cda.pinfo.exception.PInfoException;

import reactor.core.publisher.Flux;

public interface ExpenseService {
	
	public Flux<ExpenseDTO> getExpenses() throws PInfoException;
}

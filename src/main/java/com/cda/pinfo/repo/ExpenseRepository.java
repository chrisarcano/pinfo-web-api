package com.cda.pinfo.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.cda.pinfo.domain.Expense;

public interface ExpenseRepository extends ReactiveCrudRepository<Expense,Integer>{}

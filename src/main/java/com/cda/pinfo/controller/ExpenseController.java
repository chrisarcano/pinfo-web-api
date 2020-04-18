package com.cda.pinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cda.pinfo.dto.ExpenseDTO;
import com.cda.pinfo.exception.PInfoException;
import com.cda.pinfo.service.ExpenseService;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import reactor.core.publisher.Flux;

@OpenAPIDefinition(
    info =
        @Info(
            title = "Expense Management",
            description = "Management of Expense Information",
            version = "1.0",
            contact = @Contact(name = "Christian Arcano", email = "christian.arcano@gmail.com")))
@RestController
@RequestMapping("/expense")
public class ExpenseController {

  @Autowired private ExpenseService expenseService;

  @Operation(summary = "Get Expenses", description = "Get Expenses")
  @ApiResponse(
      responseCode = "200",
      description = "Successfully retrieved list of Expenses",
      content =
          @Content(
              mediaType = "application/json",
              schema = @Schema(implementation = ExpenseDTO.class)))
  @ApiResponse(responseCode = "500", description = "No data", content = @Content)
  @GetMapping
  public Flux<ExpenseDTO> getExpenses() throws PInfoException {
    return expenseService.getExpenses();
  }
}

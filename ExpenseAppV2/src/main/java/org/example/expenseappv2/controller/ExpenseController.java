package org.example.expenseappv2.controller;


import org.example.expenseappv2.model.dto.Expense;
import org.example.expenseappv2.service.ExpenseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    public void createExpense(@RequestBody Expense expense){
        expenseService.createExpense(expense);
    }
}

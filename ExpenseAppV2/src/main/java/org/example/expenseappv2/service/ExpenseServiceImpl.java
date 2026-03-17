package org.example.expenseappv2.service;

import org.example.expenseappv2.model.dto.Expense;
import org.example.expenseappv2.repo.ExpenseRepo;
import org.springframework.stereotype.Service;

@Service
public class ExpenseServiceImpl implements ExpenseService{


    private final ExpenseRepo expenseRepo;

    public ExpenseServiceImpl(ExpenseRepo expenseRepo) {
        this.expenseRepo = expenseRepo;
    }

    @Override
    public void createExpense(Expense expense) {
        Expense expense1 = new Expense();
        expense1.setAmount(expense.getAmount());
        expense1.setCategory(expense.getCategory());
        expense1.setDescription(expense.getDescription());
        expense1.setDate(expense.getDate());

        expenseRepo.save(expense1);

    }
}

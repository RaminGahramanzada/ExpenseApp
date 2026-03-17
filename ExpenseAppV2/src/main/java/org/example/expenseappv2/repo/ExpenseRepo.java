package org.example.expenseappv2.repo;

import org.example.expenseappv2.model.dto.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepo extends JpaRepository<Expense,Long> {
}

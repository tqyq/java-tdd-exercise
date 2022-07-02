package com.odde.tdd;

import java.time.YearMonth;
import java.util.List;

public interface BudgetRepo {
    List<Budget> findAll();

    long countBudget(YearMonth start, YearMonth end);
}

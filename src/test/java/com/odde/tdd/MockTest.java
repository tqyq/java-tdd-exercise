package com.odde.tdd;

import org.junit.Test;

import java.time.YearMonth;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockTest {
    @Test
    public void mock_repo() {
        BudgetRepo repo = mock(BudgetRepo.class);
        when(repo.findAll()).thenReturn(Arrays.asList(new Budget(YearMonth.of(2018, 11), 1000)));
        assertEquals(1, repo.findAll().size());
    }

    @Test
    public void mock_count_budget() {
        BudgetRepo repo = mock(BudgetRepo.class);
        long budget = 7000;
        YearMonth start = YearMonth.of(2022, 1);
        YearMonth end = YearMonth.of(2022, 7);
        when(repo.countBudget(start, end)).thenReturn(budget);
        assertEquals(budget, repo.countBudget(start, end));
    }
}

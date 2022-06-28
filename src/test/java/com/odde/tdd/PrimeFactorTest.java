package com.odde.tdd;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PrimeFactorTest {

    PrimeFactor primeFactor = new PrimeFactor();

    @Test
    public void factorize_1() {
        List<Integer> factors = primeFactor.factorize(1);
        assertTrue(factors.isEmpty());
    }

    @Test
    public void factorize_24() {
        List<Integer> factors = primeFactor.factorize(24);
        assertEquals("[2, 2, 2, 3]", factors.toString());
    }

    @Test
    public void factorize_max_int() {
        List<Integer> factors = primeFactor.factorize(Integer.MAX_VALUE);
        assertEquals("[2147483647]", factors.toString());
    }
}

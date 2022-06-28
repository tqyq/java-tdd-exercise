package com.odde.tdd;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class FizzBuzzDemoTest {

    FizzBuzzDemo fizzBuzzDemo;

    @Before
    public void setup() {
        fizzBuzzDemo = new FizzBuzzDemo();
    }

    @Test
    public void multiples_of_3() {
        String result = fizzBuzzDemo.fizzBuzz(3);
        assertEquals(FizzBuzzDemo.FIZZ, result);
    }

    @Test
    public void multiples_of_5() {
        String result = fizzBuzzDemo.fizzBuzz(5);
        assertEquals(FizzBuzzDemo.BUZZ, result);
    }

    @Test
    public void multiples_of_3_5() {
        String result = fizzBuzzDemo.fizzBuzz(15);
        assertEquals(FizzBuzzDemo.FIZZ_BUZZ, result);
    }

    @Test
    public void not_is_3_5() {
        String result = fizzBuzzDemo.fizzBuzz(1);
        assertEquals("1", result);
    }
}

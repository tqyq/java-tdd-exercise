package com.odde.tdd;

public class FizzBuzzDemo {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public String fizzBuzz(int i) {
        String result = "";
        if (i % 3 == 0 && i % 5 == 0) {
            return FIZZ_BUZZ;
        } else if (i % 3 == 0) {
            return FIZZ;
        } else if (i % 5 == 0) {
            return BUZZ;
        } else {
            return String.valueOf(i);
        }
    }
}

package com.odde.tdd;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public List<Integer> factorize(int n) {
        List<Integer> factors = new ArrayList<>();
        if (n > 1) {
            for (int i = 2; i <= n / 2 + 1; i++) {
                while (n != i) {
                    if (n % i == 0) {
                        factors.add(i);
                        n = n / i;
                    } else {
                        break;
                    }
                }
            }
            factors.add(n);
        }
        return factors;
    }

}

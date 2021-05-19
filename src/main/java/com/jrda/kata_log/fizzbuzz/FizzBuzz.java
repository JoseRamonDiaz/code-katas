package com.jrda.kata_log.fizzbuzz;

public class FizzBuzz {
    public String check(Integer i) {
        if (i % 15 == 0)
            return "fizzbuzz";

        if (i % 3 == 0)
            return "fizz";

        if (i % 5 == 0)
            return "buzz";

        return i.toString();
    }
}

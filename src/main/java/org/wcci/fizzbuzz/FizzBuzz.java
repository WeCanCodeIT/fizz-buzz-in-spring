package org.wcci.fizzbuzz;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzz {
    public String interpret(int numberToInterpret) {
        if (numberToInterpret % 3 == 0 && numberToInterpret % 5 == 0) {
            return "FizzBuzz";
        }
        if (numberToInterpret % 3 == 0) {
            return "Fizz";
        }
        if (numberToInterpret % 5 == 0) {
            return "Buzz";
        }
        if(numberToInterpret %7 ==0){
            return "Bang";
        }
        return "" + numberToInterpret;
    }
}

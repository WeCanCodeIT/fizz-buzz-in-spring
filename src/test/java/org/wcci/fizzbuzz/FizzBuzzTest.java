package org.wcci.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz underTest;

    @BeforeEach
    void setUp() {
        underTest = new FizzBuzz();
    }

    @Test
    public void oneShouldOne(){
        assertFizzBuzz(1,"1");
    }

    @Test
    public void twoReturnsTwo(){
        assertFizzBuzz(2, "2");
    }
    @Test
    public void threeReturnsFizz(){
        assertFizzBuzz(3, "Fizz");
    }
    @Test
    public void fiveReturnsBuzz(){
        assertFizzBuzz(5, "Buzz");
    }
    @Test
    public void sixReturnsFizz(){
        assertFizzBuzz(6, "Fizz");
    }
    @Test
    public void tenReturnsBuzz(){
        assertFizzBuzz(10, "Buzz");
    }
    @Test
    public void fifteenShouldReturnFizzBuzz(){
        assertFizzBuzz(15, "FizzBuzz");
    }
    @Test
    public void thirtyShouldReturnFizzBuzz(){
        assertFizzBuzz(30, "FizzBuzz");
    }
    private void assertFizzBuzz(int numberToInterpret, String expectedString) {
        String result = underTest.interpret(numberToInterpret);
        assertEquals(expectedString, result);
    }
}

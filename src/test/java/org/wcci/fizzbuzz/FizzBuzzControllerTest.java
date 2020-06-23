package org.wcci.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class FizzBuzzControllerTest {

    /*
    Ask for a range of numbers, print the result of fizzbuzz for each number
    in the range using a fizzBuzz object and thymeleaf.
     */
    @Test
    public void shouldAddFizzBuzzResultsToTheModel(){
        //Arrangement
        FizzBuzz mockFizzBuzz = mock(FizzBuzz.class);
        FizzBuzzController underTest = new FizzBuzzController(mockFizzBuzz);
        Model mockModel = mock(Model.class);
        when(mockFizzBuzz.interpret(1)).thenReturn("1");

        underTest.displayFizzBuzzGame(1,1, mockModel);

        verify(mockFizzBuzz).interpret(1);
        verify(mockModel).addAttribute("spokenWords", Collections.singletonList("1"));

    }
    @Test
    public void shouldAddFizzBuzzResultsToTheModelFor1To2(){
        //Arrangement
        FizzBuzz mockFizzBuzz = mock(FizzBuzz.class);
        FizzBuzzController underTest = new FizzBuzzController(mockFizzBuzz);
        Model mockModel = mock(Model.class);
        when(mockFizzBuzz.interpret(1)).thenReturn("1");
        when(mockFizzBuzz.interpret(2)).thenReturn("2");

        underTest.displayFizzBuzzGame(1,2, mockModel);

        verify(mockFizzBuzz).interpret(1);
        verify(mockFizzBuzz).interpret(2);
        verify(mockModel).addAttribute("spokenWords", List.of("1", "2"));

    }
    @Test
    public void shouldReturnProperViewName(){
        FizzBuzz mockFizzBuzz = mock(FizzBuzz.class);
        FizzBuzzController underTest = new FizzBuzzController(mockFizzBuzz);
        Model mockModel = mock(Model.class);

        String viewName = underTest.displayFizzBuzzGame(1,1, mockModel);
        assertEquals("fizzbuzz-template", viewName);
    }
}

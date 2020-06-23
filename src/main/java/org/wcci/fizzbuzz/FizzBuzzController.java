package org.wcci.fizzbuzz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Collection;
@Controller
public class FizzBuzzController {
    private FizzBuzz fizzBuzz;

    public FizzBuzzController(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }
    @GetMapping("/fizzBuzz/{startingNumber}/{endingNumber}")
    public String displayFizzBuzzGame(@PathVariable int startingNumber,
                                      @PathVariable int endingNumber, Model model) {
        Collection<String> spokenWords = new ArrayList<>();

        for(int i = startingNumber; i<=endingNumber; i++){
            spokenWords.add(fizzBuzz.interpret(i));
        }
        model.addAttribute("spokenWords", spokenWords);
        return "fizzbuzz-template";
    }
}

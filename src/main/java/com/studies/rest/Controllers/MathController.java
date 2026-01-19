package com.studies.rest.Controllers;

import com.studies.rest.services.MathMethods;
import com.studies.rest.util.MathTriage;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    MathMethods methods = new MathMethods();

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
        @PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        return methods.sum(numberOne, numberTwo);
    }

    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction (
        @PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo
    ) throws Exception{
        return methods.subtraction(numberOne, numberTwo);
    }

    @RequestMapping("/multiplier/{numberOne}/{numberTwo}")
    public Double multiplier(
        @PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo
    ) throws Exception{
        return methods.multiplier(numberOne, numberTwo);
    }

    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(
        @PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo
    ) throws Exception{
        return methods.division(numberOne, numberTwo);
    }

    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(
        @PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo
    ) throws Exception{
        return methods.mean(numberOne, numberTwo);
    }

    @RequestMapping("/square/{numberOne}")
    public Double square(
        @PathVariable("numberOne") String numberOne
    ) throws Exception{
        return methods.square(numberOne);
    }


}

package com.studies.rest.services;

import com.studies.rest.util.MathTriage;
import org.springframework.web.bind.annotation.PathVariable;

public class MathMethods {
    MathTriage m = new MathTriage();
    public Double sum(String numberOne, String numberTwo) throws Exception {
        m.numberFlag(numberOne,numberTwo);
        return m.convertToDouble(numberOne) + m.convertToDouble(numberTwo);
    }
    public Double subtraction(String numberOne, String numberTwo) throws Exception{
        m.numberFlag(numberOne,numberTwo);
        return m.convertToDouble(numberOne) - m.convertToDouble(numberTwo);
    }
    public Double multiplier(String numberOne, String numberTwo) throws Exception{
        m.numberFlag(numberOne,numberTwo);
        return m.convertToDouble(numberOne) * m.convertToDouble(numberTwo);
    }
    public Double division(String numberOne, String numberTwo) throws Exception{
        m.numberFlag(numberOne,numberTwo);
        return m.convertToDouble(numberOne)/m.convertToDouble(numberTwo);
    }
    public Double mean(String numberOne, String numberTwo) throws Exception{
        m.numberFlag(numberOne,numberTwo);
        return (m.convertToDouble(numberOne) + m.convertToDouble(numberTwo))/2;
    }
    public Double square(String number) throws Exception {
        m.numberFlag(number);
        return Math.sqrt(m.convertToDouble(number));
    }
}

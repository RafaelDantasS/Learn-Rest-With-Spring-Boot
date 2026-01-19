package com.studies.rest.util;

public class MathTriage {

    public Double convertToDouble(String number) {
        if(number == null) return 0D;
        return Double.parseDouble(number);
    }

    private boolean isNumeric(String strNumber){
        if (strNumber == null) return true;
        String number = strNumber.replaceAll("," , ".");
        return !number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }


    public boolean numberFlag(String numberOne) throws Exception {
        if (this.isNumeric(numberOne))
            throw new UnsupportedOperationException("Please set a numeric value!");
        else return true;
    }

    public boolean numberFlag(String numberOne, String numberTwo) throws Exception {
        if (this.isNumeric(numberOne) || this.isNumeric(numberTwo))
            throw new UnsupportedOperationException("Please set a numeric value!");
        else return true;
    }
}


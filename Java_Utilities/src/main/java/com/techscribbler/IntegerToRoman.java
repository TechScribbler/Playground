package com.techscribbler;

public class IntegerToRoman {

    public String intToRoman(Integer value) {
        String grand = "";
        while (value != 0) {
            if (value >= 1000) {
                grand = grand + "M";
                value = value - 1000;
            }
            else if (value >= 500) {
                if (value >= 900) {
                    grand = grand + "CM";
                    value = value - 900;
                } else {
                    grand = grand + "D";
                    value = value - 500;
                }
            }
            else if (value >= 100) {
                if(value >=400){
                    grand=grand +"CD";
                    value=value-400;
                }else{
                    grand = grand + "C";
                    value = value - 100;
                }
            }
            else if (value >= 50) {
                if (value >= 90) {
                    grand = grand + "XC";
                    value = value - 90;
                } else {
                    grand = grand + "L";
                    value = value - 50;
                }
            }
            else if (value >= 10) {
                if (value >= 40) {
                    grand = grand + "XL";
                    value = value - 40;
                } else {
                    grand = grand + "X";
                    value = value - 10;
                }
            }
            else if (value >= 5) {
                if (value >= 9) {
                    grand = grand + "IX";
                    value = value - 9;
                } else {
                    grand = grand + "V";
                    value = value - 5;
                }
            }
            else if (value >= 1) {
                if (value >= 4) {
                    grand = grand + "IV";
                    value = value - 4;
                } else {
                    grand = grand + "I";
                    value = value - 1;
                }
            }
        }
        return grand;
    }
}

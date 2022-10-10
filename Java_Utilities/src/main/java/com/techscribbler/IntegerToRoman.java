package com.techscribbler;


public class IntegerToRoman {
    static String[] romanArray= new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    static Integer[] valArray=new Integer[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
    public String intToRoman(Integer value) {
        String grand = "";
        for (int index=0;index<valArray.length;index++) {
            while(true){
                if(value>=valArray[index]){
                    value=value-valArray[index];
                    grand=grand.concat(romanArray[index]);
                }else{
                    break;
                }
            }
        }
        return grand;
    }

}





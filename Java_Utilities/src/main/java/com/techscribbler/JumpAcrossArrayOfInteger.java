package com.techscribbler;

import java.util.ArrayList;
import java.util.List;

public class JumpAcrossArrayOfInteger {


    Boolean isFailure=false;
    public Boolean jump(Integer[] intArray){
        int index=0;
        List<Integer> parsedArray = new ArrayList<>();
        while(index< intArray.length){
            if(parsedArray.contains(index) || intArray[index]==0 || index<0 ){
                return Boolean.FALSE;
            }
            parsedArray.add(index);
            index= index+intArray[index];
        }
        return Boolean.TRUE;
    }
}

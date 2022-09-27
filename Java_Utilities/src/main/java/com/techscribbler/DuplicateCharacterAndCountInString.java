package com.techscribbler;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterAndCountInString {
    Map<Character, Integer> charMap;
    public void find(String str) {
        charMap= new HashMap<Character,Integer>();
        Character[] chString = str.chars().mapToObj(c->(char)c).toArray(Character[]::new);
        for(Character ch: chString){
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            }else {
                charMap.put(ch, 1);
            }
        }
        charMap.entrySet().stream().filter(e1-> e1.getValue()>1).forEach(System.out::println);
    }
}
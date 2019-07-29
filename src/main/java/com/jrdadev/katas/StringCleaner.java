package com.jrdadev.katas;

public class StringCleaner {
    public String clean(String inString){
        if(inString.length() == 0 || inString.length() == 1){
            return inString;
        }

        if(inString.charAt(0) == inString.charAt(1)){
            return clean(inString.substring(1, inString.length()));
        }else{
            return inString.charAt(0) + clean(inString.substring(1, inString.length()));
        }

    }
}

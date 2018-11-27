package com.hiya.se.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClient
{
    public static void main(String[] args)
    {
        String input = "1df@164.comm";
        String regex = "[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+";
        boolean result = RegexContext.check((e1,e2) ->{      return e1.matches(e2);     }, input, regex);
        System.out.println(result);
        
        result = RegexContext.check((e1,e2) ->
        {    
            Pattern p = Pattern.compile(e2);
            Matcher m = p.matcher(e1);
            return m.find();
        }, input, regex);
        System.out.println(result);
        
        result = RegexContext.check((e1,e2) ->{      return e1.matches(e2);     }, "2327233656","^\\d+$");
        System.out.println(result);
    }
}

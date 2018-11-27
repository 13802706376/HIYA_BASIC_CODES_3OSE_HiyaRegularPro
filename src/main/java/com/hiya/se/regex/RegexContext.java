package com.hiya.se.regex;

public class RegexContext
{
    public  static boolean check(ICheck ic,String input,String regex)
    {
          return ic.check(input, regex);
    }
}

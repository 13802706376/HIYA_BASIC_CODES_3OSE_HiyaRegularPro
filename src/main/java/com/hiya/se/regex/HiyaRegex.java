package com.hiya.se.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class HiyaRegex
{
    public static void patternCompile(String content)
    {
        String reg = "[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(content);
        while (m.find())
        {
            print(m.group());
        }
    }

    /***
     * 分组
     */
    public static void patternCompile2()
    {
        Pattern p = Pattern.compile("(\\d{3,5})([a-z]{2})");// 整个第0组，3到5位的数字1组，两个小写字母2组，这里共3组,
        String s = "1212ss-453bb-223ccc-23fdfd-deefeffe324";
        Matcher m = p.matcher(s);
        while (m.find())
        {
            print(m.group(0));// 匹配第0组
            print(m.group(1));
            print(m.group(2));
        }
    }

    /***
     * 字符串替换
     */
    public static void replaceAll()
    {
        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);// 忽略大小写
        Matcher matcher = pattern.matcher("Java java JAva JaVa I love Java youHate JAVA asasfd dda");
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (matcher.find())
        {// 把匹配到的字符串，第技术
            i++;
            if (i % 2 == 0)
            {
                matcher.appendReplacement(sb, "JAVA");
            } else
            {
                matcher.appendReplacement(sb, "java");
            }
            print(matcher.group());
        }
        matcher.appendTail(sb);// 把尾部没有匹配的字符串加上
        print(sb);
        print(matcher.replaceAll("JAVA"));// 匹配到的全部替换为答谢的java
    }

    public static void print(Object obj)
    {
        System.out.println(obj);
    }
}

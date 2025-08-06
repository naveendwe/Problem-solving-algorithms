package com.second;

public class First1 {
    public static void main(String[] args) {
        String s = "hello";
        char[] ch = new char[s.length()];
        for(int i = 0;i<s.length();i++){
            ch[i] = s.charAt(s.length()-1-i);
        }
        System.out.println(new String(ch));
    }

}

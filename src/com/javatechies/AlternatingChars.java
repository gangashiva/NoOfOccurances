package com.javatechies;

public class AlternatingChars {

  public static void main(String[] args) {
    String str1 = "ABABAB";
    String str2 = "AAB";
    String str3 = "AAAAAAABBBBBBBBB";
    System.out.println(alternatingCharactors(str2));
    System.out.println(alternatingCharactors(str1));
    System.out.println(alternatingCharactors(str3));
  }

  public static int alternatingCharactors(String s) {
    int count = 0;
    for (int i = 0; i < s.length()-1; i++) {
      if (s.charAt(i) == s.charAt(i + 1)) {
        count++;
      }
    }
    return count;
  }
}
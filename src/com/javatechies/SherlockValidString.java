package com.javatechies;

public class SherlockValidString {

  public static void main(String[] args) {
    String s1 = "abcdefghhgfedecba";
    String s2 = "abcc";
    String s3 = "aabbcd";
    String s4 = "aabbccddeefghi";

    System.out.println(isValid(s1));
    System.out.println(isValid(s2));
    System.out.println(isValid(s3));
    System.out.println(isValid(s4));


  }

  public static String isValid(String s) {
    char first = s.charAt(0);
    long count = s.chars().filter(value -> value == first).count();

    if (s.chars().distinct().filter(value -> s.chars().filter(value2 -> value == value2).count() != count).count() > 1) {
      return "NO";
    }

    return "YES";
  }

  }

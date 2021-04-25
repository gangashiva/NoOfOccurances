package com.javatechies;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NoOfOccurance {

  public static void main(String[] args) {
    System.out.println("Please enter any string");
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    System.out.println(findNoOfOccurances(str));
  }

  public static Map<Character, Integer> findNoOfOccurances(String s){
    Map<Character, Integer> map = new HashMap<>();
    char c;
    for(int i=0; i<s.length(); i++){
      c = s.charAt(i);
      if(map.get(c)==null){
        map.put(c,1);
      }
      else{
        int number = map.get(c);
        number++;
        map.put(c,number);
      }
    }
    return map;
  }


}

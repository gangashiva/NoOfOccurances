package com.javatechies;

public class StringRotation {

  public static void main(String[] args) {
    System.out.println(isSubString("water",null));
    System.out.println(isSubString("water","terwa"));
    System.out.println(isSubString("water","erwat"));
    System.out.println(isSubString("water","rwate"));
    System.out.println(isSubString("water","water"));
    System.out.println(isSubString("water","atewr"));
  }

  public static boolean isSubString(String originalStr, String rotatedStr) {
    boolean result = false;
    String resultStr;
    if (rotatedStr !=null && rotatedStr.length()<=originalStr.length() ){
      resultStr = originalStr.concat(originalStr);
      if (resultStr.contains(rotatedStr)) {
        result = true;
      }
    }
    return result;
  }
}

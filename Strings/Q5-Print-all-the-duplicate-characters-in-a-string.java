package Strings;
import java.util.*;

class Solution {
   
  static void printDups(String str)
  {
    Map<Character, Integer> hm = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {

      if(hm.containsKey(str.charAt(i)))
        hm.put(str.charAt(i) , hm.get(str.charAt(i))+1); 

      else hm.put(str.charAt(i),1); 
    }

    for (Map.Entry<Character,Integer> mapElement : hm.entrySet()) {    
      if (mapElement.getValue() > 1)  

        System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
    }
  } 
  public static void main(String args[])
  {
    String str = "test string";
    printDups(str);
  }
} 

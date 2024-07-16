package Strings;

class Solution {
    public int strStr(String s1, String s2) {//s1 =haystack, s2=needle
        if(s2.length() == 0) return 0;
        if(s1.length() == -1) return-1;

        for(int i = 0; i < s1.length(); i++){
            if(i + s2.length() > s1.length()) break;

            for(int j =0; j < s2.length(); j++){

                if(s1.charAt(i+j) != s2.charAt(j)) break;
                
                if(j == s2.length()-1) return i;
            }
        }
        return -1;
    }
}
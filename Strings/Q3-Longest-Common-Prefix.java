package Strings;
import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String start = strs[0];
        String end = strs[strs.length-1];

        StringBuilder sb = new StringBuilder();
        int minLen = Math.min(start.length(), end.length());

        for(int i =0; i < minLen; i++){
            if(start.charAt(i) == end.charAt(i)){
                sb.append(start.charAt(i));
            }
            else{
                return sb.toString();
            }
        }
        return sb.toString();
    }
}
//242. Valid anagarm
package Java_Programming;
import java.util.*;
public class Leetcode02 {
    public boolean isAnagram(String s, String t) {
        int a[]=new int[26],f=0;
        if(s.length()!=t.length()) return false;
            for(int i=0;i<s.length();i++){
                a[s.charAt(i)-'a']++;
                a[t.charAt(i)-'a']--;
            }
            for(int i:a){
                if(i!=0){
                    return false;
                }
            }
            return true;         
    }
}

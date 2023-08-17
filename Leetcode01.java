//Find the index of the first occurrence in a string
package Java_Programming;
import java.util.*;
public class Leetcode01 {
    public int strStr(String haystack, String needle) {
        int a=needle.length(),f=0,k=0;
        for(int i=0;i<=haystack.length()-a;i++){
            if(haystack.substring(i,a+i).equals(needle)){
                f=1;
                k=i;
                break;
            }
        }
        if(f==0){
            return -1;
        }else{
            return k;
        }   
    }
    
}

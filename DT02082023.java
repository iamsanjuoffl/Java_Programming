//common characters with same index
package Java_Programming;
import java.util.*;
public class DT02082023 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a=0;
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        String s1=s[0];
        for(int i=0;i<s1.length();i++) {
            for (int j = 0; j < n; j++) {
                for (int k = i; k < s[j].length(); k++) {
                    if (s1.charAt(i) == s[j].charAt(k)) {
                        a++;
                        break;
                    }
                }
            }
            if (a == n) {
                System.out.print(s1.charAt(i));
            }
            a = 0;
        }
    
}

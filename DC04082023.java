//print the pair of one consonant and a vowel in a string
package Java_Programming;
import java.util.*;
public class DC04082023 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next(),s1="aeiouAEIOU";
		for(int i=0;i<s.length()-1;i++){
		    if(!s1.contains(String.valueOf(s.charAt(i))) && s1.contains(String.valueOf(s.charAt(i+1)))){
		        System.out.print(s.charAt(i)+""+s.charAt(i+1)+" ");
		    }
		}

	}
}

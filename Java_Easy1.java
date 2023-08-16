//Common word from the string
package Java_Programming;
import java.util.*;
public class Java_Easy1 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next(),s2=sc.next();
		for(int i=0;i<s1.length();i++){
		    if(s1.substring(s1.length()-1-i,s1.length()).equals(s2.substring(0,i+1))){
		        System.out.print(s2.substring(0,i+1));
		        break;
		    }
		}
	}
}

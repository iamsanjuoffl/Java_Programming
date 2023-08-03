//toggle the case of first n characters in reverse
package Java_Programming;
import java.util.*;
public class DT03082023 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		String s1=s.substring(0,n);
		for(int i=s1.length()-1;i>=0;i--){
		    if(Character.isUpperCase(s.charAt(i))){
		        System.out.print(Character.toLowerCase(s.charAt(i)));
		    }else{
		        System.out.print(Character.toUpperCase(s.charAt(i)));
		    }
		}
	}    
}

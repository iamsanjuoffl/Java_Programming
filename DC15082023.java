//Mask email
package Java_Programming;
import java.util.*;
public class DC15082023 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next(),s1="1234567890aeiouAEIOU";
		for(int i=0;i<s.length();i++){
		    if(s1.contains(s.charAt(i)+"")){
		        System.out.print("+");
		    }else{
		        System.out.print(s.charAt(i));
		    }
		}

	}
}

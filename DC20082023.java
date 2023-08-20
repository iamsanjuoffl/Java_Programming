// mo(ssn)on => monsson , fo(abto)ll => football
package Java_Programming;
import java.util.*;
public class DC20082023 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int a=0,b=0;
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)=='('){
		        a=i;
		    }
		    if(s.charAt(i)==')'){
		        b=i;
		        break;
		    }
		}
		StringBuilder sb=new StringBuilder(s.substring(a+1,b));
		sb.reverse();
		System.out.print(s.substring(0,a)+""+sb+""+s.substring(b+1,s.length()));
	}
}

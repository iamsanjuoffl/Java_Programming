/*accept a string with a and b and the replace with 1 and 0,
 then find the integer value*/
package Java_Programming;
import java.util.*;
public class DC11082023 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuffer sb=new StringBuffer();;
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)=='a'){
		        sb.append("1");
		    }else{
		        sb.append("0");
		    }
		}
		System.out.print(Integer.parseInt(String.valueOf(sb),2));
	}
}

//swap the first occuring odd number and first occuring even number
package Java_Programming;
import java.util.*;
public class DT07082023 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuffer sb=new StringBuffer();
		int b=0,d=0;
		char c=' ',e=' ';
		for(int i=s.length()-1;i>=0;i--){
		    int a=Character.getNumericValue(s.charAt(i));
		    if(a%2==0){
		        b=i;
		        c=s.charAt(i);
		    }
		    if(a%2!=0){
		        d=i;
		        e=s.charAt(i);
		    }
		}
		for(int i=0;i<s.length();i++){
		    if(i==b){
		        sb.append(e);
		    }else if(i==d){
		        sb.append(c);
		    }else{
		        sb.append(s.charAt(i));
		    }
		}
		System.out.print(Integer.parseInt(String.valueOf(sb)));
	}
}

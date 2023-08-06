//Unit digits replaced by 0 and print the modified integer
package Java_Programming;
import java.util.*;
public class DC06082023 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuffer sb=new StringBuffer();
		char c=s.charAt(s.length()-1);
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)==c){
		        sb.append("0");
		    }else{
		        sb.append(s.charAt(i));
		    }
		}
		System.out.print(Integer.parseInt(String.valueOf(sb)));
    }
}

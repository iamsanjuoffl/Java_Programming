/*accept the string and a char , then print the string whithout the occurence
of the character*/
package Java_Programming;
import java.util.*;
public class DC12082023 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c=sc.next().charAt(0);
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)==c){
		        continue;
		    }else{
		        System.out.print(s.charAt(i));
		    }
		}
	}
}

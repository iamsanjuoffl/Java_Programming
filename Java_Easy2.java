//Character b follows a
package Java_Programming;
import java.util.*;
public class Java_Easy2 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char a=sc.next().charAt(0),b=sc.next().charAt(0);
		int c=0;
		for(int i=0;i<s.length()-1;i++){
		    if(s.charAt(i)==a && s.charAt(i+1)==b){
		        c++;
		    }
		}
		System.out.print(c);

	}
}

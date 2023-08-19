/*accept the input and convert into binary
 * the combine the ones in that binary and
 * find its decinal value
 */
package Java_Programming;
import java.util.*;
public class DC19082023 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=Integer.toBinaryString(n);
		String s1="";
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)=='1'){
		        s1+=s.charAt(i);
		    }
		}
		System.out.print(Integer.parseInt(s1,2));

	}
}

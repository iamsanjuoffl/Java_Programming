/*accept the integer n and see print the value of k which satisfies
the equation 2^k+1 or 2^k-1*/
package Java_Programming;
import java.util.*;
public class DT16082023 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),f=0;
		for(int i=0;i<n;i++){
		    if(Math.pow(2,i)+1==n || Math.pow(2,i)-1==n){
		        System.out.print(i);
		        f=1;
		        break;
		    }
		}
		if(f==0){
		    System.out.print("NO");
		}
	}
}

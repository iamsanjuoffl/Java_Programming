/* inp = 6;
1 6 6 6 6 6 6
2 2 5 5 5 5 5
3 3 3 4 4 4 4 */

package Java_Programming;
import java.util.*;
public class DC10082023 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1,b=n;
		for(int i=0;i<n/2;i++){
		    for(int j=0;j<=i;j++){
		        System.out.print(a);
		    }
		    a++;
		    for(int j=0;j<b;j++){
		        System.out.print(b);
		    }
		    b--;
		    System.out.println();
		}
	}
}

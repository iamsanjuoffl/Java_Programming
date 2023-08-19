//print the sum of corner elements
package Java_Programming;
import java.util.*;
public class Java_Easy4 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        a[i][j]=sc.nextInt();
		    }
		}
		System.out.print(a[0][0]+a[0][n-1]+a[n-1][0]+a[n-1][n-1]);
	}
}

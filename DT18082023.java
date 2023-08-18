//Increasing triangle pattern of fibonacci series
package Java_Programming;
import java.util.*;
public class DT18082023 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n+1];
		a[0]=0;
		a[1]=1;
		for(int i=0;i<=n;i++){
		    if(i>1){
		        a[i]=a[i-2]+a[i-1];
		    }
		}
		for(int i=0;i<n;i++){
		    System.out.print("0 ");
		    for(int j=1;j<=i+1;j++){
		        System.out.print(a[j]+" ");
		    }
		    System.out.println();
		}
	}
}

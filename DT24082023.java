//accepet n integers and print the sum of the numbers 
//which are less than the number
package Java_Programming;
import java.util.*;
public class DT24082023 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),sum=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    int b=a[i];
		    for(int j=i;j<n;j++){
		        if(b>a[j]){
		            sum+=a[j];
		        }
		    }
		    System.out.print(sum+" ");
		    sum=0;
		}

	}
}

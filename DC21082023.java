/*
 * Cyclone
 * 2
 * 1 3
 * 7 5
 * OUTPUT - cyCleno
 */
package Java_Programming;
import java.util.*;
public class DC21082023 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c[]=s.toCharArray();
		int n=sc.nextInt(),a[]=new int[n*2],p=0,q=0;
		char temp=' ';
		for(int i=0;i<n*2;i++){
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<n*2;i=i+2){
		    p=a[i];
		    q=a[i+1];
		    for(int j=0;j<c.length;j++){
		        if(j==p-1){
		            temp=c[p-1];
		            c[p-1]=c[q-1];
		            c[q-1]=temp;
		        }   
		    }
		}
		for(char i:c){
		    System.out.print(i);
		}
	}
}

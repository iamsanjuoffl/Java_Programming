// anticlock rotation
package Java_Programming;
import java.util.*;
public class DC22082023 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c[]=s.toCharArray();
		int n=sc.nextInt();
		for(int j=0;j<n;j++){
		    for(int i=0;i<c.length-1;i++){
		        char temp=c[i];
		        c[i]=c[i+1];
		        c[i+1]=temp;
		    
		    }
		}
		for(char i:c){
		    System.out.print(i);
		}
	}
}

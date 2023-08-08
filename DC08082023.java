//accepet 2 integers and print the first 10 multiples of the largest number
package Java_Programming;
import java.util.*;
public class DC08082023 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(),y=sc.nextInt();
		int a=(x>y)?x:y;
		for(int i=1;i<=10;i++){
		    System.out.print(i*a+" ");
		}
	}
}

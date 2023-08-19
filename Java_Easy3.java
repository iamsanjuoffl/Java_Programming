/*given 3 ap terms and get n as user input
 * , then find the nth term of the AP
 */
package Java_Programming;
import java.util.*;
public class Java_Easy3 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
		int arr[]=new int[d];
		int e=c-b;
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		for(int i=3;i<d;i++){
		    arr[i]=arr[i-1]+e;
		}
		System.out.print(arr[d-1]);
	}
}

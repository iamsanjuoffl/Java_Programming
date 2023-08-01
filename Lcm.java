//LCM of two numbers
package Java_Programming;
import java.util.*;
public class Lcm {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt();
        int a=(m>n)?m:n;
        while(true){
            if(a%n==0 && a%m==0){
                System.out.print(a);
                break;
            }
            a++;
        }
    }
}

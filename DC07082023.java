//print the sum of even numbers and average of odd numbers in the given list of integers
package Java_Programming;
import java.util.*;
public class DC07082023 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,sum1=0,sum2=0,b=0,f1=0,f2=0;
        List<Integer> al=new ArrayList<>();
        while(sc.hasNext()){
            al.add(sc.nextInt());
        }
        for(int i:al){
            if(i%2!=0 && i!=0){
                a++;
                sum1+=i;
                f1=1;
            }else if(i%2==0 && i!=0){
                sum2+=i;
                f2=1;
            }
        }
        float d1=(float)sum1/a;
        if(f2==0){
            System.out.println("-1");
        }else{
            System.out.println(sum2);
        }
        if(f1==0){
            System.out.print("-1");
        }else{
            System.out.printf("%.1f",d1);
        }
    } 
}

//divide the string n times and find the maximum number
package Java_Programming;
import java.util.*;
public class TCS05082023 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int max=0,k=0;
        StringBuffer sb=new StringBuffer();
        int n=sc.nextInt();
        int b=n-1;
        int c=s.length()-b;
        for(int i=0;i<=s.length()-c;i++){
            for(int j=i;j<i+c;j++){
                sb.append(s.charAt(j));
            }
            k=Integer.parseInt(String.valueOf(sb));
            if(k>max){
                max=k;
            }
            sb.delete(0,sb.length());
        }
        System.out.print(max);
    }
}

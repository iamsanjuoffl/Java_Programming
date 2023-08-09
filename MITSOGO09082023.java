//add the sum of every possible integers in the string and find the sum total of it
package Java_Programming;
import java.util.*;
public class MITSOGO09082023 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //System.out.print(s.length());
        int sum=0,fsum=0,s2=0,c=0;
        for(int i=0;i<s.length();i++){
            c=Integer.parseInt(s.charAt(i)+"");
            s2+=c;
        }
        for(int i=0;i<s.length()-1;i++){
                int a=Integer.parseInt(s.substring(0,i+1));
                int b=Integer.parseInt(s.substring(i+1,s.length()));
                sum=a+b;
                fsum+=sum;
        }
        System.out.println(s2+fsum+Integer.parseInt(s));
    }
    
}

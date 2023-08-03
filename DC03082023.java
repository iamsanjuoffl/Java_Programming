//swap the first number divisible by x and last number divisible by y
package Java_Programming;
import java.util.*;
public class DC03082023 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int a[]=new int[n];
		int aa=0,bb=0,cc=0,dd=0;
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int x=sc.nextInt(),y=sc.nextInt();
		for(int i=0;i<n;i++){
		    if((a[i]%x==0)){
		        aa=a[i];
		        bb=i;
		        break;
		    }
		}
		for(int j=0;j<n;j++){
		    if(a[j]%y==0){
		        cc=a[j];
		        dd=j;
		    }
		}
		for(int i=0;i<n;i++){
		    if(i==bb){
		        System.out.print(cc+" ");
		    }else if(i==dd){
		        System.out.print(aa+" ");
		    }else{
		        System.out.print(a[i]+" ");
		    }
		}
	}
}

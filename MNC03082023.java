//count the value of every vowels and print the string without vowels
package Java_Programming;
import java.util.*;
public class MNC03082023 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1="aeiuoAEIOU",s3=" ";
		StringBuffer sb=new StringBuffer();
		int a=0,b=0,c=0,d=0,e=0,f=0;
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)=='a'||s.charAt(i)=='A'){
		        a++;
		    }else if(s.charAt(i)=='e'||s.charAt(i)=='E'){
		        b++;
		    }else if(s.charAt(i)=='i'||s.charAt(i)=='I'){
		        c++;
		    }else if(s.charAt(i)=='o'||s.charAt(i)=='O'){
		        d++;
		    }else if(s.charAt(i)=='u'||s.charAt(i)=='U'){
		        e++;
		    }
		}
		System.out.println("a: "+a);
		System.out.println("e: "+b);
		System.out.println("i: "+c);
		System.out.println("o: "+d);
		System.out.println("u: "+e);
		for(int i=0;i<s.length();i++){
		    if(!s1.contains(String.valueOf(s.charAt(i))))
		    sb.append(s.charAt(i));
		}
		for(int i=0;i<sb.length();i++){
		    if(s3.contains(String.valueOf(sb.charAt(i)))){
		        f++;
		    }
		}
		String m=String.valueOf(sb);
		String s4[]=m.split("\\s+");
		if(sb.length()==0 || sb.length()==f){
		    System.out.print("-1");
		}else{
		    for(String i:s4){
		        System.out.print(i+" ");
		    }
		}
	}
}

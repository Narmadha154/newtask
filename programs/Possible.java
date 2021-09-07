package logic;
import java.util.*;
public class Possible{
   public static void possible(String str,int i,String newS){
     if(i==str.length()){
        System.out.println(newS);
     }
     int sum=0;
     for(int j=i;j<=Integer.min(i+1,str.length()-1);j++){
       sum=(sum*10)+str.charAt(j);
       System.out.println(sum);
       if(sum>0&&sum<=26){
        // char ch=(char)('A'+(str.charAt(sum)-1));
        // System.out.println(ch);
         possible(str,j+1,newS+((char)('A'+(str.charAt(sum)-1))));
       }
       System.out.println(newS);
     }
  }
   public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string:");
     String str=sc.next();
     String newS="";
     possible(str,0,newS);
   }
}

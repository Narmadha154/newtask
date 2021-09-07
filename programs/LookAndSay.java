package logic;
import java.util.Scanner;
public class LookAndSay{
    public static void main(String [] args){
       // Scanner sc=new Scanner(System.in);
        //System.out.println("Enter the number:");
        int n=5;
        System.out.println(1);
        String s="1";
        int i=1;
        while(i<n){
           String newS="";
           int count=1;
           char a=s.charAt(0);
           for(int j=1;j<s.length();j++){
               if(s.charAt(j)!=s.charAt(j-1)){
                   System.out.print(count+""+a);
                   newS+=""+count+""+a;
                   a=s.charAt(j);
                   count=1;
                }
                else{
                   count++;
                }
             }
             System.out.println(count+""+a);
             newS+=""+count+""+a;
             s=newS;
             i++;
         }
     }
 }
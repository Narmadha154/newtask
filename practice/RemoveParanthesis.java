
package logic;
import java.util.Scanner;
  public class RemoveParanthesis{
    public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string:");
      String str=sc.next();
      char [] ch=str.toCharArray();
      int count=0;
      int newCount=0;
       for(int i=0,j=str.length()-1;i<str.length()&&j>=0;i++,j--){
          if(ch[i]=='('){
              count++;
          }
          if(ch[j]==')'){
            newCount++;
          }
       }
       System.out.println(count);
        System.out.println(newCount); 
   }
 }

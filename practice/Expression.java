
package logic;
import java.util.Scanner;
public class Expression{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string:");
    String str=sc.next();
    int len=str.length();
    int count=0;
    String value=null;
    for(int i=0;i<len;i++){
      if(str.charAt(i)=='('){
         count++;
        }
      else if(str.charAt(i)==')'){
         count--;
        }
      else if(str.charAt(i)=='+'||str.charAt(i)=='*'||str.charAt(i)=='/'||str.charAt(i)=='-'){
        if(str.charAt(i-1)>96&&str.charAt(i-1)<123||str.charAt(i-1)>64&&str.charAt(i-1)<91&&str.charAt(i+1)>96&&str.charAt(i+1)<123||str.charAt(i+1)>64&&str.charAt(i+1)<91){
           value="valid";
         }
       }
      else if(str.charAt(i)>96&&str.charAt(i)<123||str.charAt(i)>64&&str.charAt(i)<91){
        }
      else{
         value="invalid";
       }
    }
    if(value=="valid"&&count==0){
      System.out.println("given mathematical expression is valid");
    }
    else{
     System.out.println("given mathematical expression is invalid");
    }
  }
 }

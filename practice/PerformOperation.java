
package logic;
import java.util.Scanner;
public class PerformOperation{
   public static int removeZero(int num){
       int res=0;
       int d=1;
       while(num>0){
         if(num%10!=0){
            res+=num%10*d;
            d*=10;
         }
         num=num/10;
      }
      return res;
   }
   public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number1:");
      int num1=sc.nextInt();
      System.out.println("Enter the number2:");
      int num2=sc.nextInt();
      int sum=num1+num2;
      if((removeZero(num1)+removeZero(num2))==(removeZero(sum))){
         System.out.println("equal");
      }
      else{
         System.out.println("not equal");
     }
   }
 }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      

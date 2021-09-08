import java.util.Scanner;
public class Xam{
   public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("ENter the number:");
      int num=sc.nextInt();
      System.out.println("ENter the digit:");
      int digit=sc.nextInt();
      int number=0;
      int rem=0,max=0;
      while(num!=0){
          rem=num%10;
          number=number*10+rem;
          num=num/10;
       }
       System.out.println(number);
       rem=0;
       while(number!=0){
          rem=number%10;
          if(rem==digit){
             while(number!=0){
                 rem=number%10;
                 if(rem>=max){
                max=rem;
             }
             number=number/10;
            }
          }
          else{
          number=number/10;
          }
      } 
      System.out.println("Largest digit is:"+max);
    }
  }

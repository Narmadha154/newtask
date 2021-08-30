

package logic;
import java.util.Scanner;
  public class NumberSystem{
    public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the nth number of the number system:");
      int num=sc.nextInt();
      int [] numberArr=new int[100];
      System.out.println("Enter the number1:");
      int num1=sc.nextInt();
      System.out.println("Enter the number2:");
      int num2=sc.nextInt();
      numberArr[0]=num1;
      numberArr[1]=num2;
      int j=0;
      for(int i=2;i<num;i+=2){
         numberArr[i]=numberArr[j]*10+num1;
         numberArr[i+1]=numberArr[j]*10+num2;
         j++;
      }
      System.out.println("array:");
      for(int i=0;i<num;i++){
        if(numberArr[i]!=0){
          System.out.println(numberArr[i]);
        }
      }
    }
  }

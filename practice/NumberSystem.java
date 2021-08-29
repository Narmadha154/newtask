package logic;
import java.util.Scanner;
  public class NumberSystem{
    public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number 1 :");
      int num1=sc.nextInt();
      System.out.println("Enter the number 2 :");
      int num2=sc.nextInt();
       System.out.println("Enter the size :");
      int size=sc.nextInt();
      int [] numberSystem=new int[size];
      int sum1=0;
      int sum2=0;
      int count=0;
      for(int i=0;i<size;i+=4){
          numberSystem[i]=num1+sum2;
          numberSystem[i+1]=num2+sum2;
          num1=num1*10;
          num2=num2*10;
          sum1=numberSystem[i];
          sum2=numberSystem[i+1];
          numberSystem[i+2]=num1+sum1;
          numberSystem[i+3]=num2+sum1;
          /* num1=num1*10;
          num2=num2*10;
          sum1=numberSystem[i+2];
          sum2=numberSystem[i+3];
          count+=2;*/
      }
      System.out.println("array:");
      for(int i=0;i<size;i++){
          System.out.println(numberSystem[i]);
      }
    }
  }
      
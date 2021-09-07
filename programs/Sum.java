package logic;
import java.util.Scanner;
public class Sum{
   public static int findSum(int [] arr,int length){
      int sum=0;
      for(int i=0;i<length;i++){
           sum=sum+arr[i];
      }
    return sum;
   }
   public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length of an array:");
      int length=sc.nextInt();
      System.out.println("Enter the elements of an array:");
      int [] arr=new int[length];
      for(int i=0;i<length;i++){
         arr[i]=sc.nextInt();
      }
      int sum=findSum(arr,length);
       System.out.println("index is:"+sum);
    }
  }
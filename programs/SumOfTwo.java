package logic;
import java.util.Scanner;
public class SumOfTwo{
public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length of an array:");
      int length=sc.nextInt();
      System.out.println("Enter the elements of an array:");
      int [] arr=new int[length];
      for(int i=0;i<length;i++){
         arr[i]=sc.nextInt();
      }
      System.out.println("Enter the value:");
      int value=sc.nextInt();
      int sum=0,count=0;
      for(int i=0;i<length;i++){
        for(int j=i+1;j<length;j++){
         if((arr[i]+arr[j])==value){
            count++;
            System.out.println(arr[i]+" "+arr[j]);
         }
        }
      }
     System.out.println("*"+count);
   }
 }
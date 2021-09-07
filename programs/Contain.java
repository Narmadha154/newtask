package logic;
import java.util.Scanner;
public class Contain{
public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length of an array:");
      int length=sc.nextInt();
      System.out.println("Enter the elements of an array:");
      int [] arr=new int[length];
      for(int i=0;i<length;i++){
         arr[i]=sc.nextInt();
      }
      System.out.println("Enter the element:");
      int value=sc.nextInt();
      int count=0;
      for(int i=0;i<length;i++){
         if(arr[i]==value){
            count=1;
            //System.out.println("contains");
         }
      }
      if(count==1){
          System.out.println(" contains");
       }
      else{
         System.out.println("not contains");
      }
    }
  }
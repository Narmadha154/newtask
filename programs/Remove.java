package logic;
import java.util.Scanner;
public class Remove{
   public static int[] Removeele(int [] arr,int length,int value){
      int k=0;
      for(int i=0;i<length;i++){
           if(arr[i]!=value){
              arr[k++]=arr[i];
           }
      }
    return arr;
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
      System.out.println("Enter the element:");
      int value=sc.nextInt();
      int [] newArr= Removeele(arr,length,value);
       for(int i=0;i<length-1;i++){
          System.out.println(newArr[i]);
       }
    }
  }
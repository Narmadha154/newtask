package logic;
import java.util.Scanner;
public class MaxMinSort{
public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length of an array1:");
      int length=sc.nextInt();
      System.out.println("Enter the elements of an array1:");
      int [] arr=new int[length];
      for(int i=0;i<length;i++){
         arr[i]=sc.nextInt();
      }
       int temp=0;
      for(int i=1;i<length;i++){
        for(int j=0;j<length-i;j++){
           if(arr[j]>arr[j+1]){
             temp=arr[j];
             arr[j]=arr[j+1];
             arr[j+1]=temp;
           }
        }
      }
      int [] maxMinArr=new int[length];
      for(int i=0,max=length-1,min=0;i<length;i+=2,max--,min++){
       maxMinArr[i]=arr[max];
        if(i+1<length){
           maxMinArr[i+1]=arr[min];
        }
      }
      System.out.println("*");
      for(int i=0;i<length;i++){
           System.out.println(maxMinArr[i]);
      }
  }
}
      
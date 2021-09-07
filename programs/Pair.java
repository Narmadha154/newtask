package logic;
import java.util.*;
public class Pair{
  public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length of an array:");
      int length=sc.nextInt();
      System.out.println("Enter the elements of an array:");
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
      int diff=arr[1]-arr[0];
      int [] newArr=new int[50];
      int k=0;
      for(int i=0;i<length-1;i++){
          for(int j=i+1;j<length;j++){
            if((Math.abs(arr[j]-arr[i]))<diff){
               diff=Math.abs(arr[j]-arr[i]);
               newArr[k++]=arr[i];
               newArr[k++]=arr[j];
            } 
          }
         k=0;
      }
      System.out.println(diff);
      for(int i=0;i<50;i++){
       if(newArr[i]!=0){
       System.out.println(newArr[i]);
       }
      }




   }
}
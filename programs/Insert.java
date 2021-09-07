package logic;
import java.util.Scanner;
public class Insert{
   public static int[] insertEle(int [] arr,int length,int value,int position){
      int k=0;
      int [] newArr=new int[length+1];
      for(int i=0;i<length+1;i++){
          if(i<position){
             newArr[i]=arr[i];
           }
           else if(i==position){
               newArr[i]=value;
           }
           else{
             newArr[i]=arr[i-1];
           }
      }
    return newArr;
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
      System.out.println("Enter the position:");
      int position=sc.nextInt();
      int [] newArr= insertEle(arr,length,value,position);
       for(int i=0;i<length+1;i++){
          System.out.println(newArr[i]);
       }
    }
  }

import java.util.*;
import java.lang.Math;
public class Logic2{
   public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length of the array:");
      int n=sc.nextInt();
      int [] arr=new int[n];
      System.out.println("Enter the array elements:");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int [] newArr=new int[n];
     for(int i=0;i<n;i++){
         newArr[i]=0;
         if(arr[i]%2==0){
            newArr[i]=newArr[i]+3;
          }
         int square=(int) Math.sqrt(arr[i]);
         if(arr[i]==(square*square)){
            newArr[i]=newArr[i]+5;
         }
         if((arr[i]%4==0)&&(arr[i]%6==0)){
           newArr[i]=newArr[i]+4;
         }
     }
     for(int i=0;i<n;i++){
       for(int j=0;j<n-1-i;j++){
          if(newArr[j]>=newArr[j+1]){
             int temp=newArr[j];
             int temp1=arr[j];
             newArr[j]=newArr[j+1];
             arr[j]=arr[j+1];
             newArr[j+1]=temp;
             arr[j+1]=temp1;
         }
      }
    }
     for(int i=0;i<n;i++){
       System.out.println("<"+arr[i]+","+newArr[i]+">");
     }
   }
 }

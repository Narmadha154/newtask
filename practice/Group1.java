package logic;
import java.util.Scanner;
public class Group1{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an array:");
    int size=sc.nextInt();
    int [] arr=new int[size];
    System.out.println("Enter the numbers:");
    for(int i=0;i<size;i++){
      arr[i]=sc.nextInt();
     }
     System.out.println("Enter the divisor:");
     int divisor=sc.nextInt();
      int [] newArr=new int[50];
      int countSize=0;
      int k=0;
      int l=0;
      int [] countArr=new int[15];
     for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
           if((arr[i]+arr[j])%divisor==0){
                 countArr[l]=(arr[i]+arr[j]);
                 newArr[k]=arr[i];
                 newArr[k+1]=arr[j];
                 l++;
                 k+=2;
           }
         }
     }
      System.out.println("count array is:");
      for(int i=0;i<countArr.length;i++){
       if(countArr[i]!=0){
         System.out.println(countArr[i]);
       }
       else{
       }
     }
     System.out.println("new array is:");
      for(int i=0;i<newArr.length;i++){
       if(newArr[i]!=0){
         System.out.println(newArr[i]);
       }
       else{
       }
     }
    for(int i=0;i<countArr.length;i++){
      if(countArr[i]!=0){
        countSize++;
      }
    }
    int newCount=0;
    for(int i=0;i<countSize-1;i++){
      if(countArr[i]==countArr[i+1]){
          newCount++;
       }
    }
    int p=0;
    for(int i=0;i<countSize-1;i++){
      if(countArr[i]!=countArr[i+1]){
          countArr[p++]=countArr[i];
        }
   }
   System.out.println(p);
   int r=p-1;
   while(r!=0){
     if(countArr[countSize-1]!=countArr[r]){
       countArr[p++]=countArr[countSize-1];
     }
     r--;
   }

   p=countSize-newCount;
    System.out.println("count array:");
    for(int i=0;i<p;i++){
       System.out.println(countArr[i]);
    }
   int m=0;
     System.out.println("group array is:");
     for(int i=0;i<p;i++){
        System.out.println(newArr[m]+","+newArr[m+1]);
        m+=2;
       }
  }
}

package logic;
import java.util.Scanner;
public class Group{
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
      int count=0;
      int k=0;
      int l=0;
      int [] countArr=new int[15];
     for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
           if((arr[i]+arr[j])%divisor==0){
               if(l!=0){
                countArr[l]=arr[i]+arr[j];
                for(int p=0;p<l-1;p++){
                 if(countArr[p]!=0){
                  if(countArr[p]!=countArr[p+1]){
                   newArr[k]=arr[i];
                   newArr[k+1]=arr[j];
                   k+=2;
                   count++;
                 }
               }
             }
            }
              else if(l==0){
                  countArr[l]=arr[i]+arr[j];
                  newArr[k]=arr[i];
                  newArr[k+1]=arr[j];
                  k+=2;
                  count++;
              }
               l++;
           }
        }
      }
       System.out.println("count array is:");
      for(int i=0;i<15;i++){
       if(countArr[i]!=0){
         System.out.println(countArr[i]);
       }
       else{
       }
     }
      System.out.println("group is:");
      for(int i=0;i<50;i+=2){
       if(newArr[i]!=0){
         System.out.println(newArr[i]+","+newArr[i+1]);
       }
       else{
       }
     }
   }
 }

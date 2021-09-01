
package logic;
import java.util.Scanner;
public class UnionInt{
   public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of an array 1:");
     int size1=sc.nextInt();
     int [] arr1=new int[size1];
     System.out.println("Enter the elements of array 1:");
     for(int i=0;i<size1;i++){
      arr1[i]=sc.nextInt();
     }
     System.out.println("Enter the size of an array 2:");
     int size2=sc.nextInt();
     int [] arr2=new int[size2];
     System.out.println("Enter the elements of array 2:");
     for(int i=0;i<size2;i++){
      arr2[i]=sc.nextInt();
     }
     int newSize=size1+size2;
     int [] arr3=new int[newSize];
     int p=0;
     for(int i=0;i<size1;i++){
        arr3[p]=arr1[i];
        p++;
     }
     for(int i=0;i<size2;i++){
        arr3[p]=arr2[i];
        p++;
     }
     int temp=0;
     for(int i=1;i<newSize;i++){
       for(int j=0;j<newSize-i;j++){
          if(arr3[j]>arr3[j+1]){
             temp=arr3[j];
             arr3[j]=arr3[j+1];
             arr3[j+1]=temp;
          }
       }
    }
    int k=0;
    int l=0;
    int [] unionArr=new int[100];
    int [] intersectionArr=new int[100];
    for(int i=0;i<newSize-1;i++){
       if(arr3[i]!=arr3[i+1]){
         unionArr[k++]=arr3[i];
        }
      else{
          intersectionArr[l++]=arr3[i+1];
        }
     }
     unionArr[k++]=arr3[newSize-1];
    System.out.println("Union array:");
    for(int i=0;i<k;i++){
      System.out.println(unionArr[i]);
    }
   System.out.println("intersection array:");
    for(int i=0;i<l;i++){
      System.out.println(intersectionArr[i]);
    }
    System.out.println("Except:");
    for(int i=0;i<size1;i++){
      if(arr1[i]%2!=0){
         System.out.println(arr1[i]);
      }
    }
    for(int i=0;i<size2;i++){
       if(arr2[i]%2==0){
          System.out.println(arr2[i]);
       }
    }
  }
}












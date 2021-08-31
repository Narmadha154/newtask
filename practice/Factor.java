

package logic;
import java.util.Scanner;
public class Factor{
   public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of an array:");
     int size=sc.nextInt();
     int [] arr=new int[size];
     int [] countArr=new int[size];
     System.out.println("Enter the numbers:");
     for(int i=0;i<size;i++){
       arr[i]=sc.nextInt();
     }
     for(int i=0;i<size;i++){
        int count=0;
      for(int j=1;j<=arr[i];j++){
        if(arr[i]%j==0){
            count++;
        }
     }
      countArr[i]=count;
    }
 /*   System.out.println("count array:");
    for(int i=0;i<size;i++){
       System.out.println(countArr[i]);
    }*/
    int temp1=0;
    int temp2=0;
    for(int i=1;i<size;i++){
     for(int j=0;j<size-i;j++){
      if(countArr[j]<countArr[j+1]){
          temp1=arr[j];
          temp2=countArr[j];
          arr[j]=arr[j+1];
          countArr[j]=countArr[j+1];
          arr[j+1]=temp1;
          countArr[j+1]=temp2;
      }
    }
   }
   System.out.println("final array:");
    for(int i=0;i<size;i++){
       System.out.println(arr[i]);
    }
  }
 }

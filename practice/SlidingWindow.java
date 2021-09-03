
package logic;
import java.util.Scanner;
public class SlidingWindow{
  public static int [] getSubString(int [] arr,int length,int k){
     int [] newArr=new int[k];
     int [] maxArr=new int[length];
     int newSize=length-k-1;
     int temp=0,q=0;
     for(int i=0;i<newSize;i++){
        int l=i;
         int m=0;
        for(int j=l;j<k;j++){
           newArr[m]=arr[j];
           m++;
       }
       System.out.println("*");
       for(int t=0;t<k;t++){
       System.out.println(newArr[t]);
      }
       for(int n=1;n<k;n++){
         for(int r=0;r<k-n;r++){
            if(newArr[r]>newArr[r+1]){
              temp=newArr[r];
              newArr[r]=newArr[r+1];
              newArr[r+1]=temp;
             }
          }
       }
       /*System.out.println("*");
       for(int t=0;t<k;t++){
       System.out.println(newArr[t]);
      }*/
       maxArr[q]=newArr[k-1];
       q++;
     }
     return maxArr;
   }
        
  public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the length of the array:");
     int length=sc.nextInt();
     int [] arr=new int[length];
     System.out.println("Enter the elements of array:");
     for(int i=0;i<length;i++){
       arr[i]=sc.nextInt();
     }
     System.out.println("Enter the window size:");
     int k=sc.nextInt();
     int [] maxArr=getSubString(arr,length,k);
     System.out.println("array:");
     for(int i=0;i<maxArr.length;i++){
      if(maxArr[i]!=0){
       System.out.println(maxArr[i]);
      }
     }
  }
}

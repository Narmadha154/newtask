package logic;
import java.util.Scanner;
public class IndexOfExtra{
  public int findExtra(int a[], int b[], int n) {
        int index=0;
        int j=0;
        for(int i=0;i<n;i++){
          if(i<n-1){
            if(a[i]!=b[i]){
              index=i;
              break;
            }
          }
          else{
             if(a[i]!=b[i-1]){
              index=i;
             }
          }
        }
        return index;
    }
  public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size:");
     int size=sc.nextInt();
     int [] arr1=new int[size];
     int [] arr2=new int[size-1];
     System.out.println("Enter the elements of array1:");
     for(int i=0;i<size;i++){
       arr1[i]=sc.nextInt();
     }
     System.out.println("Enter the elements of array2:");
     for(int i=0;i<size-1;i++){
       arr2[i]=sc.nextInt();
     }
     System.out.println(findExtra(arr1,arr2));
   }
 }

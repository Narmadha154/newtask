
package logic;
import java.util.Scanner;
public class MisMatch{
  public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the length of the array:");
     int length=sc.nextInt();
     String [] arr1=new String[length];
     String [] arr2=new String[length];
     System.out.println("Enter the elements of array1:");
     for(int i=0;i<length;i++){
       arr1[i]=sc.next();
     }
     System.out.println("Enter the elements of array2:");
     for(int i=0;i<length;i++){
       arr2[i]=sc.next();
     }
     System.out.println("mismatched elements:");
     for(int i=0;i<length;i++){
       if(!arr1[i].equals(arr2[i])){
          System.out.println(arr1[i]+" "+arr2[i]);
       }
     }
  }
}

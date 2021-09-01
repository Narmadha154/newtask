
package logic;
import java.util.Scanner;
public class AddElements{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements in set1:");
    int num1=sc.nextInt();
    System.out.println("Enter the elements of array 1:");
    int [] arr1=new int[num1];
    for(int i=0;i<num1;i++){
       arr1[i]=sc.nextInt();
    }
    System.out.println("Enter the number of elements in set2:");
    int num2=sc.nextInt();
    System.out.println("Enter the elements of array 2:");
    int [] arr2=new int[num2];
    for(int i=0;i<num2;i++){
       arr2[i]=sc.nextInt();
    }
    long number1=0;
    long number2=0;
    for(int i=0;i<num1;i++){
      number1=number1*10+arr1[i];
    }
    for(int i=0;i<num2;i++){
      number2=number2*10+arr2[i];
    }
    long sum=number1+number2;
    System.out.println(sum);
    long newSum=0;
    int k=0;
    int size=0;
    long [] newArr=new long [100];
    while(sum>0){
       newSum=sum%10;
       newArr[k]=newSum;
       sum=sum/10;
       k++;
       size++;
    }
    System.out.println("sum array:");
    for(int i=size-1;i>=0;i--){
      System.out.println(newArr[i]);
    }
  }
}

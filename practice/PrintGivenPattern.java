
package logic;
import java.util.Scanner;
public class PrintGivenPattern{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no.of rows:");
    int m=sc.nextInt();
    System.out.println("Enter the no.of columns:");
    int n=sc.nextInt();
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
       if(i==0||i==m-1||j==0||j==n-1){
            System.out.print("x");
        }
       else if(j==n-2||i==m-2||i==1||j==1){
            System.out.print("O");
          }
       else{
           System.out.print("x");
       }
     }  
       System.out.println();
    }
  }
 }

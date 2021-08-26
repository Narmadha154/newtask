
import java.util.Scanner;
public class Set3Prgm{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no.of string:");
    int n=sc.nextInt();
    String [] str=new String[n];
    System.out.println("Enter the strings:");
    for(int i=0;i<n;i++){
      str[i]=sc.next();
    }
    System.out.println("String array:");
      for(int i=0;i<n;i++){
          System.out.println(str[i]);
    }
    for(int i=0;i<n;i+=2){
       int j=Integer.parseInt(str[i+1]);
       while(j!=0){
         System.out.print(str[i]);
         j--;
       }
     }
   }
}
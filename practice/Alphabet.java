
package logic;
import java.util.Scanner;
public class Alphabet{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int number=sc.nextInt();
    int [] arr=new int[10000];
    int i=0;
    while(number>0){
      arr[i]=number%26;
      number=number/26;
      i++;
    }
    for(int j=0;j<i-1;j++){
      if(arr[j]<=0){
         arr[j]+=26;
         arr[j+1]=arr[j+1]-1;
      }
   }
   for(int j=i;j>=0;j--){
     if(arr[j]>0){
        System.out.print((char)('A'+arr[j]-1));
     }
   }
 }
}

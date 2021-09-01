
package logic;
import java.util.Scanner;
public class Friends{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no.of friends of john:");
    int num=sc.nextInt();
    System.out.println("Enter the friends name:");
    String [] friends=new String[num];
    for(int i=0;i<num;i++){
      friends[i]=sc.next();
    }
    String [] frndCount=new String[100];
    int k=0;
    int m=0;
    for(int i=0;i<num;i++){
      System.out.println("Enter the no.of friends of"+friends[i]+":");
      int count=sc.nextInt();
      System.out.println("Enter the friends name of "+friends[i]+":");
      for(int j=0;j<count;j++){
          frndCount[m]=sc.next();
          m++;
      }
   }
   System.out.println("friends count:");
   for(int i=0;i<m;i++){
      System.out.println(frndCount[i]);
   }
   String [] newArr=new String[50];
   int newCount=0;
   for(int i=0;i<m;i++){
       int j=0;
       while(j<num&&(!frndCount[i].equals(friends[j]))){
          newCount++;
          j++;
         if(newCount==num){
          newArr[k]=frndCount[i];
          k++;
        }
      }
        newCount=0;
     }
     System.out.println(k);
   System.out.println("Friends of john:");
   for(int i=0;i<k;i++){
      System.out.println(newArr[i]);
   }
  }
 }

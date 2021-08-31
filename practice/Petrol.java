
package logic;
import java.util.Scanner;
public class Petrol{
   public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the amount of petrol in car:");
      int litre=sc.nextInt();
      System.out.println("Enter the number of petrol bunks:");
      int num=sc.nextInt();
      System.out.println("Enter the distance from each petrol bunks:");
      int [] distance=new int[num];
      for(int i=0;i<num;i++){
        distance[i]=sc.nextInt();
      }
      System.out.println("Capacities of each petrol bunk:");
      int [] capacity=new int[num];
      for(int i=0;i<num;i++){
        capacity[i]=sc.nextInt();
      }
      if(litre!=0){
      for(int i=0;i<num;i++){
         litre=litre-distance[i]+capacity[i];
       }
      }
      System.out.println("Remanining litres of petrol in car:"+litre);
   }
 }

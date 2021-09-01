
package logic;
import java.util.Scanner;
public class Workers{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the starting time:");
    double startTym=sc.nextDouble();
    System.out.println("Enter the ending time:");
    double endTym=sc.nextDouble();
    int noOfWorkers=0;
    double totalTym=endTym-startTym;
     System.out.println("*"+totalTym);
    for(double i=totalTym;i>=0;i--){
      if(i==0.50){
        noOfWorkers++;
      }
    }
    System.out.println("no.of workers:"+noOfWorkers);
  }
 }
      
    

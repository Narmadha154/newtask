
package logic;
import java.util.Scanner;
public class Workers{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the starting time:");
    double startTym=sc.nextDouble();
    System.out.println("Whether start time am or pm:");
    String str1=sc.next();
    System.out.println("Enter the ending time:");
    double endTym=sc.nextDouble();
    System.out.println("Whether end time am or pm:");
    String str2=sc.next();
    int noOfWorkers=0;
    if(str1.equals("am")){
      startTym=startTym;
    }
    else{
     if(startTym>=1&&startTym<12){
      startTym=12.00+startTym;
    }
    else{
      startTym=startTym;
    }
   }
    if(str2.equals("am")){
       endTym=endTym;
    }
    else{
     if(endTym>=1&&endTym<12){
      endTym=12.00+endTym;
    }
    else{
       endTym=endTym;
     }
   }
    System.out.println("*"+endTym);
    System.out.println("*"+startTym);
    double totalTym=endTym-startTym;
     System.out.println("*"+totalTym);
    for(double i=totalTym;i>=0.0;i-=0.5){
      if(i!=totalTym){
        noOfWorkers++;
      }
    }
    System.out.println("no.of workers:"+noOfWorkers);
  }
 }
      
    

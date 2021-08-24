

package construct;
import java.util.*;
public class ConstructorTaskRunner{
   static Scanner sc=new Scanner(System.in);
  public static int getIntegerInput(){
       int number;
       try{
           number=sc.nextInt();
        }
        catch(InputMismatchException e){
          System.out.println("Invalid input! you have to enter a integer value");
          sc.next();
          number=getIntegerInput();
    }
    return number;
  }
  public static List<String> createArrayList(){
    List<String> stringList=new ArrayList<String>();
    try{
      System.out.println("Enter the number of Strings:");
      int num=sc.nextInt();
     if(num>0){
         System.out.println("Enter the strings:");
         for(int i=0;i<num;i++)
         {
           stringList.add(sc.next());
         }
      }
     else{
        System.out.println("Invalid input..");
        stringList=createArrayList();
      }
    }
     catch(InputMismatchException e){
       System.out.println("Invalid input! you have to enter a valid input");
       sc.next();
       stringList=createArrayList();
   }
    return stringList;
  }
   public static void main(String [] args){
    System.out.println("Enter the program number:");
    int number=sc.nextInt();
    switch(number){
       case 1:
           ConstructorTask obj=new ConstructorTask();
           break;
      case 2:
           System.out.println("Enter the string:");
           String str=sc.next();
           ConstructorTask obj1=new ConstructorTask(str);
           break;
      case 3:
           System.out.println("Enter the integer:");
           int num=getIntegerInput();
           ConstructorTask obj2=new ConstructorTask(num);
           break;
      case 4:
           List<String> strList=createArrayList();
           ConstructorTask obj3=new ConstructorTask(strList);
           break;
       default:
            System.out.println("No program");
         break;
     }
    }
   }

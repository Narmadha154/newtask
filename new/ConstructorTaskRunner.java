package construct;
import java.util.*;
public class ConstructorTaskRunner{
   static Scanner sc=new Scanner(System.in);
  public int getIntegerInput(){
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
  public List<String> createArrayList(){
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
 public List<Employee> createCustomList(){
      List<Employee> customList=new ArrayList<>();
   try{
      System.out.println("Enter the no.of data for custom arraylist:");
      int size=sc.nextInt();
      System.out.println("Enter true to exit");
      boolean exitValue=sc.nextBoolean();
      int id,age;
      String name;
      for(int i=0;i<size;i++){
          if(exitValue){
             break;
           }
          System.out.println("Enter the id:");
          id=getIntegerInput();
          System.out.println("Enter the name:");
          name=sc.next();
          System.out.println("Enter the age:");
          age=getIntegerInput();
          Employee obj=new Employee();
          obj.setId(id);
          obj.setName(name);
          obj.setAge(age);
          customList.add(obj);
      }
     }
     catch(InputMismatchException e){
       System.out.println("Invalid input! you have to enter a valid input");
       sc.next();
       customList=createCustomList();
    }
      return customList;
    }
  /*  public void run(){
       System.out.println("run");
    }*/
   public static void main(String [] args){
    ConstructorTaskRunner object=new ConstructorTaskRunner();
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
           int num=object.getIntegerInput();
           ConstructorTask obj2=new ConstructorTask(num);
           break;
      case 4:
           List<String> strList=object.createArrayList();
           ConstructorTask obj3=new ConstructorTask(strList);
           break;
      case 5:
           List<Employee> customObjectList=object.createCustomList();
           ConstructorTask object1=new ConstructorTask(customObjectList);
           System.out.println(object1);
           break;
      case 6:
           System.out.println("Enter the string:");
           String name=sc.next();
           System.out.println("Enter the integer:");
           int id=object.getIntegerInput();
           List<String> strList1=object.createArrayList();
           List<Employee> customObjectList1=object.createCustomList();
           Details newObj=new Details(id,name,strList1,customObjectList1);
           System.out.println(newObj);
           break;
      case 7:
           System.out.println("Enter the string:");
           String name1=sc.next();
           System.out.println("Enter the integer:");
           int id1=object.getIntegerInput();
           List<String> strList2=object.createArrayList();
           List<Employee> customObjectList2=object.createCustomList();
           Details newObject=new Details();
           newObject.setName(name1);
           newObject.setId(id1);
           newObject.setList(strList2);
           newObject.setCustomList(customObjectList2);
           System.out.println("Name:"+newObject.getName()+" "+"Id:"+newObject.getId()+" "+"ArrayList:"+newObject.getList()+" "+"Custom Object:"+newObject.getCustomList());
           break;
      case 8:  
           PrivateConstructor obj4=PrivateConstructor.getInstance();
           break;
      /*case 9:
           ConstructorDemo obj5=new ConstructorDemo();
           break;*/
       case 10:
           AbstractClassDemo obj6=new Demo();
           obj6.run();
           break;
       default:
            System.out.println("No program");
         break;
     }
    }
   }
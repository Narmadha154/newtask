
package task4;
import java.util.*;
public class ArrayListTaskRunner{
   static Scanner sc=new Scanner(System.in);
   public static List<String> createStringArrayList(){
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
        stringList=createStringArrayList();
      }
    }
     catch(InputMismatchException e){
       System.out.println("Invalid input! you have to enter a valid input");
       sc.next();
       stringList=createStringArrayList();
   }
   System.out.println(stringList);
    return stringList;
  }
   public static List<Integer> createIntegerArrayList(){
     List<Integer> integerList=new ArrayList<> ();
   try{
     System.out.println("Enter the number of Integers:");
     int num=sc.nextInt();
    if(num > 0){
       System.out.println("Enter the integers:");
        for(int i=0;i<num;i++)
       {
          integerList.add(sc.nextInt());
        }
     }
     else{
      System.out.println("Invalid input..");
      integerList=createIntegerArrayList();
     }
     }
     catch(InputMismatchException e){
       System.out.println("Invalid input! you have to enter a integer");
       sc.next();
       integerList=createIntegerArrayList();
    }
     System.out.println(integerList);
    return integerList;
  }
  public static List<Double> createDecimalArrayList(){
    List<Double> doubleList=new ArrayList<Double>();
   try{
    System.out.println("Enter the number of decimals:");
    int num=sc.nextInt();
    if(num>0){
         System.out.println("Enter the decimals:");
         for(int i=0;i<num;i++)
        {
            doubleList.add(sc.nextDouble());
        }
    }
     else{
      System.out.println("Invalid input..");
      doubleList=createDecimalArrayList();
     }
     }
     catch(InputMismatchException e){
       System.out.println("Invalid input! you have to enter a valid input");
       sc.next();
       doubleList=createDecimalArrayList();
    }
    System.out.println(doubleList);
    return doubleList;
  }
  public static List<Long> createLongArrayList(){
    List<Long> longList=new ArrayList<Long>();
    try{
      System.out.println("Enter the number of long values:");
      int num=sc.nextInt();
      if(num>0){
          System.out.println("Enter the long values:");
         for(int i=0;i<num;i++)
        {
            longList.add(sc.nextLong());
         }
     }
     else{
        System.out.println("Invalid input..");
        longList=createLongArrayList();
     }
    }
     catch(InputMismatchException e){
       System.out.println("Invalid input! you have to enter a valid input");
       sc.next();
       longList=createLongArrayList();
    }
    System.out.println(longList);
    return longList;
  }
  public static List<Student> createCustomList(){
      List<Student> customList=new ArrayList<>();
   try{
      System.out.println("Enter the no.of data:");
      int size=sc.nextInt();
      int rollNo,marks;
      String name;
      for(int i=0;i<size;i++){
          System.out.println("Enter the rollNo:");
          rollNo=sc.nextInt();
          System.out.println("Enter the name:");
          name=sc.next();
          System.out.println("Enter the marks:");
          marks=sc.nextInt();
          Student obj=new Student();
          obj.setRollNo(rollNo);
          obj.setName(name);
          obj.setMarks(marks);
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
   public static double getDecimalInput(){
       double deciNumber;
       try{
           deciNumber=sc.nextDouble();
        }
        catch(InputMismatchException e){
          System.out.println("Invalid input! you have to enter a decimal value");
          sc.next();
          deciNumber=getDecimalInput();
    }
    return deciNumber;
  }
   public static void main(String [] args){
    System.out.println("Enter the program number:");
    int number=sc.nextInt();
    switch(number){
   case 1:
       int length=ArrayListTask.findLength();
       System.out.println("Length of the ArrayList is:"+length);
       break;
   case 2:
       List<String> list=createStringArrayList();
       System.out.println("ArrayList elements are:"+list);
       int arrayLength=list.size();
       System.out.println("Length of the ArrayList with elements:"+arrayLength);
       break;
  case 3:
       List<Integer> intList=createIntegerArrayList();
        System.out.println("ArrayList elements are:"+intList);
       int intListLength=intList.size();
       System.out.println("Length of the Integer ArrayList:"+intListLength);
       break;
  case 4:
       List<Student> customArrayList=createCustomList();
       System.out.println("Custom ArrayList elements:"+customArrayList);
       int customListLength=customArrayList.size();
       System.out.println("Custom ArrayList size:"+customListLength);
       break;
  case 5:
        List<String> listArray=createStringArrayList();
        List<Integer> listInteger=createIntegerArrayList();
       List<Student> customArrList=createCustomList();
       List<Object> objList=ArrayListTask.createList(listInteger,listArray,customArrList);
       System.out.println("ArrayList elements are:"+objList);
       int objLength=objList.size();
       System.out.println("ArrayList size:"+objLength);
       break;
  case 6:
       List<String> list3=createStringArrayList();
       System.out.println("Enter the string for which you want to find index:");
       String str=sc.next();
       List<String> strList=ArrayListTask.findIndex(list3,str);
       System.out.println("ArrayList elements are:"+strList);
       break;
  case 7:
       List<String> stringArrList=createStringArrayList();
       Iterator<String> iter=stringArrList.iterator();
       System.out.println("ArrayList elements using iterator:");
       while(iter.hasNext()){
          System.out.println(iter.next()+" ");
       }
       System.out.println("ArrayList elements using for loop:");
       for(int i=0;i<stringArrList.size();i++){
         System.out.println(stringArrList.get(i)+" ");
       }
       break;
  case 8:
       List<String> list5=createStringArrayList();
        System.out.println("Enter the index:");
        int index=getIntegerInput();
        List<String> newList=ArrayListTask.findStringAtIndex(list5,index);
        System.out.println("ArrayList elements are:"+newList);
        int newLength=newList.size();
        System.out.println("Length of the string :"+newLength);
       break;
  case 9:
       List<String> list6=createStringArrayList();
       int lastIndex=ArrayListTask.findIndexOfDuplicate(list6);
       System.out.println("Last index of the duplicate element is:"+lastIndex);
       break;
  case 10:
       List<String> list7=createStringArrayList();
       System.out.println("Enter the string to be entered:");
       String strSecond=sc.next();
       System.out.println("Enter the position where string to be entered:");
       int position=getIntegerInput();
       List<String> addedList=ArrayListTask.addString(list7,strSecond,position);
       System.out.println("ArrayList elements after adding a string:"+addedList);
       int addedListLength=addedList.size();
       System.out.println("Size of the ArrayList after adding a string:"+addedListLength);
       break;
  case 11:
       List<String> list8=createStringArrayList();
       System.out.println("Enter the index where second arraylist starts:");
       int startIndex=getIntegerInput();
       System.out.println("Enter the index where second arraylist ends:");
       int endIndex=getIntegerInput();
       List<String> secondList=ArrayListTask.createArrayList(list8,startIndex,endIndex);
       System.out.println("Second ArrayList elements:"+secondList);
       int secondLength=secondList.size();
       System.out.println("Second ArrayList size:"+secondLength);
       break;
 case 12:
       List<String> list9=createStringArrayList();
       List<String> secondList2=createStringArrayList();
       List<String> thirdList=ArrayListTask.createThreeArrayList(list9,secondList2);
       System.out.println("Third ArrayList elements:"+thirdList);
       int thirdArrLength=thirdList.size();
       System.out.println("third ArrayList size:"+thirdArrLength);
       break;
  case 13:
       List<String> list10=createStringArrayList();
       List<String> secondArrList=createStringArrayList();
       List<String> thirdArrList=ArrayListTask.createThreeArrayList(list10,secondArrList);
       System.out.println("Third ArrayList elements:"+thirdArrList);
       int thirdLength=thirdArrList.size();
       System.out.println("third ArrayList size:"+thirdLength);
       break;
 case 14:
       List<Double> doubleList=createDecimalArrayList();
       System.out.println("enter the value to be removed:");
       double decimalValue=getDecimalInput();
       List<Double> decimalList=ArrayListTask.removeDecimalValue(doubleList,decimalValue);
       int decimalListLength=decimalList.size();
       System.out.println("Arraylist after removing an element:"+decimalList);
       System.out.println("ArrayList size after removing an element:"+decimalListLength);
       break;
 case 15:
       List<Double> doubleList1=createDecimalArrayList();
       System.out.println("Enter the index where the value to be removed:");
       int removePosition=getIntegerInput();
       List<Double> deciList=ArrayListTask.removeDecimalValueAtIndex(doubleList1,removePosition);
       int deciLength=deciList.size();
       System.out.println("Arraylist after removing an element at given position:"+deciList);
       System.out.println("ArrayList size after removing an element:"+deciLength);
       break;
 case 16:
       List<Long> longList1=createLongArrayList();
       System.out.println("Enter the start index:");
       int stIndex=getIntegerInput();
       System.out.println("Enter the end index:");
       int edIndex=getIntegerInput();
       List<Long> longArrayList=ArrayListTask.removeLongValue(longList1,stIndex,edIndex);
       int removedListLength=longArrayList.size();
        System.out.println("Arraylist after removing the elements:"+longArrayList);
        System.out.println("ArrayList size:"+removedListLength);
       break;
 case 17:
       List<String> list11=createStringArrayList();
       List<String> secList=createStringArrayList();
       List<String> firstList=ArrayListTask.removeElements(list11,secList);
       System.out.println("First ArrayList elements after removing elements which are present in 2nd arraylist:"+firstList);
       int firstLength=firstList.size();
       System.out.println("First ArrayList size after removing elements which are present in 2nd arraylist:"+firstLength);
       break;
 case 18:
       List<String> list12=createStringArrayList();
       List<String> secondList1=createStringArrayList();
       List<String> firstArrList=ArrayListTask.removeNonDuplicateElements(list12,secondList1);
       System.out.println("First ArrayList elements after removing elements which are not present in 2nd arraylist:"+firstArrList);
       int firstListLength=firstArrList.size();
       System.out.println("ArrayList size after removing elements which are not present in 2nd arraylist:"+firstListLength);
       break;
  case 19:
       List<Long> longList=createLongArrayList();
       List<Long> longArrList=ArrayListTask.removeAllLongValue(longList);
       int longListSize=longArrList.size();
       System.out.println("Arraylist after removing the elements:"+longArrList);
       System.out.println("ArrayList size:"+longListSize);
       break;
  case 20:
       List<String> list13=createStringArrayList();
       System.out.println("Enter the string to be checked:");
       String checkStr=sc.next();
       List<String> checkList=ArrayListTask.checkString(list13,checkStr);
       int checkListLength=checkList.size();
       System.out.println("ArrayList elements are:"+checkList);
       System.out.println("ArrayList size:"+checkListLength);
       break;
   default:
       System.out.println("No program");
       break;
   }
   sc.close();
 }
}











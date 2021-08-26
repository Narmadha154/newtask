package tasknew;
import java.util.*;
public class ArrayListTaskRunner{
   static Scanner sc=new Scanner(System.in);
   public  List<String> createStringArrayList(){
    List<String> stringList=null;
    try{
      System.out.println("Enter the number of Strings:");
      int num=sc.nextInt();
      System.out.println("Enter true to exit");
      boolean exitValue=sc.nextBoolean();
      System.out.println(exitValue);
     if(num>0){
         stringList=new ArrayList<>();
         System.out.println("Enter the strings:");
         for(int i=0;i<num;i++)
         {
           if(exitValue){
             break;
            }
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
   public  List<Integer> createIntegerArrayList(){
     List<Integer> integerList=null;
   try{
     System.out.println("Enter the number of Integers:");
     int num=sc.nextInt();
     System.out.println("Enter true to exit");
     boolean exitValue=sc.nextBoolean();
    if(num > 0){
       integerList=new ArrayList<>();
       System.out.println("Enter the integers:");
        for(int i=0;i<num;i++)
       {
          if(exitValue){
             break;
          }
          integerList.add(getIntegerInput());
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
  public List<Double> createDecimalArrayList(){
    List<Double> doubleList=null;
   try{
    System.out.println("Enter the number of decimals:");
    int num=sc.nextInt();
    System.out.println("Enter true to exit");
    boolean exitValue=sc.nextBoolean();
    if(num>0){
         doubleList=new ArrayList<>();
         System.out.println("Enter the decimals:");
         for(int i=0;i<num;i++)
        {
             if(exitValue){
                 break;
            }
            doubleList.add(getDecimalInput());
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
  public List<Long> createLongArrayList(){
    List<Long> longList=null;
    try{
      System.out.println("Enter the number of long values:");
      int num=sc.nextInt();
      System.out.println("Enter true to exit");
      boolean exitValue=sc.nextBoolean();
      if(num>0){
          longList=new ArrayList<>();
          System.out.println("Enter the long values:");
         for(int i=0;i<num;i++)
        {
            if(exitValue){
               break;
            }
            longList.add(getLongInput());
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
  public List<Student> createCustomList(){
      List<Student> customList=new ArrayList<>();
   try{
      System.out.println("Enter the no.of data for custom arraylist:");
      int size=sc.nextInt();
      System.out.println("Enter true to exit");
      boolean exitValue=sc.nextBoolean();
      int rollNo,marks;
      String name;
      for(int i=0;i<size;i++){
          if(exitValue){
             break;
           }
          System.out.println("Enter the rollNo:");
          rollNo=getIntegerInput();
          System.out.println("Enter the name:");
          name=sc.next();
          System.out.println("Enter the marks:");
          marks=getIntegerInput();
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
   public  double getDecimalInput(){
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
    public long getLongInput(){
       long longNumber;
       try{
           longNumber=sc.nextLong();
        }
        catch(InputMismatchException e){
          System.out.println("Invalid input! you have to enter a long value");
          sc.next();
          longNumber=getLongInput();
    }
    return longNumber;
  }
   public static void main(String [] args){
     ArrayListTaskRunner object=new ArrayListTaskRunner();
    System.out.println("Enter the program number:");
    int number=object.getIntegerInput();
   // ArrayListTaskRunner object=new ArrayListTaskRunner();
    ArrayListTask obj=new ArrayListTask();
    switch(number){
   case 1:
       List<String> emptyList=obj.findLength();
       int length=emptyList.size();
       System.out.println("ArrayList elements are:"+emptyList);
       System.out.println("Length of the ArrayList is:"+length);
       break;
   case 2:
       List<String> list=object.createStringArrayList();
       System.out.println("ArrayList elements are:"+list);
       int arrayLength=list.size();
       System.out.println("Length of the ArrayList with elements:"+arrayLength);
       break;
  case 3:
       List<Integer> intList=object.createIntegerArrayList();
        System.out.println("ArrayList elements are:"+intList);
       int intListLength=intList.size();
       System.out.println("Length of the Integer ArrayList:"+intListLength);
       break;
  case 4:
       List<Student> customArrayList=object.createCustomList();
       System.out.println("Custom ArrayList elements:"+customArrayList);
       int customListLength=customArrayList.size();
       System.out.println("Custom ArrayList size:"+customListLength);
       break;
  case 5:
        List<String> listArray=object.createStringArrayList();
        List<Integer> listInteger=object.createIntegerArrayList();
       List<Student> customArrList=object.createCustomList();
       List<Object> objList=obj.createList(listInteger,listArray,customArrList);
       System.out.println("ArrayList elements are:"+objList);
       int objLength=objList.size();
       System.out.println("ArrayList size:"+objLength);
       break;
  case 6:
       List<String> list3=object.createStringArrayList();
       System.out.println("Enter the string for which you want to find index:");
       String str=sc.next();
       int index1=obj.findIndex(list3,str);
       System.out.println("ArrayList elements are:"+list3);
       int length1=list3.size();
       System.out.println("Length of the ArrayList :"+length1);
       System.out.println("Index of the element is:"+index1);
       break;
  case 7:
       List<String> stringArrList=object.createStringArrayList();
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
       List<String> list5=object.createStringArrayList();
        System.out.println("Enter the index:");
        int index=object.getIntegerInput();
        String newString=null;
        try{
           newString=obj.findStringAtIndex(list5,index);
        }
        catch(IndexOutOfBoundsException e){
         System.out.println("You have entered Incorrect Index.Try again");
         index=object.getIntegerInput();
         newString=obj.findStringAtIndex(list5,index);
       }
        System.out.println("ArrayList elements are:"+list5);
        int newLength=list5.size();
        System.out.println("Length of the string :"+newLength);
         System.out.println("String at the given index is:"+newString);
       break;
  case 9:
       List<String> list6=object.createStringArrayList();
       int lastIndex=obj.findIndexOfDuplicate(list6);
       System.out.println("Last index of the duplicate element is:"+lastIndex);
       break;
  case 10:
       List<String> list7=object.createStringArrayList();
       System.out.println("Enter the string to be entered:");
       String strSecond=sc.next();
       System.out.println("Enter the position where string to be entered:");
       int position=object.getIntegerInput();
       List<String> addedList=new ArrayList<>();
       try{
         addedList=obj.addString(list7,strSecond,position);
       }
       catch(IndexOutOfBoundsException e){
         System.out.println("You have entered Incorrect Index.Try again");
         position=object.getIntegerInput();
         addedList=obj.addString(list7,strSecond,position);
       }
       System.out.println("ArrayList elements after adding a string:"+addedList);
       int addedListLength=addedList.size();
       System.out.println("Size of the ArrayList after adding a string:"+addedListLength);
       break;
  case 11:
       List<String> list8=object.createStringArrayList();
       System.out.println("Enter the index where second arraylist starts:");
       int startIndex=object.getIntegerInput();
       System.out.println("Enter the index where second arraylist ends:");
       int endIndex=object.getIntegerInput();
       List<String> secondList=obj.createArrayList(list8,startIndex,endIndex);
       System.out.println("Second ArrayList elements:"+secondList);
       int secondLength=secondList.size();
       System.out.println("Second ArrayList size:"+secondLength);
       break;
 case 12:
       List<String> list9=object.createStringArrayList();
       List<String> secondList2=object.createStringArrayList();
       List<String> thirdList=obj.createThreeArrayList(list9,secondList2);
       System.out.println("Third ArrayList elements:"+thirdList);
       int thirdArrLength=thirdList.size();
       System.out.println("third ArrayList size:"+thirdArrLength);
       break;
  case 13:
       List<String> list10=object.createStringArrayList();
       List<String> secondArrList=object.createStringArrayList();
       List<String> thirdArrList=obj.createThreeArrayList(list10,secondArrList);
       System.out.println("Third ArrayList elements:"+thirdArrList);
       int thirdLength=thirdArrList.size();
       System.out.println("third ArrayList size:"+thirdLength);
       break;
 case 14:
       List<Double> doubleList=object.createDecimalArrayList();
       System.out.println("enter the value to be removed:");
       double decimalValue=object.getDecimalInput();
       List<Double> decimalList=obj.removeDecimalValue(doubleList,decimalValue);
       int decimalListLength=decimalList.size();
       System.out.println("Arraylist after removing an element:"+decimalList);
       System.out.println("ArrayList size after removing an element:"+decimalListLength);
       break;
 case 15:
       List<Double> doubleList1=object.createDecimalArrayList();
       System.out.println("Enter the index where the value to be removed:");
       int removePosition=object.getIntegerInput();
       List<Double> deciList=new ArrayList<>();
       try{
          deciList=obj.removeDecimalValueAtIndex(doubleList1,removePosition);
       }
       catch(IndexOutOfBoundsException e){
         System.out.println("You have entered Incorrect Index.Try again");
         removePosition=object.getIntegerInput();
         deciList=obj.removeDecimalValueAtIndex(doubleList1,removePosition);
       }
       int deciLength=deciList.size();
       System.out.println("Arraylist after removing an element at given position:"+deciList);
       System.out.println("ArrayList size after removing an element:"+deciLength);
       break;
 case 16:
       List<Long> longList1=object.createLongArrayList();
       System.out.println("Enter the start index:");
       int stIndex=object.getIntegerInput();
       System.out.println("Enter the end index:");
       int edIndex=object.getIntegerInput();
       List<Long> longArrayList=obj.removeLongValue(longList1,stIndex,edIndex);
       int removedListLength=longArrayList.size();
        System.out.println("Arraylist after removing the elements:"+longArrayList);
        System.out.println("ArrayList size:"+removedListLength);
       break;
 case 17:
       List<String> list11=object.createStringArrayList();
       List<String> secList=object.createStringArrayList();
       List<String> firstList=obj.removeElements(list11,secList);
       System.out.println("First ArrayList elements after removing elements which are present in 2nd arraylist:"+firstList);
       int firstLength=firstList.size();
       System.out.println("First ArrayList size after removing elements which are present in 2nd arraylist:"+firstLength);
       break;
 case 18:
       List<String> list12=object.createStringArrayList();
       List<String> secondList1=object.createStringArrayList();
       List<String> firstArrList=obj.removeNonDuplicateElements(list12,secondList1);
       System.out.println("First ArrayList elements after removing elements which are not present in 2nd arraylist:"+firstArrList);
       int firstListLength=firstArrList.size();
       System.out.println("ArrayList size after removing elements which are not present in 2nd arraylist:"+firstListLength);
       break;
  case 19:
       List<Long> longList=object.createLongArrayList();
       List<Long> longArrList=obj.removeAllLongValue(longList);
       int longListSize=longArrList.size();
       System.out.println("Arraylist after removing the elements:"+longArrList);
       System.out.println("ArrayList size:"+longListSize);
       break;
  case 20:
       List<String> list13=object.createStringArrayList();
       System.out.println("Enter the string to be checked:");
       String checkStr=sc.next();
       List<String> checkList=obj.checkString(list13,checkStr);
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

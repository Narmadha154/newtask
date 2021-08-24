package task4;
import java.util.*;
public class ArrayListTask{
    public static int findLength(){
      List<String> list=new ArrayList<>();
      int length=list.size();
      return length;
    }
    public static List<Object> createList(List<Integer> list,List<String> stringList,List<Student> customArrList){
     List<Object> arrList=new ArrayList<>();
       if(list==null){
         return null;
      }
       arrList.addAll(list);
       arrList.addAll(stringList);
       arrList.addAll(customArrList);
      return arrList;
    }
     public static List<String> findIndex(List<String> list,String str){
      
      if(list==null){
      return null;
      }
       int length=list.size();
        int index=list.indexOf(str);
        System.out.println("Index of the element is:"+index);
        System.out.println("Length of the ArrayList :"+length);
      return list;
    }
   public static String findStringAtIndex(List<String> list,int index){
    if(list==null){
      return null;
    }
       String str=null;
       int length=list.size();
       if(length>=index){
          str=list.get(index);
          System.out.println("String at the given index is:"+str);
       }
       else{
          System.out.println("Index is invalid");
       }
      return str;
    }
   public static int findIndexOfDuplicate(List<String> list){
    int lastIndex=0;
      if(list==null){
      return 0;
    }
      String str=null;
      for(int i=0;i<list.size();i++){
         for(int j=i+1;j<list.size();j++){
            if(list.get(i).equals(list.get(j))){
               str=list.get(j);
            }
         }
      }
      int firstIndex=list.indexOf(str);
      System.out.println("First index of the duplicate element is:"+firstIndex);
      lastIndex=list.lastIndexOf(str);
      return lastIndex;
    }
   public static List<String> addString(List<String> list,String str,int position){
      if(list==null){
      return null;
    }
    int length=list.size();
     if(length>=position){
       list.add(position,str);
      }
     else{
       System.out.println("given position is greater than the list length");
     }
      return list;
    }
     public static List<String> createArrayList(List<String> list,int startIndex,int endIndex){
      List<String> secondList=new ArrayList<>();
       if(list==null){
         return null;
      }
       int size=list.size();
       if(size>=endIndex){
          secondList=list.subList(startIndex,endIndex);
       }
       else{
         System.out.println("End index is greater than the list length");
       }
      return secondList;
    }
   public static List<String> createThreeArrayList(List<String> firstList,List<String> secondList){
      List<String> thirdList=new ArrayList<String>();
      if(firstList==null&&secondList==null){
         return null;
      }
       thirdList.addAll(firstList);
       thirdList.addAll(secondList);
      return thirdList;
    }
   public static List<Double> removeDecimalValue(List<Double> decimalList,double decimalValue){
     if(decimalList==null){
         return null;
      }
      if(decimalList.contains(decimalValue)){
         decimalList.remove(decimalValue);
      }
       else{
         System.out.println("given value is not in the list");
      }
      return decimalList;
    }   
   public static List<Double> removeDecimalValueAtIndex(List<Double> decimalList,int position){
      if(decimalList==null){
         return null;
      }
      int size=decimalList.size();
      if(size>=position){ 
          decimalList.remove(position);
      }
       else{
         System.out.println("given index is greater than the list length");
      }
      return decimalList;
    } 
    public static List<Long> removeLongValue(List<Long> longList,int startIndex,int endIndex){
       if(longList==null){
         return null;
      }
      int size=longList.size();
      if(size>=endIndex){ 
         longList.subList(startIndex,endIndex).clear();
       }
       else{
         System.out.println("index is greater than the list length");
      }
      return longList;
    }
   public static List<String> removeElements(List<String> firstList,List<String> secondList){
       if(firstList==null&&secondList==null){
         return null;
      }
       firstList.removeAll(secondList);
      return firstList;
    }
   public static List<String> removeNonDuplicateElements(List<String> firstList,List<String> secondList){
     if(firstList==null&&secondList==null){
         return null;
      }
       firstList.retainAll(secondList);
      return firstList;
    }
  public static List<Long> removeAllLongValue(List<Long> longList){
     if(longList==null){
         return null;
      }
       longList.removeAll(longList);
      return longList;
    }
  public static List<String> checkString(List<String> list,String str){
     if(list==null){
         return null;
      }
       if(list.contains(str)){
            System.out.println("Given string is present in the ArrayList");
       }
       else{
           System.out.println("Given string is not present in the ArrayList");
       }
      return list;
    } 
}
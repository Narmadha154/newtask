
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
     if(list!=null&&stringList!=null&&customArrList!=null){
       arrList.addAll(list);
       arrList.addAll(stringList);
       arrList.addAll(customArrList);
     }
     else{
       System.out.println("given list is null");
     }
      return arrList;
    }
     public static List<String> findIndex(List<String> list,String str){
      
      if(list==null){
      return null;
      }

       int length=list.size();
       if(list.contains(str)){
        int index=list.indexOf(str);
        System.out.println("Index of the element is:"+index);
        System.out.println("Length of the ArrayList :"+length);
     }
     else{
        System.out.println("given string is not in the list");
     } 
      return list;
    }
   public static List<String> findStringAtIndex(List<String> list,int index){
     if(list!=null){
       int length=list.size();
       if(length>=index){
          String str=list.get(index);
          System.out.println("String at the given index is:"+str);
       }
       else{
          System.out.println("Index is invalid");
       }
     }
     else{
       System.out.println("given list is null");
     }
      return list;
    }
   public static int findIndexOfDuplicate(List<String> list){
    int lastIndex=0;
    if(list!=null){
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
     }
     else{
       System.out.println("given list is null");
     }
      return lastIndex;
    }
   public static List<String> addString(List<String> list,String str,int position){
    if(list!=null){
    int length=list.size();
     if(length>=position){
       list.add(position,str);
      }
     }
     else{
       System.out.println("given list is null");
     }
      return list;
    }
     public static List<String> createArrayList(List<String> list,int startIndex,int endIndex){
      List<String> secondList=new ArrayList<>();
      if(list!=null){
       int size=list.size();
       if(size>=endIndex){
          secondList=list.subList(startIndex,endIndex);
       }
       else{
         System.out.println("End index is greater than the list length");
       }
      }
     else{
       System.out.println("given list is null");
     }
      return secondList;
    }
   public static List<String> createThreeArrayList(List<String> firstList,List<String> secondList){
      List<String> thirdList=new ArrayList<String>();
      if(firstList!=null&&secondList!=null){
       thirdList.addAll(firstList);
       thirdList.addAll(secondList);
      }
     else{
       System.out.println("given list is null");
     }
      return thirdList;
    }
   public static List<Double> removeDecimalValue(List<Double> decimalList,double decimalValue){
    if(decimalList!=null){
      if(decimalList.contains(decimalValue)){
         decimalList.remove(decimalValue);
      }
       else{
         System.out.println("given value is not in the list");
      }
     }
     else{
       System.out.println("given list is null");
     }
      return decimalList;
    }   
   public static List<Double> removeDecimalValueAtIndex(List<Double> decimalList,int position){
    if(decimalList!=null){
      int size=decimalList.size();
      if(size>=position){ 
          decimalList.remove(position);
      }
       else{
         System.out.println("given index is greater than the list length");
      }
     }
     else{
       System.out.println("given list is null");
     }
      return decimalList;
    } 
    public static List<Long> removeLongValue(List<Long> longList,int startIndex,int endIndex){
     if(longList!=null){
      int size=longList.size();
      if(size>=endIndex){ 
         longList.subList(startIndex,endIndex).clear();
       }
       else{
         System.out.println("index is greater than the list length");
      }
     }
     else{
       System.out.println("given list is null");
     }
      return longList;
    }
   public static List<String> removeElements(List<String> firstList,List<String> secondList){
     if(firstList!=null&&secondList!=null){
       firstList.removeAll(secondList);
     }
     else{
       System.out.println("given list is null");
     }
      return firstList;
    }
   public static List<String> removeNonDuplicateElements(List<String> firstList,List<String> secondList){
     if(firstList!=null&&secondList!=null){
       firstList.retainAll(secondList);
     }
     else{
       System.out.println("given list is null");
     }
      return firstList;
    }
  public static List<Long> removeAllLongValue(List<Long> longList){
     if(longList!=null){
       longList.removeAll(longList);
     }
     else{
       System.out.println("given list is null");
     }
      return longList;
    }
  public static List<String> checkString(List<String> list,String str){
     if(list!=null){
       if(list.contains(str)){
            System.out.println("Given string is present in the ArrayList");
       }
       else{
           System.out.println("Given string is not present in the ArrayList");
       }
     }
     else{
       System.out.println("given list is null");
     }
      return list;
    } 
}
    

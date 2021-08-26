package tasknew;
import java.util.*;
public class ArrayListTask{
    Scanner sc=new Scanner(System.in);
    /*public int checkIndex(int size){
       int number;
       System.out.println("Length of the list is:"+ size);
       System.out.println("So enter index between the list length");
       try{
           number=sc.nextInt();
        }
        catch(InputMismatchException e){
          System.out.println("Invalid input! you have to enter a integer value");
          sc.next();
          number=checkIndex(size);
    }
    return number;
  }*/
    public  List<String> findLength(){
      List<String> list=new ArrayList<>();
      int length=list.size();
      return list;
    }
    public List<Object> createList(List<Integer> list,List<String> stringList,List<Student> customArrList){
     List<Object> arrList=new ArrayList<>();
       if(list==null||stringList==null||customArrList==null){
         return null;
      }
       arrList.addAll(list);
       arrList.addAll(stringList);
       arrList.addAll(customArrList);
      return arrList;
    }
     public int findIndex(List<String> list,String str){
      
      if(list==null){
      return -1;
      }
        int index=list.indexOf(str);
      return index;
    }
   public String findStringAtIndex(List<String> list,int index) throws IndexOutOfBoundsException{
    if(list==null){
      return null;
    }
       String str=null;
       int newIndex=0;
       int length=list.size();
       if(length>=index){
          str=list.get(index);
       }
       else{
          System.out.println("Index is greater than the list length");
          throw new IndexOutOfBoundsException();
       }
      return str;
    }
   public int findIndexOfDuplicate(List<String> list){
    int lastIndex=0;
      if(list==null){
      return -1;
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
   public List<String> addString(List<String> list,String str,int position) throws IndexOutOfBoundsException{
      if(list==null){
      return null;
    }
    int newPosition=0;
    int length=list.size();
     if(length>=position){
       list.add(position,str);
      }
     else{
       System.out.println("given position is greater than the list length");
       throw new IndexOutOfBoundsException();
     }
      return list;
    }
     public List<String> createArrayList(List<String> list,int startIndex,int endIndex){
      List<String> secondList=new ArrayList<>();
       if(list==null){
         return null;
      }
       int size=list.size();
       if(startIndex>=0&&size>=endIndex&&startIndex<=endIndex){
          secondList=list.subList(startIndex,endIndex);
       }
       else{
         System.out.println("index is invalid");
       }
      return secondList;
    }
   public List<String> createThreeArrayList(List<String> firstList,List<String> secondList){
      List<String> thirdList=new ArrayList<String>();
      if(firstList==null||secondList==null){
         return null;
      }
       thirdList.addAll(firstList);
       thirdList.addAll(secondList);
      return thirdList;
    }
   public List<Double> removeDecimalValue(List<Double> decimalList,double decimalValue){
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
   public List<Double> removeDecimalValueAtIndex(List<Double> decimalList,int position) throws IndexOutOfBoundsException{
      if(decimalList==null){
         return null;
      }
      int newPosition=0;
      int size=decimalList.size();
      if(size>=position){ 
          decimalList.remove(position);
      }
       else{
         System.out.println("given index is greater than the list length");
         throw new IndexOutOfBoundsException();
      }
      return decimalList;
    } 
    public List<Long> removeLongValue(List<Long> longList,int startIndex,int endIndex){
       if(longList==null){
         return null;
      }
      int size=longList.size();
      if(startIndex>=0&&size>=endIndex&&startIndex<=endIndex){ 
         longList.subList(startIndex,endIndex).clear();
       }
       else{
         System.out.println("index is greater than the list length");
      }
      return longList;
    }
   public List<String> removeElements(List<String> firstList,List<String> secondList){
       if(firstList==null||secondList==null){
         return null;
      }
       firstList.removeAll(secondList);
      return firstList;
    }
   public List<String> removeNonDuplicateElements(List<String> firstList,List<String> secondList){
     if(firstList==null||secondList==null){
         return null;
      }
       firstList.retainAll(secondList);
      return firstList;
    }
  public List<Long> removeAllLongValue(List<Long> longList){
     if(longList==null){
         return null;
      }
       longList.removeAll(longList);
      return longList;
    }
  public List<String> checkString(List<String> list,String str){
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
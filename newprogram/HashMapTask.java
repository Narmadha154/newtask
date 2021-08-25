
package hashmap;
import java.util.*;
public class HashMapTask{
   static Scanner sc=new Scanner(System.in);
   Map<String,String> stringMap=new HashMap<>();
   Map<Integer,Integer> integerMap=new HashMap<>();
   Map<String,Integer> stringIntegerMap=new HashMap<>();
   public  Map<String,String> createStringHashMap(){
    try{
     System.out.println("Enter the no.of key value pairs for string,string Hashmap:");
     int num=sc.nextInt();
     for(int i=0;i<num;i++){
        System.out.println("Enter the key:");
        String key=sc.next();
        System.out.println("Enter the value:");
        String value=sc.next();
        stringMap.put(key,value);
     }
    }
    catch(InputMismatchException e){
       System.out.println("Invalid input! you have to enter a valid input");
       sc.next();
       stringMap=createStringHashMap();
   }
     return stringMap;
    }
     public Map<Integer,Integer> createIntegerHashMap(){
      try{
       System.out.println("Enter the no.of key value pairs for int,int hashmap:");
       int num=sc.nextInt();
       for(int i=0;i<num;i++){
        System.out.println("Enter the key:");
        int intKey=getIntegerInput();
        System.out.println("Enter the value:");
        int intValue=getIntegerInput();
        integerMap.put(intKey,intValue);
      }
     }
     catch(InputMismatchException e){
       System.out.println("Invalid input! you have to enter a valid input");
       sc.next();
       integerMap=createIntegerHashMap();
   }
     return integerMap;
    }
     public Map<String,Integer> createStringIntegerHashMap(){
      try{
       System.out.println("Enter the no.of key value pairs for string,int hashmap:");
       int num=sc.nextInt();
       for(int i=0;i<num;i++){
        System.out.println("Enter the key:");
        String strKey=sc.next();
        System.out.println("Enter the value:");
        int integerValue=getIntegerInput();
        stringIntegerMap.put(strKey,integerValue);
      }
     }
     catch(InputMismatchException e){
       System.out.println("Invalid input! you have to enter a valid input");
       sc.next();
       stringIntegerMap=createStringIntegerHashMap();
   }
     return stringIntegerMap;
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
   public int findSize(){
       Map map=new HashMap();
       int size=map.size();
       System.out.println("Hashmap elements:"+map);
       return size;
   }
     public Map<String,Student> createCustomMap(){
       Map<String,Student> customMap=new HashMap<>();
      try{
        int rollNo,marks;
        String name;
        System.out.println("Enter the number of key value pair:");
         int keyValue=sc.nextInt();
         for(int i=0;i<keyValue;i++){
          System.out.println("Enter the key:");
          String key=sc.next();
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
          customMap.put(key,obj);
       }
      }
      catch(InputMismatchException e){
       System.out.println("Invalid input! you have to enter a valid input");
       sc.next();
       customMap=createCustomMap();
      }
      return customMap;
    }
   public boolean checkKey(Map<String,String> map,String key){
     if(map.isEmpty()){
      return false;
      }
     boolean value= map.containsKey(key);
     return value;
   }
   public boolean checkValue(Map<String,String> map,String strValue){
      if(map.isEmpty()){
         return false;
      }
     boolean checkValue= map.containsValue(strValue);
     return checkValue;
   }
   public Map<String,String> changeValues(Map<String,String> map){
       if(map.isEmpty()){
        return null;
      }
      map.replaceAll((key, oldValue)
                            -> oldValue + oldValue);
      return map;                      
   }
   public String getValue(Map<String,String> map,String key){
        if(map.isEmpty()){
          return null;
      }
       String value=map.get(key);
    return value;
   } 
    public  String getValueForKey( Map<String,String> map,String key,String defaultValue){
      if(map.isEmpty()){
          return null;
      }
      String str=map.getOrDefault(key,defaultValue);
      return str;
   } 
   public Map<Integer,Integer> removeKey(Map<Integer,Integer> map,int removeKey){
      if(map.isEmpty()){
          return null;
      }
     System.out.println("Hashmap elements before changes:"+map); 
     int size=map.size();
     System.out.println("Size of the HashMap before changes:"+size);
        map.remove(removeKey);
     return map;
   }
   public Map<String,String> removeMatchedValue( Map<String,String> map,String removedKey,String matchValue){
         if(map.isEmpty()){
          return null;
      }
        System.out.println("Hashmap elements before changes:"+map);
        int size=map.size();
        System.out.println("Size of the HashMap before changes:"+size);
        String str=map.get(removedKey);
            if(matchValue.equals(str)){
                map.remove(removedKey);
            }
            else{
               System.out.println("Given value not matched with key value");
            }
    return map;
   }
   public Map<String,Integer> replaceValue(Map<String,Integer> map,String replaceKey,int replaceValue){
          if(map.isEmpty()){
          return null;
      }
         System.out.println("Hashmap elements before changes:"+map);
         int size=map.size();
         System.out.println("Size of the HashMap before changes:"+size);
         map.replace(replaceKey,replaceValue);
    return map;
   } 
    public Map<String,Integer> replaceMatchedValue( Map<String,Integer> map,String replaceKey1,int replaceValue1,int matchValue1){
          if(map.isEmpty()){
          return null;
      }
         System.out.println("Hashmap elements before changes:"+map);
          int size=map.size();
         System.out.println("Size of the HashMap before changes:"+size);
         int value=map.get(replaceKey1);
             if(matchValue1==value){
                 map.replace(replaceKey1,replaceValue1);
             }
             else{
                 System.out.println("Given value not matched with key value");
             }
    return map;
   } 
  public Map<String,Integer> transferKeysValues(Map<String,Integer> firstMap,Map<String,Integer> secondMap){
         if(firstMap.isEmpty()||secondMap.isEmpty()){
          return null;
      }
        System.out.println("Hashmap1 elements before changes:"+firstMap);
         int size1=firstMap.size();
        System.out.println("Size of the HashMap1 before changes:"+size1);
        System.out.println("Hashmap2 elements before changes:"+secondMap);
         int size2=secondMap.size();
        System.out.println("Size of the HashMap2 before changes:"+size2);
        secondMap.putAll(firstMap);
        System.out.println("Hashmap1 elements after changes:"+firstMap);
         int size=firstMap.size();
        System.out.println("Size of the HashMap1 after changes:"+size);
       return secondMap;
  }  
  public Map<String,Integer> removeAllEntries( Map<String,Integer> map){
           if(map.isEmpty()){
             return null;
         }
        System.out.println("Hashmap elements before changes:"+map);
        int size=map.size();
        System.out.println("Size of the HashMap before changes:"+size);
        map.clear(); 
        return map;
   }   
  public static void closeScanner(){
    sc.close();   
  //System.out.println("scanner closed");
 // System.out.println(sc.nextLine());
  }
 }


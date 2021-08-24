
package hashmap;
import java.util.*;
public class HashMapTaskRunner{
   public static void main(String [] args){
    System.out.println("Enter the program number:");
  try(Scanner sc=new Scanner(System.in)){
    int number=sc.nextInt();
    HashMapTask obj=new HashMapTask();
    switch(number){
       case 1:
          int size=obj.findSize();
          System.out.println("Size of the Hashmap:"+size);
          break;
       case 2:
          Map<String,String> stringMap=obj.createStringHashMap();
          System.out.println("Hashmap elements:"+stringMap);
          int mapSize1=stringMap.size();
          System.out.println("Size of the String Hashmap:"+mapSize1);
          break;
      case 3:
          Map<Integer,Integer> integerMap=obj.createIntegerHashMap();
          System.out.println("Hashmap elements:"+integerMap);  
          int mapSize2=integerMap.size();
          System.out.println("Size of the Integer Hashmap:"+mapSize2);
          break;
      case 4:
          Map<String,Integer> strIntMap=obj.createStringIntegerHashMap();
          int mapSize=strIntMap.size();
           System.out.println("Hashmap elements:"+strIntMap); 
          System.out.println("Size of the String Integer Hashmap:"+mapSize);
          break;
     case 5:
          Map<String,Student> customHashMap=obj.createCustomMap();
          System.out.println("Hashmap elements:"+customHashMap);  
          int customHashMapSize=customHashMap.size();
          System.out.println("Size of the String Hashmap:"+customHashMapSize);
          break;
     case 6:
          Map<String,String> strMap=obj.createStringHashMap();
          System.out.println("Hashmap elements:"+strMap);  
          int strMapSize=strMap.size();
          System.out.println("Size of the String Hashmap:"+strMapSize);
          break;
     case 7:
           Map<Integer,Integer> nullMap=obj.createIntegerHashMap();
           System.out.println("HashMap elements:"+nullMap);
           int nullMapSize=nullMap.size();
           System.out.println("HashMap size:"+nullMapSize);
           break;
     case 8:
           boolean value=obj.checkKey();
           System.out.println("Given key present in the hashmap:"+value);
           break;
     case 9:
           boolean booleanValue=obj.checkValue();
           System.out.println("Given value present in the hashmap:"+booleanValue);
           break;
     case 10:
          Map<String,String> changedHash=obj.changeValues();
          System.out.println("Hashmap elements:"+changedHash);
           break;
     case 11:
         int valueForKey=obj.getValue();
         System.out.println("Value for the given key is:"+valueForKey);
         break;
    case 12:
         int valueKey=obj.getValue();
         System.out.println("Value for the given key is:"+valueKey);
         break;
     case 13:
         String valueOfKey=obj.getValueForKey();
         System.out.println("Value for the given key is:"+valueOfKey);
         break;
     case 14:
         Map<Integer,Integer> changedMap=obj.removeKey();
         System.out.println("Hashmap elements after changes:"+changedMap); 
         int changedSize=changedMap.size();
         System.out.println("Size of the HashMap after change:"+changedSize);
         break;
     case 15:
         Map<String,String> changedHashMap=obj.removeMatchedValue();
         System.out.println("Hashmap elements after changes:"+changedHashMap);
         int changedHashSize=changedHashMap.size();
         System.out.println("Size of the HashMap after changes:"+changedHashSize);
         break;
     case 16:
         Map<String,Integer> replacedHashMap=obj.replaceValue();
         System.out.println("Hashmap elements after changes:"+replacedHashMap); 
         int replacedHashSize=replacedHashMap.size();
         System.out.println("Size of the HashMap after changes:"+replacedHashSize);
         break;
      case 17:
         Map<String,Integer> replacedHashMap1=obj.replaceMatchedValue();
         System.out.println("Hashmap elements after changes:"+replacedHashMap1); 
         int replacedHashSize1=replacedHashMap1.size();
         System.out.println("Size of the HashMap after changes:"+replacedHashSize1);
         break;
     case 18:
          System.out.println("Hashmap1 elements before changes:");
          Map<String,Integer> transferedHashMap=obj.transferKeysValues();
          System.out.println("Hashmap2 elements after transfers:"+transferedHashMap);
           int transferedHashSize=transferedHashMap.size();
          System.out.println("Size of the HashMap2 after changes:"+transferedHashSize);
           break;
      case 19:
          Map<String,Integer> map=obj.iterateHashMap();
          System.out.println("Hashmap elements:");
          for(Map.Entry hashMap1: map.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
          }
         break;
      case 20:
          Map<String,Integer> clearedHashMap=obj.removeAllEntries();
          System.out.println("Hashmap elements after changes:"+clearedHashMap);
           int afterSize=clearedHashMap.size();
          System.out.println("Size of the HashMap after changes:"+afterSize);
          break;
     default:
         System.out.println("No program");
         break;
     }
    }
   catch(Exception e){
     System.out.println("Exception coming");
   }
    HashMapTask.closeScanner();
  }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

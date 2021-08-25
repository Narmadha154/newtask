
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
           Map<String,String> checkMap=obj.createStringHashMap();
           System.out.println("Enter the key to be checked");
           String checkKey=sc.next();
           boolean value=obj.checkKey(checkMap,checkKey);
           System.out.println("Given key present in the hashmap:"+value);
           break;
     case 9:
           Map<String,String> checkMap1=obj.createStringHashMap();
           System.out.println("Enter the value to be checked");
           String checkValue=sc.next();
           boolean booleanValue=obj.checkValue(checkMap1,checkValue);
           System.out.println("Given value present in the hashmap:"+booleanValue);
           break;
     case 10:
           Map<String,String> map=obj.createStringHashMap();
          Map<String,String> changedHash=obj.changeValues(map);
          System.out.println("Hashmap elements:"+changedHash);
           break;
     case 11:
         Map<String,String> strgHash=obj.createStringHashMap();
         System.out.println("Enter the key for which you want the value:");
         String existingKey=sc.next();
         String valueForKey=obj.getValue(strgHash,existingKey);
         System.out.println("Value for the given key is:"+valueForKey);
         break;
    case 12:
         Map<String,String> strgHash1=obj.createStringHashMap();
         System.out.println("Enter the key for which you want the value:");
         String existingKey1=sc.next();
         String valueKey=obj.getValue(strgHash1,existingKey1);
         System.out.println("Value for the given key is:"+valueKey);
         break;
     case 13:
         Map<String,String> strHashMap=obj.createStringHashMap();
         System.out.println("Enter the key for which you want the value:");
         String nonExistingKey=sc.next();
         System.out.println("Enter the default value for non existing key:");
         String defaultValue=sc.next();
         String valueOfKey=obj.getValueForKey(strHashMap,nonExistingKey,defaultValue);
         System.out.println("Value for the given key is:"+valueOfKey);
         break;
     case 14:
         Map<Integer,Integer> intHashMap=obj.createIntegerHashMap();
         System.out.println("Enter the key which you want to remove:");
         int removeKey=obj.getIntegerInput();
         Map<Integer,Integer> changedMap=obj.removeKey(intHashMap,removeKey);
         System.out.println("Hashmap elements after changes:"+changedMap); 
         int changedSize=changedMap.size();
         System.out.println("Size of the HashMap after change:"+changedSize);
         break;
     case 15:
         Map<String,String> integerHashMap=obj.createStringHashMap();
         System.out.println("Enter the key which you want to remove:");
         String removedKey=sc.next();
         System.out.println("Enter the value for which you want to check matching:");
         String matchValue=sc.next();
         Map<String,String> changedHashMap=obj.removeMatchedValue(integerHashMap,removedKey,matchValue);
         System.out.println("Hashmap elements after changes:"+changedHashMap);
         int changedHashSize=changedHashMap.size();
         System.out.println("Size of the HashMap after changes:"+changedHashSize);
         break;
     case 16:
         Map<String,Integer> strIntHash=obj.createStringIntegerHashMap();
         System.out.println("Enter the key which you want to replace:");
         String replaceKey=sc.next();
         System.out.println("Enter the value to be replaced:");
         int replaceValue=obj.getIntegerInput();
         Map<String,Integer> replacedHashMap=obj.replaceValue(strIntHash,replaceKey,replaceValue);
         System.out.println("Hashmap elements after changes:"+replacedHashMap); 
         int replacedHashSize=replacedHashMap.size();
         System.out.println("Size of the HashMap after changes:"+replacedHashSize);
         break;
      case 17:
         Map<String,Integer> strIntHash1=obj.createStringIntegerHashMap();
         System.out.println("Enter the key which you want to replace:");
         String replaceKey1=sc.next();
         System.out.println("Enter the value to be replaced:");
         int replaceValue1=obj.getIntegerInput();
         System.out.println("Enter the value for which you want to check matching:");
         int matchValue1=obj.getIntegerInput();
         Map<String,Integer> replacedHashMap1=obj.replaceMatchedValue(strIntHash1,replaceKey1,replaceValue1,matchValue1);
         System.out.println("Hashmap elements after changes:"+replacedHashMap1); 
         int replacedHashSize1=replacedHashMap1.size();
         System.out.println("Size of the HashMap after changes:"+replacedHashSize1);
         break;
     case 18:
          Map<String,Integer> strIntHashMap1=obj.createStringIntegerHashMap();
          Map<String,Integer> strIntHashMap2=obj.createStringIntegerHashMap();
          System.out.println("Hashmap1 elements before changes:");
          Map<String,Integer> transferedHashMap=obj.transferKeysValues(strIntHashMap1,strIntHashMap2);
          System.out.println("Hashmap2 elements after transfers:"+transferedHashMap);
           int transferedHashSize=transferedHashMap.size();
          System.out.println("Size of the HashMap2 after changes:"+transferedHashSize);
           break;
      case 19:
          Map<String,Integer> map1=obj.createStringIntegerHashMap();
          System.out.println("Hashmap elements:");
          for(Map.Entry hashMap1: map1.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
          }
         break;
      case 20:
          Map<String,Integer> strIntHashMap=obj.createStringIntegerHashMap();
          Map<String,Integer> clearedHashMap=obj.removeAllEntries(strIntHashMap);
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
 
 
 
 
 
 
 
 
 
 
 
 
 
 

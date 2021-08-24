
package construct;
import java.util.*;
public class ConstructorTask{
 public ConstructorTask(){
    System.out.println("Default Constructor Called");
 }
 public ConstructorTask(String str){
    System.out.println("Given String is"+str);
 }
 public ConstructorTask(int integerNum){
    System.out.println("Given integer is "+integerNum);
 }
 public ConstructorTask(List<String> stringList){
    System.out.println("Given arraylist is "+stringList);
 }
}

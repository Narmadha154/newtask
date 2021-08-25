
package construct;
import java.util.*;
public class ConstructorTask{
 String name;
 int rollNo;
 int marks;
 public ConstructorTask(){
    System.out.println("Default Constructor Called");
 }
 public ConstructorTask(String str){
    System.out.println("Given String is"+str);
 }
 public ConstructorTask(int integerNum){
    System.out.println("Given integer is "+integerNum);
 }
 public ConstructorTask(List list){
    System.out.println("Given arraylist is "+list);
 }
}

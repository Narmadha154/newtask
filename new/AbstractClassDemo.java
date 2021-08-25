package construct;
import java.util.*;
abstract class AbstractClassDemo{
 abstract void run();
 public AbstractClassDemo(){
    System.out.println("Default Constructor Called");
 }
}
class Demo extends AbstractClassDemo{
   public void run(){
     System.out.println("Running successfully");
   }
}
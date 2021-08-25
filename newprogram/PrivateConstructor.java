
package construct;
import java.util.*;
public class PrivateConstructor{
 private PrivateConstructor(){
    System.out.println("Private Default Constructor Called");
 }
 public static PrivateConstructor getInstance(){
   PrivateConstructor obj=new PrivateConstructor();
   return obj;
 }
}

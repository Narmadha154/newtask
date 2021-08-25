
package construct;
import java.util.*;
public class Details{
       int id;
       String name;
       List<String> list=new ArrayList<>();
       List<Employee> customList=new ArrayList<>();
    public Details(){
    }
    public Details(int id,String name,List<String> list,List<Employee> customList){
         setName(name);
         setId(id);
         setList(list);
         setCustomList(customList);
       }
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list= list;
    }
    public List<Employee> getCustomList(){
       return customList;
    }
    public void setCustomList(List<Employee> customList){
       this.customList=customList;
    }
      public String toString(){
           return "Id: "+id+" "+"Name: "+name+" "+"ArrayList: "+list+" "+"Custom Object"+customList;
      }
   }

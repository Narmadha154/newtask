package task4;
public class Student{
       int rollNo;
       String name;
       int marks;
       public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

      public String toString(){
           return "RollNo: "+rollNo+" "+"Name: "+name+" "+"Marks: "+marks;
      }
   }


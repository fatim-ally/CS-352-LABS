package Week_12;
import java.util.*;

public class StudentList {
    ArrayList<Student> students;

    public StudentList(){
      students = new ArrayList<Student>();  
      System.out.println("Constructor called");  
    }
    public boolean addStudent(Student student){
      return students.add(student);
    }
    public boolean removeStudent(String seatNo){
      for(Student s :  students){
        if(s.getSeatNo().equals(seatNo)){
           students.remove(s);
           return true;
        }
      }  
      return false;
    }
    public Student searchByName(String name){
      for(Student s : students){
        if(s.getName().equalsIgnoreCase(name)){
            return s;
        }
      }
      return null;
    }
    public Student searchBySeatNo(String seatNo){
      for(Student s : students){
        if(s.getSeatNo().equals(seatNo)){
            return s;
        }
      }
      return null;
    }
    public void sortByName(){
      Collections.sort(students, (s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));
    }
    public void sortBySeatNo(){
      Collections.sort(students, (s1, s2) -> s1.getSeatNo().compareToIgnoreCase(s2.getSeatNo()));
    }
    public String toString(){
      StringBuilder sb = new StringBuilder("Student List\n");
      for(Student s : students){
        sb.append(s.toString()).append("\n");
      }
      return sb.toString();
    }
}

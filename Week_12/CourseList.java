package Week_12;
import java.util.*;

public class CourseList {
    Course[] courses;
    int count;
    int size; 

    public CourseList(int size){
      this.size=size;
      this.courses = new Course[size];
      this.count=0;
    }
    public boolean addCourse(Course course){
      if(count<size){
        courses[count++]=course;
        return true;
      }
      return false;
    }
    public boolean removeCourse(String code){
      for(int i = 0 ; i<count ; i++){
        if(courses[i].getCode().equalsIgnoreCase(code)){
           for(int j=i ; j<count-1;j++){
            courses[j]=courses[j+1];
           }
           courses[--count]=null;
           return true;
        }
      }
      return false;
    }
    public Course searchByName(String name){
      for(int i=0 ; i<count ; i++){
        if(courses[i].getName.equalsIgnoreCase(name)){
            return courses[i];
        }
      }
      return null;
    }
    public Course searchByCode(String code){
      for(int i=0 ; i<count ; i++){
        if(courses[i].getCode.equalsIgnoreCase(code)){
            return courses[i];
        }
      }
      return null;
    }
    public void sortByName(){
      Arrays.sort(courses, 0, count, (c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()));
    }
    public void sortByCode(){
      Arrays.sort(courses,0,count,(c1, c2)->c1.getCode().compareToIgnoreCase(c2.getCode()));
    }
    
    @Override
    public String toString(){
      StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(courses[i].toString()).append("\n"); 
        }
        return sb.toString();
    }
}



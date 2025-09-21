package Week_12;
public class Student {
    private String name;
    private String seatNo;
    private CourseList courses;

    public Student(String name,String seatNo){   
      this.name = name;
      this.seatNo = seatNo; 
    }
    public Student(String name,String seatNo,CourseList courses){
      this.name = name;
      this.seatNo = seatNo;
      this.courses = courses;  
    }    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSeatNo(){
        return seatNo;
    }
    public void setSeatNo(String seatNo){
        this.seatNo = seatNo;
    }
    public CourseList getCourses(){
        return courses;
    }
    public boolean enrollCourses(Course course){
        return courses.addCourse(course);
    }
    public boolean dropCourse(String code){
        return courses.removeCourse(code);
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Seat No: " + seatNo + "\nCourses: " + courses.toString();
    }
}

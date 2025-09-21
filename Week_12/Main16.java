package Week_12;
public class Main16 {
    public static void main(String[] args) {
       //first lets create some new courses:
       Course c1 = new Course("Object Oriented Programming", "CS-352");
       Course c2 = new Course("Linear Programming", "CS-341");
       Course c3 = new Course("Programming Fundamentals", "CS-351");
       Course c4 = new Course("Discrete Structures", "CS-323");

       //Create two lists of course and add.
       CourseList ListOfCourses1 = new CourseList(10);
       ListOfCourses1.addCourse(c1);
       ListOfCourses1.addCourse(c2);
       ListOfCourses1.addCourse(c3);
       CourseList ListOfCourses2 = new CourseList(5);
       ListOfCourses2.addCourse(c4);
       
       //Create some students.
       Student s1 = new Student("Emma", "6043", ListOfCourses1);
       Student s2 = new Student("William", "6042", ListOfCourses1);
       Student s3 = new Student("Spencer", "6045", ListOfCourses2);
       
       StudentList studentList = new StudentList();
       studentList.addStudent(s1);
       studentList.addStudent(s2);
       studentList.addStudent(s3);
    }
}
public class Main {
    public static void main(String[] args) {

        students student1 = new students("Luke",18,3.7);
        students student2 = new students("Leia",18,4.0);
        students student3 = new students("Han Solo",25,3.1);

        /*System.out.println(student1.name);
        System.out.println(student2.age);
        System.out.println(student3.gpa);*/

        student1.study();
        student2.study();
        student3.study();

    }
}

public class Main4 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(5.1);
        Triangle t3 = new Triangle(6.2,7.1);
        Triangle t4 = new Triangle(2.4,9,3.7);
        Triangle t5 = new Triangle(t4);

        System.out.println("T1: " + t1);
        System.out.println("T2: " + t2);
        System.out.println("T3: " + t3);
        System.out.println("T4: " + t4 + "perimeter: " + t4.perimeter() + "right angled? "+ t4.isRightAngled());
        System.out.println("T5: " + t5);
       
        System.out.println("Total Triangle Objects created are: " + Triangle.objectCount());
    }
}

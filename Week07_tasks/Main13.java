package Week07_tasks;

import java.util.Arrays;

public class Main13 {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(Arrays.asList(3.0,3.2,6.5));
        Vector2D v2 = new Vector2D(Arrays.asList(2.7,8.1,4.5));
        
        System.out.println("This is sum of vector 1 and 2: " + v1.add(v2));
        System.out.println("This is size of vector 2: " + v2.calculateLength());
        System.out.println("The toString Method: " + v1.toString());
        System.out.println("The number on position 2 in Vector 2: " + v2.getI(2));
    }
}

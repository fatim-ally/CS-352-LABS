package myPracticeOOP;

public class Pen {
    private double x=0 , y=0 , angle=0;
    
    public void moveForward(double distance){
       double rad = Math.toRadians(angle);
       double  x_new = x + distance * Math.cos(rad);
       double y_new = y + distance * Math.sin(rad);
       System.out.printf("Point (x,y) = (%.2f, %.2f)%n", x_new, y_new);
       x=x_new;
       y=y_new;
    }

    public void turnRight(double degrees){
       angle=(angle+degrees) % 360;        //modulo 360 cuz of keeping it within this range
       if(angle<0){                       //if -ve angle comes then add 360 to it
            angle+=360;
        }
       System.out.printf("Turned right by (%.1f), new angle becomes (%.1f)%n",degrees,angle);
    }
    public void turnLeft(double degrees){
        angle=(angle-degrees) % 360;
        if(angle<0){                       //if -ve angle comes then add 360 to it
            angle+=360;
        }
        System.out.printf("Turned left by (%.1f), new angle becomes (%.1f)%n",degrees,angle);
    }
}

package Lab06.model;

public class Pen {
    private double x = 0;
    private double y = 0;
    private double angle = 0;

     public void forward(double distance){
        double rad = Math.toRadians(angle);
        double new_x = x + distance * Math.cos(rad);
        double new_y = y + distance * Math.sin(rad);
        System.out.printf("Drawing the line now from (%.2f,%.2f) to (%.2f,5.2f) ",x,y,new_x,new_y);
        x=new_x;
        y=new_y; 
     }
     public void turnLeft(double degree){
        angle = (angle-degree) % 360;
    }
     public void turnRight(double degree){
        angle = (angle+degree) % 360;
     }
     
}

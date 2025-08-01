public class Triangle {
   private double sideA,sideB,sideC;
   private static int objectCount=0;

    public Triangle(){
        this.sideA=1.0;
        this.sideB=1.0;
        this.sideC=1.0;
        objectCount++;
    }
    public Triangle(double side){
        this.sideA=side;
        this.sideB=side;
        this.sideC=side;
        objectCount++;
    }
    public Triangle(double x,double y){
        this.sideA=x;
        this.sideB=x;
        this.sideB=y;
        objectCount++;
    }
    public Triangle(double x,double y,double z){
        this.sideA=x;
        this.sideB=y;
        this.sideC=z;
        objectCount++;
    }
    public Triangle(Triangle other){
        this.sideA=other.sideA;
        this.sideB=other.sideB;
        this.sideC=other.sideC;
        objectCount++;
    }
//THESE ARE GETTERS:    
    public double getSideA(){
        return sideA;
    } 
    public double getSideB(){
        return sideB;
    }
    public double getSideC(){
        return sideC;
    } 
//THESE ARE SETTERS:
    public void setSideA(double a){
        this.sideA= a;
    }
    public void setSideB(double b){
        this.sideB= b;

    }
    public void setSideC(double c){
        this.sideC= c;
    }
    //OBJECT COUNT
    public static int objectCount(){
        return objectCount;
    }
    //CALCULATE THE PERIMETER:
    public double perimeter(){
        return sideA + sideB + sideC;
    }
    //CHECK IF IT IS right-angled:(pythagoras)
    public boolean isRightAngled(){
      double a = Math.pow(sideA, 2);
      double b = Math.pow(sideB, 2);
      double c = Math.pow(sideC, 2);
      return 
        Math.abs(a+b-c) < 0.0001 ||
        Math.abs(a+c-b) < 0.0001 ||
        Math.abs(b+c-a) < 0.0001 ;
    }
    public String toString(){
        return "Triangle sideA= " + sideA + " ,sideB= " + sideB + " ,sideC= " + sideC;
    }
}
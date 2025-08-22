package myPracticeOOP;

public class LeftCMD implements CommandInterface {
    private Pen p1;
    private double degrees=45;
    public LeftCMD(Pen p1){
        this.p1=p1;
    }

    public void execute(){
        p1.turnLeft(degrees);
    }
}
/*package myPracticeOOP;

public class LeftCMD implements CommandInterface {
    private double degrees;
    public LeftCMD(double degrees){
        this.degrees=degrees;
    }

    public void execute(Pen p1){
        p1.turnLeft(degrees);
    }
} */
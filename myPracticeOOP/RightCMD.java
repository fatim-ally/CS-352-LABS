package myPracticeOOP;

public class RightCMD implements CommandInterface {
    private Pen p1;
    private double degrees=45;
    public RightCMD(Pen p1){
        this.p1=p1;
    }
    public void execute(){
        p1.turnRight(degrees);
    }
}

package myPracticeOOP;

public class ForwardCMD implements CommandInterface {
    private Pen p1;
    private double distance=5.1;
    public ForwardCMD(Pen p1){
        this.p1=p1;
    }
    
    public void execute(){
        p1.moveForward(distance);
    }
}

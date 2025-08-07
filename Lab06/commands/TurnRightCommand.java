package Lab06.commands;

import Lab06.model.Pen;

//import model.Pen;
public class TurnRightCommand implements Command{
    private Pen pen;
    public TurnRightCommand(Pen pen){
        this.pen = pen;
    }
    public void execute(){
        pen.turnRight(0);
    }
}

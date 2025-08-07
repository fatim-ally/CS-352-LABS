package Lab06.commands;

import Lab06.model.Pen;

//import model.Pen;
public class TurnLeftCommand implements Command {
    private Pen pen;
    public TurnLeftCommand(Pen pen){
        this.pen = pen;
    }
    public void execute(){
        pen.turnLeft(0);
    }
}

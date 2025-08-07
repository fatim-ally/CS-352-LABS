package Lab06.commands;
import Lab06.model.Pen;
import model.pen;
public class ForwardCommand implements Command{
    private Pen pen;
     public ForwardCommand(Pen pen){
        this.pen=pen;
     }
     public void execute(){
        pen.forward(0);;
     } 
}

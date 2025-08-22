package myPracticeOOP;
import java.util.List;
import java.util.ArrayList;

public class CommandParseR{
    public List<CommandInterface> parse(String user_input,Pen p1){
       List<CommandInterface> commands = new ArrayList<>();

       for(char ch : user_input.toCharArray()){
        switch(ch){
            case 'F':
            commands.add(new ForwardCMD(p1));
            break;
            case '+':
            commands.add(new RightCMD(p1));
            break;
            case '-':
            commands.add(new LeftCMD(p1));
            break;
            default:
                System.out.println("Ignored the unknown character which you gave: " + ch); 
        }
       }
       return commands;
    }
}

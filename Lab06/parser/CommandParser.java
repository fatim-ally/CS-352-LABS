
import java.util.ArrayList;
import java.util.List;

import Lab06.commands.Command;
import Lab06.commands.ForwardCommand;
import Lab06.commands.TurnLeftCommand;
import Lab06.commands.TurnRightCommand;
import Lab06.model.Pen;

public class CommandParser {
    public List<Command> parse(String input,Pen pen){
        List<Command> commands = new ArrayList<>();

        for(char ch : input.toCharArray() ){
            switch(ch){

                case 'F':
                 commands.add(new ForwardCommand(pen));
                 break;

                case '+':
                 commands.add(new TurnRightCommand(pen));
                 break;

                case '-':
                 commands.add(new TurnLeftCommand(pen));
                 break;
                 
                default:
                System.out.println("Ignored the unknown character which you gave: " + ch); 
            }
        }
        return commands;
    }
}

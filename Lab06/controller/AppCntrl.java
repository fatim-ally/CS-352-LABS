package Lab06.controller;
//import model.Pen;
import parser.CommandParser;
import commands.Command;
import java.util.List;
import java.util.Scanner;

import Lab06.model.Pen;

public class AppCntrl {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pattern in the form of Example: F+F-F+F: ");
        String input = scanner.nextLine();

        Pen pen = new Pen();
        CommandParser parser = new CommandParser();  //we created here two objects i.e pen and parser
        List<Command> commands = parser.parse(input, pen);

        for(Command cmd : commands){
            cmd.execute();
        }

    }
}

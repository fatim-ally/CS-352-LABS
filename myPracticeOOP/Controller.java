package myPracticeOOP;
import java.util.Scanner;
import java.util.List;

public class Controller {
    public void run(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a pattern consisting ONLY of F's and +/-");
      String user_input = scanner.nextLine();
    
    Pen p1 = new Pen();
    CommandParseR parser = new CommandParseR();
    List<CommandInterface> commands = parser.parse(user_input,p1);

    for(CommandInterface cmd : commands){
        cmd.execute();
    }
    scanner.close();
  }
}

public class CuddlyToy {
   double size;
   String color,job;
    public String toString(){
        return ("size: " + size + " color: " + color + " job: " + job);
    }
}

class Teddy extends CuddlyToy{
   
}
class Bunny extends CuddlyToy{
   
}

class EngineDriver extends Teddy{
    public EngineDriver(double size){
        this.size=size;
        this.color="Blue";
        this.job="to drive!";
    }
    public void makeNoise(){
        System.out.println("Grrrrr");
    }
    public void describe(){
        System.out.println("I am a " + color + " teddy bear");
        System.out.println("My job is: " + job + ".");
        System.out.println("My size is: " + size + ".");
    }
    public String toString(){
        return "Engine Driver:\n Teddy; " + super.toString();
    }
}

class Gardener extends Teddy{
    public Gardener(double size){
        this.size=size;
        this.color = "Red";
        this.job = "gardening!";
    }
    public void makeNoise(){
        System.out.println("GRRR!");
    }
    public void describe(){
        System.out.println("I am a " + color + " teddy bear");
        System.out.println("My job is: " + job + ".");
        System.out.println("My size is: " + size + ".");
    }
    public String toString(){
        return "Gardener:\n Teddy; " + super.toString();
    }
}

class Clown extends Bunny{
   public Clown(double size){
       this.size = size;
       this.color = "White";
       this.job = "entertains people and makes them laugh!";
   }
   public void makeNoise(){
       System.out.println("squeaksqueak");
   }
   public void describe(){
       System.out.println("I am a " + color + " bunny");
       System.out.println("My job is: " + job + ".");
       System.out.println("My size is: " + size + ".");
   }
   public String toString(){
       return "Clown: \n Bunny; " + super.toString();
   }
}

class BankManager extends Bunny{
public BankManager(double size){
       this.size = size;
       this.color = "Black";
       this.job = "manages bank stuff :33";
   }
   public void makeNoise(){
       System.out.println("squeaksqueak");
   }
   public void describe(){
       System.out.println("I am a " + color + " bunny");
       System.out.println("My job is: " + job + ".");
       System.out.println("My size is: " + size + ".");
   }
   public String toString(){
       return "Bank Manager: \n Bunny; " + super.toString();
   }
}


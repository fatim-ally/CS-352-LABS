package Week08_tasks;

public class Main15 {
    public static void main(String[] args) {
        Author a = new Author("Micheal Connelly");
        Book b1 = new Book("The Poet", a);

        Book shallow = b1.shallowCopy();
        Book deep = b1.deepCopy();
        
        System.out.println("Before change:");
        System.out.println("b1 author = " + b1.author.name);
        System.out.println("shallow author = " + shallow.author.name);
        System.out.println("deep author = " + deep.author.name);

        a.name = "Robert Harris";
        
        System.out.println("\nAfter change:");
        System.out.println("b1 author = " + b1.author.name);
        System.out.println("shallow author = " + shallow.author.name); // changes too
        System.out.println("deep author = " + deep.author.name); 

    }
}

package Week08_tasks;
class Author {
    String name;
    public Author(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
}
class Book {
    String title;
    Author author;
   public Book(String title,Author author){
       this.title=title;
       this.author=author;
   }
   Book shallowCopy(){
       return new Book(this.title,this.author);
   }
   Book deepCopy(){
       return new Book(this.title,new Author(this.author.name));
   }
}
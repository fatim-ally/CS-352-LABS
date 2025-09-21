package Week_12;

public class Course {
   private String name;
   private String code;

    public Course( String name,String code){
       this.name=name;
       this.code=code;
    }
    public Course(Course other,String newCode){
        this.name=other.name;
        this.code=newCode;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getCode(){
        return code;
    }
    public void setCode(String code){
        this.code=code;
    }
    @Override
    public String toString(){
        return name + "," + code;
    }
}

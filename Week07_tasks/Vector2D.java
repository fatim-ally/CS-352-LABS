package Week07_tasks;

//must import List!
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Vector2D {
    private List<Double> coordinates;

    public Vector2D(List<Double> coords){
       this.coordinates = new ArrayList<>(coords);   //we made a deep copy 
    }

    //this is how you get and set when using Arrays:
    public double getI(int i){
       return coordinates.get(i);
    }
    public void setI(int i, double val){
       coordinates.set(i, val);                      
    }

    //this method will return the NUMBER OF DIMENSIONS
    public int calculateLength(){
       return coordinates.size();
    }

    //we're copying and adding for eg inputs: v1=[2.1,3.0] v2=[2.1,4.0] Result: [4.2 , 7.0]
    public Vector2D add(Vector2D other){
       if(this.calculateLength()!=other.calculateLength()){
        throw new IllegalArgumentException("Both the dimensions of the vectors must be equal");
       }
       List<Double> sumResult = new ArrayList<>();
       for(int i=0; i<calculateLength(); i++){
        sumResult.add(this.getI(i)+other.getI(i));
       }
       return new Vector2D(sumResult);
    }

    public Vector2D clone(){
        return new Vector2D(this.coordinates);
    }

    public String toString(){
        return coordinates.toString() ;
    }

    /*public boolean equals(Object o){
        I dont understand
    }*/
    
    public Iterator<Double> iterator(){
        return coordinates.iterator();
    }

}

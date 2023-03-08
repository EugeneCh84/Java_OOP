package Seminar_3;

import java.io.IOException;
import java.util.ArrayList;


public interface Research {
       
    ArrayList<Person> spend(Person p, PersonRelations re) throws IOException; 
       
    public ArrayList<String> searchAge() throws IOException; 
    
    
}

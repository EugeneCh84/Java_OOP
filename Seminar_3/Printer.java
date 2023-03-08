package Seminar_3;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public interface Printer {
    void print() throws IOException;


    default void print(ArrayList<Person> personlist) throws IOException{
        FileWriter filewr = new FileWriter("Result.txt", true);
        for (Person person:personlist){
            filewr.write(person.getFullName());
            filewr.write('\n');
        }
        filewr.flush();

    }

    
    
}

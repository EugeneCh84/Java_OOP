package Seminar_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public interface GeoTree extends Printer{
    ArrayList<Node> tree = new ArrayList<>();

    default ArrayList<Node> getTree() {
        return tree;
    }

   
    void appendPerentChild(Person parent, Person children);
       
    void appendVifeHusbent(Person vife, Person husbent); 

    default void print() throws IOException{
        FileWriter filewr = new FileWriter("Result.txt", true);
        for (Node node:getTree()){
            filewr.write(node.toString());
            filewr.write('\n');
        }
        filewr.flush();

    }
        
    
}

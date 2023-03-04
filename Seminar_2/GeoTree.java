package Java_OOP.Seminar_2;

import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

   
    public void appendPerentChild(Person parent, Person children) {
        tree.add(new Node(parent, PersonRelations.parent, children));
        tree.add(new Node(children, PersonRelations.children, parent));
    }

    
    public void appendVifeHusbent(Person vife, Person husbent) {
        tree.add(new Node(vife, PersonRelations.vife, husbent));
        tree.add(new Node(husbent, PersonRelations.husbent, vife));
    }
}

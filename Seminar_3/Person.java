package Seminar_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Person implements GeoTree, Research, Printer{
    public String fullName;
    public int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString(){
        return fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void appendPerentChild(Person parent, Person children) {
        tree.add(new Node(parent, PersonRelations.parent, children));
        tree.add(new Node(children, PersonRelations.children, parent));
    }

    @Override
    public void appendVifeHusbent(Person vife, Person husbent) {
        tree.add(new Node(vife, PersonRelations.vife, husbent));
        tree.add(new Node(husbent, PersonRelations.husbent, vife));
    }
    @Override
    public ArrayList<Person> spend(Person p, PersonRelations re) throws IOException {
        ArrayList<Person> result = new ArrayList<>();
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2);
            }
        }
        print(result);
        return result;
    }

    @Override
    public ArrayList<String> searchAge() throws IOException {
        System.out.print("Введите ограничение по возрасту: ");
        ArrayList<String> resultAge = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println("Люди, младше: " + age + ":");
        in.close();

        for (Node t : tree) {

            if (t.p1.age <= age && !resultAge.contains(t.p1.fullName)) {
                resultAge.add(t.p1.fullName);
            }
        }
        
        return resultAge;
    }
    
}

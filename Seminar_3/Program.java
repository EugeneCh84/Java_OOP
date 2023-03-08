package Seminar_3;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        
    
        Person irina = new Person("Ирина", 56);
        Person igor = new Person("Игорь", 60);
        Person vasya = new Person("Вася", 30);
        Person masha = new Person("Маша", 27);
        Person jane = new Person("Женя", 10);
        Person ivan = new Person("Ваня", 8);
        Person Sasha = new Person("Саша", 9);
        Person newp = new Person(null, 0);

        newp.appendPerentChild(irina, vasya);
        newp.appendPerentChild(irina, masha); 
        newp.appendPerentChild(vasya, jane); 
        newp.appendPerentChild(vasya, ivan); 
        newp.appendVifeHusbent(irina, igor); 
        newp.appendPerentChild(igor, vasya); 
        newp.appendPerentChild(igor, masha); 
        newp.appendPerentChild(igor, Sasha); 

       
        
        newp.print();
        

        
    }
    
}

package Java_OOP.Seminar_2;

public class Program {
    public static void main(String[] args) {
        
    
        Person irina = new Person("Ирина", 56);
        Person igor = new Person("Игорь", 60);
        Person vasya = new Person("Вася", 30);
        Person masha = new Person("Маша", 27);
        Person jane = new Person("Женя", 10);
        Person ivan = new Person("Ваня", 8);
        Person Sasha = new Person("Саша", 9);
        GeoTree gt = new GeoTree();

        gt.appendPerentChild(irina, vasya);
        gt.appendPerentChild(irina, masha); 
        gt.appendPerentChild(vasya, jane); 
        gt.appendPerentChild(vasya, ivan); 
        gt.appendVifeHusbent(irina, igor); 
        gt.appendPerentChild(igor, vasya); 
        gt.appendPerentChild(igor, masha); 
        gt.appendPerentChild(igor, Sasha); 

       
        System.out.println("Дети Ирины");
        System.out.println(new Research(gt).spend(irina, PersonRelations.parent));
        
        System.out.println("Дети Игоря");
        System.out.println(new Research(gt).spend(igor, PersonRelations.parent));

        
        System.out.println("Муж Ирины");
        System.out.println(new Research(gt).spend(irina, PersonRelations.vife));

        
        System.out.println(new Research(gt).searchAge());
    }

}

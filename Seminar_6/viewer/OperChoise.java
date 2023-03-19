package Seminar_6.viewer;

public class OperChoise extends InputNumbers {

    public int operType;

    public int operChoise(){
        System.out.println("Enter Type of operation Complex or Rational:"+
                            "\n1. Complex" +
                            "\n2. Rational");
        int operType = (int)getUserNumbers();
        
    return operType;
    }
    
}

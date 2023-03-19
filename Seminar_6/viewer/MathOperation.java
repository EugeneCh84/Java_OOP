package Seminar_6.viewer;

public class MathOperation extends InputNumbers{
    
    public int mathOperation (){

        System.out.println("Enter math operation:"+
                            "\n1. Summary" +
                            "\n2. Difference" +
                            "\n3. Multiplication" +
                            "\n4. Division");
        int mathSign = (int)getUserNumbers();

    return mathSign;
                     
    }
}

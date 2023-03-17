package Seminar_5;

import java.util.Scanner;

public class Veiw {

    public int mathOperation (){
        System.out.println("Enter math operation:"+
                            "\n1. Summary" +
                            "\n2. Difference" +
                            "\n3. Multiplication" +
                            "\n4. Division");
        Scanner in = new Scanner(System.in);
        int mathSign = in.nextInt();
        //in.close();
        return mathSign;
        
    } 
    
    public int operChoise(){
        System.out.println("Enter Type of operation Complex or Rational:"+
                            "\n1. Complex" +
                            "\n2. Rational");
        Scanner in = new Scanner(System.in);
        int operationType = in.nextInt();
        //in.close();
        return operationType;
    }

    public Double getUserNumbers(){
        
        Scanner in = new Scanner(System.in);
        double userNumber = in.nextDouble();
        //in.close();
        return userNumber;
    }
    
    public void printComplex(Complex str){
        System.out.println(str);
    }
}

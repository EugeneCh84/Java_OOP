package Seminar_6.presenter;

import Seminar_6.model.ComplexCalc;
import Seminar_6.viewer.InputNumbers;
import Seminar_6.viewer.MathOperation;

public class CalculateComplex extends Switch_Case{

    InputNumbers inputNumbers;
    ComplexCalc compcalc;
    MathOperation mo;
    //Switch_Case sc = new Switch_Case();

    public void calculateComplex () {

        inputNumbers = new InputNumbers();
        compcalc = new ComplexCalc();
        mo = new MathOperation();

        System.out.println("Enter number X:");
        compcalc.setX(inputNumbers.getUserNumbers());
        System.out.println("Enter number A:");
        compcalc.setA(inputNumbers.getUserNumbers());
        System.out.println("Enter number Y:");
        compcalc.setY(inputNumbers.getUserNumbers());
        System.out.println("Enter number B:");
        compcalc.setB(inputNumbers.getUserNumbers());

        userCase(mo.mathOperation(), compcalc);

    }
    
}

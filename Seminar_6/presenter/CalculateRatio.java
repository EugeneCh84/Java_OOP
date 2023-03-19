package Seminar_6.presenter;

import Seminar_6.model.RatioCalc;
import Seminar_6.viewer.InputNumbers;
import Seminar_6.viewer.MathOperation;

public class CalculateRatio extends Switch_Case {

    InputNumbers inputNumbers;
    RatioCalc ratiocalc;
    MathOperation mo;
    //Switch_Case sc = new Switch_Case();

    public void calculateRatio () {

        inputNumbers = new InputNumbers();
        ratiocalc = new RatioCalc();
        mo = new MathOperation();
        
        System.out.println("Enter number X:");
        ratiocalc.setX(inputNumbers.getUserNumbers());
        System.out.println("Enter number Y:");
        ratiocalc.setY(inputNumbers.getUserNumbers());
        
        userCase(mo.mathOperation(), ratiocalc);
    }
}

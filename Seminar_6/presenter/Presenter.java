package Seminar_6.presenter;


import Seminar_6.presenter.CalculateComplex;
import Seminar_6.viewer.OperChoise;;

public class Presenter {
    
    CalculateComplex cc;
    CalculateRatio cr;  
    OperChoise oc;

    
    public void calculation() {

        oc = new OperChoise();
        cc = new CalculateComplex();
        cr = new CalculateRatio();
        
        switch (oc.operChoise()){
            case 1:
                cc.calculateComplex();
            break;
            case 2:
                cr.calculateRatio();
            break;
        }
    }
}

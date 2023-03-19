package Seminar_6;


import Seminar_6.model.Complex;
import Seminar_6.presenter.Presenter;
import Seminar_6.viewer.OperChoise;
import Seminar_6.viewer.View;

public class Main {

    
    public static void main(String[] args) {
        var c = new Complex(0, 0);
        var v = new View();    
        Presenter pr = new Presenter();
        //OperChoise oc = new OperChoise();
        
        pr.calculation();
        v.printComplex(c);
    }
    
}

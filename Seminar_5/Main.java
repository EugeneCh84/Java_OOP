package Seminar_5;

public class Main {
    public static void main(String[] args) {
        var cc = new ComplexCalc();
        var v = new Veiw();    
        Presenter pr = new Presenter(v,cc);
        pr.calculation();
    }
    
}

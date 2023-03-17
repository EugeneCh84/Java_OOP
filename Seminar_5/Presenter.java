package Seminar_5;

public class Presenter {

    Veiw view;
    ComplexCalc compcalc;

    public Presenter(Veiw view, ComplexCalc compcalc) {
        this.view = view;
        this.compcalc = compcalc;
    }

    public void calculateComplex(){
        System.out.println("Enter number X:");
        compcalc.setX(view.getUserNumbers());
        System.out.println("Enter number A:");
        compcalc.setA(view.getUserNumbers());
        System.out.println("Enter number Y:");
        compcalc.setY(view.getUserNumbers());
        System.out.println("Enter number B:");
        compcalc.setB(view.getUserNumbers());

        switch (view.mathOperation()){
            case 1:
                System.out.println(compcalc.summ());
            break;
            case 2:
                System.out.println(compcalc.diff());
            break;
            case 3:
                System.out.println(compcalc.mult());
            break;
            case 4:
                System.out.println(compcalc.divide());
            break;
        }
    }

    public void calculateRatio(){

        Ratio ratioCalc = new Ratio();
        System.out.println("Enter number X:");
        ratioCalc.setX(view.getUserNumbers());
        System.out.println("Enter number Y:");
        ratioCalc.setY(view.getUserNumbers());

        switch (view.mathOperation()){
            case 1:
                System.out.println(ratioCalc.summ());
            break;
            case 2:
                System.out.println(ratioCalc.diff());
            break;
            case 3:
                System.out.println(ratioCalc.mult());
            break;
            case 4:
                System.out.println(ratioCalc.divide());
            break;
        }
    }

    public void calculation() {
        switch (view.operChoise()){
            case 1:
                calculateComplex();
            break;
            case 2:
                calculateRatio();
            break;
        }
    }
}

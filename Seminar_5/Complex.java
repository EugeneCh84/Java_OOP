package Seminar_5;

public class Complex extends SetDigits {
    
    public Complex(double x, double y){
        this.x = x;
        this.y = y;
        Logger.logDate("Complex number " + x + " , " + y + "i created");
    } 

    @Override
    public String toString(){
        return (x + "" + y + "i");
    }
    
}

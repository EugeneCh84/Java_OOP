package Seminar_6.model;

import Seminar_6.logger.Logger;

public class SetDigits {
    protected double x;
    protected double y;
    protected double a;
    protected double b;

    public double getX() {
        return x;        
    }

    public void setX(double x) {
        this.x = x;
        Logger.logDate("Number X:" + x);
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
        Logger.logDate("Number Y:" + y);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
        Logger.logDate("Number A:" + a);
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
        Logger.logDate("Number B:" + b);
    }
    
}

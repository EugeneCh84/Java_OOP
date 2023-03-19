package Seminar_6.model;

import Seminar_6.logger.Logger;

public class ComplexCalc extends SetDigits implements Model <Complex>{
    @Override
    public Complex summ() {
        Logger.logDate("Summ:");

        
        return new Complex((x + a),(y + b));
    }

    @Override
    public Complex diff() {
        Logger.logDate("Difference:");
        return new Complex((x - a),(y - b));
    }

    @Override
    public Complex mult() {
        Logger.logDate("Multiplay :");
        return new Complex((x*a -y*b),(y*a + b*x));
    }

    @Override
    public Complex divide() {
        Logger.logDate(":");
        return new Complex((x*a + y*b)/(y*y + b*b),(y*a - b*x)/(y*y + b*b));
    }

}

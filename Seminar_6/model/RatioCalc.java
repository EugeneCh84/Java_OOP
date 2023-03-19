package Seminar_6.model;

import Seminar_6.logger.Logger;

public class RatioCalc extends SetDigits implements Model{
    @Override
    public Double summ() {
        Logger.logDate("Summ:" + x + y);
        return (x + y);
    }

    @Override
    public Double diff() {
        Logger.logDate("Difference:");
        return (x - y);
    }

    @Override
    public Double mult() {
        Logger.logDate("Multiplay :");
        return (x * y);
    }

    @Override
    public Double divide() {
        Logger.logDate("Division:");
        return (x / y);
    }
    
}

package Seminar_5;

public class Ratio extends SetDigits implements Model{

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

package Seminar_6.viewer;

import java.util.Scanner;

public class InputNumbers {

    protected Double userNumber;

    public double getUserNumbers(){
        
        Scanner in = new Scanner(System.in);
        userNumber = in.nextDouble();
        //in.close();
        return userNumber;
    }

    public double getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Double userNumber) {
        this.userNumber = userNumber;
    }

    

}

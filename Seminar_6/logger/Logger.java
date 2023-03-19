package Seminar_6.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
    public static void logDate(String msg){
        
        try(FileWriter file = new FileWriter("./Seminar_6/Log.txt", true)) {
            Date currentDT = new Date();
            StringBuilder sb = new StringBuilder();
            sb.append(currentDT.toString() + ":" + msg + "\n");
            file.append(sb);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        } 
    
    }
}

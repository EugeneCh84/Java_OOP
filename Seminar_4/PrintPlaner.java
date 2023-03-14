package Seminar_4;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintPlaner {
    ArrayList<String> planer = new ArrayList<>();
    ArrayList<String[]> planerSplite = new ArrayList<>();
    private Scanner file;

    public PrintPlaner() {

    }

    public ArrayList<String> planerArrayList() throws IOException {
        FileReader inFile = new FileReader("Seminar_4/planer.csv");
        file = new Scanner(inFile);

        while (file.hasNextLine()) {
            String line = file.nextLine();
            planer.add(line);
        }

        return planer;

    }

    public ArrayList<String[]> planerSplite(ArrayList<String> planer) {
        for (String element : planer) {

            String[] lineTemp = element.split(";");
            planerSplite.add(lineTemp);

        }
        return planerSplite;
    }

    public void printPlaner(ArrayList<String[]> planerSplite) {
        for (String[] element : planerSplite) {

            for (int i = 0; i < element.length; i++) {
                System.out.print(element[i] + " ");
            }
            System.out.print("\n");
        }
    }
}

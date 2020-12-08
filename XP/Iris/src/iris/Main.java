package iris;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File myFile = null;
        if (args.length > 0) {
            myFile = new File(args[0]);
        } else {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter filename you wish to process:");
            String fileName = scanner.nextLine();
            myFile = new File(fileName);
        }

        ArrayList<Iris> irisList = new ArrayList<>();

        Iris.read(myFile, irisList);
        Iris.calculate(irisList);
    }
}

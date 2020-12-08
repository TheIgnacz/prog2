package iris;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Iris {

    public static final String IRIS_SETOSA = "Iris-setosa";
    public static final String IRIS_VERSICOLOR = "Iris-versicolor";
    public static final String IRIS_VIRGINICA = "Iris-virginica";

    double petalWidth;
    double septalWidth;
    double petalHeight;
    double septalHeight;
    String name;

    public Iris(double petalWidth, double septalWidth, double petalHeight, double septalHeight, String name) {
        this.petalWidth = petalWidth;
        this.septalWidth = septalWidth;
        this.petalHeight = petalHeight;
        this.septalHeight = septalHeight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Iris{" +
                "petalWidth=" + petalWidth +
                ", septalWidth=" + septalWidth +
                ", petalHeight=" + petalHeight +
                ", septalHeight=" + septalHeight +
                ", name='" + name + '\'' +
                '}';
    }

    public static void read(File myFile, ArrayList<Iris> irisList) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader(myFile));
        while (s.hasNext()) {
            String line = s.nextLine();
            String[] unit = line.split(",");
            irisList.add(new Iris(Double.valueOf(unit[0]), Double.valueOf(unit[1]), Double.valueOf(unit[2]),Double.valueOf(unit[3]), unit[4]));
            }
    }

    public static double count(ArrayList<Iris> irisList, String name) {
        double counter = 0;
        for ( Iris i : irisList) {
            if ( i.name.contains(name)) {
                counter++;
            }
        }

        return counter;
    }

    public static double[] sum(ArrayList<Iris> irisList, String name) {
        double[] data = new double[4]; //0: PetalWidth, 1: septalWidth, 2: petalHeight, 3: septalHeight
        for ( Iris i : irisList) {
            if ( i.name.contains(name)) {
                data[0] += i.petalWidth;
                data[1] += i.septalWidth;
                data[2] += i.petalHeight;
                data[3] += i.septalHeight;
            }
        }
        return data;
    }

    public static void calculate(ArrayList<Iris> irisList) {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        printFlowerType(irisList, df, IRIS_SETOSA);
        printFlowerType(irisList, df, IRIS_VERSICOLOR);
        printFlowerType(irisList, df, IRIS_VIRGINICA);
    }

    private static void printFlowerType(ArrayList<Iris> irisList, DecimalFormat df, String irisType) {
        double[] sumArray = sum(irisList, irisType);
        double count = count(irisList, irisType);
        System.out.println(df.format(sumArray[0]/count) + " " +
                df.format(sumArray[1]/count) + " " +
                df.format(sumArray[2]/count) + " " +
                df.format(sumArray[3]/count));
    }
}

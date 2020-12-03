package iris;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File myFile = new File("iris.data");
        ArrayList<Iris> iris = new ArrayList<>();

        try (Scanner s = new Scanner(new FileReader(myFile))) {
            while (s.hasNext()) {
                String line = s.nextLine();
                String[] unit = line.split(",");
                iris.add(new Iris(Double.valueOf(unit[0]), Double.valueOf(unit[1]), Double.valueOf(unit[2]),Double.valueOf(unit[3]), unit[4]));
                //System.out.println(s.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int setosaCount = 0;
        double setosaPetalWidth = 0;
        double septalWidth = 0;
        double setosaPetalHeight = 0;
        double septalHeight = 0;

        int versicolorCount = 0;
        double versicolorPetalWidth = 0;
        double versicolorWidth = 0;
        double versicolorPetalHeight = 0;
        double versicolorHeight = 0;

        int virginicalCount = 0;
        double virginicaPetalWidth = 0;
        double virginicaWidth = 0;
        double virginicaPetalHeight = 0;
        double virginicaHeight = 0;

        for( Iris i : iris) {
            switch(i.name) {
                case "Iris-setosa":
                    setosaCount++;
                case "Iris-versicolor":
                    versicolorCount++;
                case "Iris-virginica":
                    virginicalCount++;
            }
        }

        for( Iris i : iris) {
            switch(i.name) {
                case "Iris-setosa":
                    setosaPetalWidth += i.petalWidth;
                    septalWidth += i.septalWidth;
                    setosaPetalHeight += i.petalHeight;
                    septalHeight += i.septalHeight;
                case "Iris-versicolor":
                    versicolorPetalWidth += i.petalWidth;
                    versicolorWidth += i.septalWidth;
                    versicolorPetalHeight += i.petalHeight;
                    versicolorHeight += i.septalHeight;
                case "Iris-virginica":
                    virginicaPetalWidth += i.petalWidth;
                    virginicaWidth += i.septalWidth;
                    virginicaPetalHeight += i.petalHeight;
                    virginicaHeight += i.septalHeight;
            }
        }

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(df.format(setosaPetalWidth/setosaCount) + " " + df.format(septalWidth/setosaCount) + " " + df.format(setosaPetalHeight/setosaCount) + " " + df.format(septalHeight/setosaCount));
        System.out.println(df.format(versicolorPetalWidth/versicolorCount) + " " + df.format(versicolorWidth/versicolorCount) + " " + df.format(versicolorPetalHeight/versicolorCount) + " " + df.format(versicolorHeight/versicolorCount));
        System.out.println(df.format(virginicaPetalWidth/virginicalCount) + " " + df.format(virginicaWidth/virginicalCount) + " " + df.format(virginicaPetalHeight/virginicalCount) + " " + df.format(virginicaHeight/virginicalCount));


    }
}

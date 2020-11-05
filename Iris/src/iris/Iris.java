package iris;

public class Iris {
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
}

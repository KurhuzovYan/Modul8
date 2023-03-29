package modul8;

public class Rhombus extends Shape {
    private String name = "Rhombus";
    private double diagonal1;
    private double diagonal2;

    public Rhombus() {
    }

    public Rhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public String getName() {
        return name;
    }

    @Override
    String getShape() {
        return new Rhombus().getName();
    }

    @Override
    double getArea() {
        return (diagonal1 * diagonal2) / 2;
    }
}

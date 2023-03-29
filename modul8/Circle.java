package modul8;

public class Circle extends Shape implements CalculatingCircleArea {

    private String name = "Circle";
    private double diameter;

    public Circle() {
    }

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    @Override
    String getShape() {
        return new Circle().getName();
    }

    @Override
    public double getArea() {
        return PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double getRadius() {
        return diameter / 2;
    }
}

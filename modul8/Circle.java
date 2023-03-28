package modul8;

public class Circle extends Shape implements CalculatingCircleArea {

    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public double calculateArea() {
       return PI * Math.pow(radius, 2);
    }
    @Override
    public void nameOfFigure() {
        System.out.println("This is Circle");
    }
}

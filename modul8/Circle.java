package modul8;

public class Circle extends Shape implements CalculatingCircleArea {

    private double diameter;

    public Circle(){
    }
    public Circle(double diameter) {
        this.diameter = diameter;
    }
    @Override
    public double getArea() {
        return PI * Math.pow(getRadius(), 2);
    }
    @Override
    public double getRadius() {
        return diameter / 2;
    }
    @Override
    public void nameOfFigure() {
        System.out.println("This is Circle");
    }
}

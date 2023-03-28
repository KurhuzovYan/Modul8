package modul8;

public class GetNameOfFigure {
    public static void main(String[] args) {

        Shape quad = new Quad();
        Shape rhombus = new Rhombus();
        Shape circle = new Circle();
        Circle circle2 = new Circle(30);
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle(2, 4, 5);

        quad.nameOfFigure();
        rhombus.nameOfFigure();
        rectangle.nameOfFigure();
        triangle.nameOfFigure();
        System.out.println("Result of calculation Triangle area: " + String.format("%.2f", triangle.getArea()));
        circle.nameOfFigure();
        System.out.println("Result of calculation Circle area: " + String.format("%.2f", circle2.getArea()));
        System.out.println("Result of calculation Circle radius: " + String.format("%.2f", circle2.getRadius()));
    }
}

package modul8;

public class GetNameOfFigure {
    public static void main(String[] args) {

        Shape quad = new Quad(36.76f);
        Shape circle = new Circle();
        Circle circle2 = new Circle(30);
        Shape triangle = new Triangle(2, 4, 5);
        Shape rectangle = new Rectangle(4,6);
        Shape rhombus = new Rhombus(3, 4);

        System.out.println("Rhombus area: " + String.format("%.2f", rhombus.getArea()));
        System.out.println("Rectangle area: " +  String.format("%.2f", rectangle.getArea()));
        System.out.println("Quad area: " +  String.format("%.2f", quad.getArea()));
        System.out.println("Triangle area: " + String.format("%.2f", triangle.getArea()));
        System.out.println("Circle area: " + String.format("%.2f", circle2.getArea()));
        System.out.println("Circle radius: " + String.format("%.2f", circle2.getRadius()));
        System.out.println();

        Shape[] allFigure = {circle, quad, triangle, rectangle, rhombus};
        PrintFigure print = new PrintFigure();

        print.getName(allFigure);

    }
}

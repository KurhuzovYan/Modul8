package modul8;

public class GetNameOfFigure {
    public static void main(String[] args) {

        Shape quad = new Quad(36.76f);
        Shape circle = new Circle();
        Circle circle2 = new Circle(30);
        Shape triangle = new Triangle(2, 4, 5);
        Shape rectangle = new Rectangle(4,6);
        Shape rhombus = new Rhombus(3, 4);

//        rhombus.nameOfFigure();
//        System.out.println("Rhombus area: " + String.format("%.2f", rhombus.getArea()));
//        rectangle.nameOfFigure();
//        System.out.println("Rectangle area: " +  String.format("%.2f", rectangle.getArea()));
//        quad.nameOfFigure();
//        System.out.println("Quad area: " +  String.format("%.2f", quad.getArea()));
//        triangle.nameOfFigure();
//        System.out.println("Triangle area: " + String.format("%.2f", triangle.getArea()));
//        circle.nameOfFigure();
//        System.out.println("Circle area: " + String.format("%.2f", circle2.getArea()));
//        System.out.println("Circle radius: " + String.format("%.2f", circle2.getRadius()));

        PrintFigure print = new PrintFigure();
        print.getName(circle);
        print.getName(rectangle);
        print.getName(quad);
        print.getName(rhombus);
        print.getName(triangle);
    }
}

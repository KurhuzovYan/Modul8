package modul8;

public class GetNameOfFigure {
    public static void main(String[] args) {
        Circle circle = new Circle(30.8f);
        Shape quad = new Quad();
        Shape rectangle = new Rectangle();
        Shape rhombus = new Rhombus();
        Shape triangle = new Triangle();

        circle.nameOfFigure();
        quad.nameOfFigure();
        triangle.nameOfFigure();
        rectangle.nameOfFigure();
        rhombus.nameOfFigure();
        System.out.println(String.format("%.2f", circle.calculateArea()));
        System.out.println(String.format("%.2f", circle.getRadius()));
    }
}

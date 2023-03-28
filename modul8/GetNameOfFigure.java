package modul8;

public class GetNameOfFigure{
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape rectangle = new Rectangle();
        Shape rhombus = new Rhombus();
        Shape triangle = new Triangle();

        circle.nameOfFigure();
        quad.nameOfFigure();
        triangle.nameOfFigure();
        rectangle.nameOfFigure();
        rhombus.nameOfFigure();
    }
}

package modul8;

public class PrintFigure {
    public void getName(Shape[] shape){
        for (Shape sp: shape) {
            sp.nameOfFigure();
        }
    }
}

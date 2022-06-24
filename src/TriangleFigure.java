public class TriangleFigure extends BaseFigura{

    public TriangleFigure(int x, int y) {
        super(x, y);
    }

    public double area(){
        double s = x/2 * y;
        return (s);
    }

}
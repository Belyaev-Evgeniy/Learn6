public class CircleFigura extends BaseFigura {
    public CircleFigura(int x, int y) {
        super(x, y);
    }
    public double area(){
        int d = x + y;
        double s = (d * d) / (4 * 3.14);
        return (s);
    }
}
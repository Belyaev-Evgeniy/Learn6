public class BaseFigura {
    int x;
    int y;

    public BaseFigura(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double area(){
        double s = x * y;
        return (s);
    }
}
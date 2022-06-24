import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("X = ");
        int x = scanner.nextInt();
        System.out.print("Y = " );
        int y = scanner.nextInt();
        BaseFigura baseFigura = new BaseFigura(x, y);
        TriangleFigure tringleFigera = new TriangleFigure(x, y);
        CircleFigura circleFigura = new CircleFigura(x, y);

        System.out.println("Площадь Базовой фигуры" + baseFigura.area());
        System.out.println("Площадь Треугольника" + tringleFigera.area());
        System.out.println("Площадь Круга" + circleFigura.area());
    }
}
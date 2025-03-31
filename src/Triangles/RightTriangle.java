package Triangles;

public class RightTriangle extends Triangles.Triangle {
    private double base; // основание (катет)
    private double height; // высота (катет)

    public RightTriangle(double base, double height) {
        super(base, height, Math.sqrt(base * base + height * height)); // гипотенуза вычисляется по теореме Пифагора
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height; // Площадь прямоугольного треугольника
    }

    @Override
    public double getPerimeter() {
        return base + height + side3; // Периметр: основание + высота + гипотенуза
    }
}

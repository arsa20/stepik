package Triangles;

public class IsoscelesTriangle extends Triangles.Triangle  {
    private double base; // основание
    private double height; // высота

    public IsoscelesTriangle(double base, double height) {
        super(base, base, 0); // две стороны равны
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        // Периметр = основание + два равных боковых
        double side = Math.sqrt(Math.pow(base / 2, 2) + Math.pow(height, 2)); // находим боковую сторону с использованием теоремы Пифагора
        return base + 2 * side;
    }
}

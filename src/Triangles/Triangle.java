package Triangles;

public abstract class Triangle {
    protected double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Метод для расчёта периметра
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Абстрактный метод для расчёта площади, чтобы его реализовали в наследниках
    public abstract double getArea();
}

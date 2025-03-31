package Triangles;

public class EquilateralTriangle extends Triangles.Triangle  {

    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * Math.pow(side1, 2); // Площадь равностороннего треугольника
    }

    @Override
    public double getPerimeter() {
        return 3 * side1; // Периметр равностороннего треугольника
    }
}

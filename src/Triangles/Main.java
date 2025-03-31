package Triangles;

public class Main {
    public static void main(String[] args) {
        // Пример использования классов
        Triangles.Triangle equilateral = new EquilateralTriangle(5);
        System.out.println("Равносторонний треугольник:");
        System.out.println("Площадь: " + equilateral.getArea());
        System.out.println("Периметр: " + equilateral.getPerimeter());

        Triangle isosceles = new IsoscelesTriangle(6, 8);
        System.out.println("\nРавнобедренный треугольник:");
        System.out.println("Площадь: " + isosceles.getArea());
        System.out.println("Периметр: " + isosceles.getPerimeter());

        Triangle right = new RightTriangle(3, 4);
        System.out.println("\nПрямоугольный треугольник:");
        System.out.println("Площадь: " + right.getArea());
        System.out.println("Периметр: " + right.getPerimeter());
    }
}

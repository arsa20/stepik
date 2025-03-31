import Triangles.EquilateralTriangle;
import Triangles.IsoscelesTriangle;
import Triangles.RightTriangle;
import Triangles.Triangle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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

        String inputFile = "input.txt";
        String line = readLineFromFile(inputFile);

        if (line != null) {
            System.out.println("Считанная строка из файла: " + line);
        } else {
            System.out.println("Не удалось прочитать строку из файла.");
        }
    }

    // Метод для чтения одной строки из файла
    public static String readLineFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.readLine();  // Считываем одну строку
        } catch (IOException e) {
            e.printStackTrace();  // Выводим ошибку, если файл не найден или возникли другие проблемы
            return null;
        }
    }
}


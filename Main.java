public class Main import Triangles.EquilateralTriangle;
import Triangles.IsoscelesTriangle;
import Triangles.RightTriangle;
import Triangles.Triangle;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Пример использования классов
        Triangle equilateral = new EquilateralTriangle(5);
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

        // Путь к файлам
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Чтение строки из файла
        String line = readLineFromFile(inputFile);

        if (line != null) {
            System.out.println("Считанная строка из файла: " + line);
        } else {
            System.out.println("Не удалось прочитать строку из файла.");
        }

        // Запись строки в output.txt
        writeLineToFile(outputFile, "Ответ: " + line);
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

    // Метод для записи строки в файл
    public static void writeLineToFile(String fileName, String line) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println(line);  // Записываем строку в файл
            System.out.println("Запись в файл " + fileName + " завершена.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
{
}

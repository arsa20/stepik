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

        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Чтение строк из файла и обработка
        List<String> inputLines = readLinesFromFile(inputFile);

        if (inputLines != null) {
            // Создаем и открываем файл для записи
            try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
                // Обрабатываем каждую строку
                for (String line : inputLines) {
                    String result = calculate(line);
                    writer.println(line + " = " + result);  // Записываем в файл
                    System.out.println(line + " = " + result); // Печатаем в консоль
                }
                System.out.println("Запись в файл " + outputFile + " завершена.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Не удалось прочитать строки из файла.");
        }
    }

    // Метод для чтения всех строк из файла
    public static List<String> readLinesFromFile(String fileName) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            return lines;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Метод для вычисления ответа для строки (простой калькулятор)
    public static String calculate(String expression) {
        try {
            // Используем eval для вычисления арифметического выражения
            return String.valueOf(eval(expression));
        } catch (Exception e) {
            return "Ошибка вычисления"; // В случае ошибки в вычислениях
        }
    }

    // Простой метод для вычисления арифметических выражений
    // Можно использовать библиотеки или написать парсер, но для простоты используем eval
    public static double eval(String expression) throws Exception {
        // Используем встроенную JavaScript библиотеку для выполнения математических операций
        // Это временное решение, чтобы продемонстрировать работу
        javax.script.ScriptEngine engine = new javax.script.ScriptEngineManager().getEngineByName("JavaScript");
        return ((Number) engine.eval(expression)).doubleValue();
    }
}
}

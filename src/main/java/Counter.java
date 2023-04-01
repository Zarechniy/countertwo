import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int length = scanner.nextInt();

        double[] array = new double[length];
        System.out.println("Создан массив размером " + length);

        System.out.println("Заполняем массив элементами:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextDouble();
        }

        System.out.println("Считаем среднее арифметическое всех элементов массива");
        double avg = 0;
        if (array.length > 0)
        {
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            avg = sum / array.length;
        }
        System.out.println("Среднее арифметическое = " + avg);

        System.out.println("Умножкаем все элементы массива на среднее арифметическое");
        for (double v : array) {
            System.out.println(v * avg);
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Logger logger = Logger.getInstance();
        logger.log("Запрашиваем входные данные");

        System.out.print("Введите размер списка: ");
        int size = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int max = scanner.nextInt();
        logger.log("Создаем список");

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(max));
        }
        System.out.print("Сгенерированный список: " + list);
        System.out.println();

        logger.log("Запрашиваем данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int threshold = scanner.nextInt();
        Filter filter = new Filter(threshold);
        List<Integer> result = filter.filterOut(list);

        logger.log("Выводим результат");
        System.out.print("Отфильтрованный список: " + result);
        System.out.println();
        logger.log("Завершаем программу");

    }
}
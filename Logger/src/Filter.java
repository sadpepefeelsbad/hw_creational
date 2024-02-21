import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        for (int number : source) {
            if (number >= threshold) {
                logger.log(String.format("Элемент \"%d\" проходит", number));
                result.add(number);
            } else {
                logger.log(String.format("Элемент \"%d\" не проходит", number));
            }
        }
        logger.log(String.format("Прошло фильтрацию %d элементов из %d", result.size(), source.size()));
        return result;
    }
}

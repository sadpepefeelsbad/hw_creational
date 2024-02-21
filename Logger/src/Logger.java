import java.time.LocalDateTime;

public class Logger {
    private static Logger logger;
    protected int num = 1;

    // Запрещаем пользователям пользоваться конструктором нашего класса
    private Logger() {
    }

    // Пользователи которым нужен объект нашего класса получают всегда один
    // и тот же объект, который мы храним в приватном статичном поле, которое
    // мы заполняем в этом методе если оно до того не было заполнено
    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
            logger.log("Запускаем программу");
        }
        return logger;
    }

    public void log(String msg) {
        System.out.println("[" + LocalDateTime.now() + " №" + num++ + "] " + msg);
    }


}
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    protected int num = 1;
    private volatile static Logger instance;

    private Logger() {
    }

    public void log(String msg) {
        String dateTime = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
        System.out.println("[" + dateTime + " " + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (instance == null)
            synchronized (Logger.class) {
                if (instance == null)
                    instance = new Logger();
            }
        return instance;
    }


}

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        source.forEach(element -> {
            if (element < treshold) {
                logger.log("Элемент \"" + element + "\" не проходит");
            } else {
                result.add(element);
                logger.log("Элемент \"" + element + "\" проходит");
            }
        });
        return result;
    }
}

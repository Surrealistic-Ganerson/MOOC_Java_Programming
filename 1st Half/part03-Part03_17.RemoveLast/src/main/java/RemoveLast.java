
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.isEmpty()) {
            return;
        }
        strings.remove(strings.size() - 1);
    }
}


import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = Integer.parseInt(scanner.nextLine());
        for (int counter = 0; counter <= nextInt; counter++) {
            System.out.println(counter);
        }
    }
}
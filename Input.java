import java.util.Scanner;

public class Input {
    static Scanner in = new Scanner(System.in);

    public static int getInput(int value1, int value2) {
        int choice = -1;
        while (choice < value1 || choice > value2) {
            try {
                System.out.println("Πληκτρολογήστε αριθμό ανάμεσα στους αριθμούς " + value1 + "-" + value2);
                choice = Integer.parseInt(in.nextLine());
            } catch (Exception e) {
                System.out.println("Λάθος εισαγωγή... Προσπαθήστε ξανά...");
            }
        }
        
        return choice;
    }

    public static String getInput() {
        String s = in.nextLine();
        return s;
    }
}

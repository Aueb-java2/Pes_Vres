import java.util.Scanner;

public class Menu {
    private int choice;

    private boolean exit = false;

    public void runMenu() {
        printHeader();
        do {
            printMenu();
            readChoice();
        } while (!exit);
    }

    private void readChoice() {
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        while (choice < 1 || choice > 3) {
            System.out.println("Πληκρολογήστε ξανά...\n"); /* εμφανιση μενου παλι */
            choice = sc.nextInt();
        }
        exit = true;
        sc.close();
    }

    public  int getChoice() {
        return choice;
    }

    private void printHeader() {
        System.out.println("*-------------------------------*");
        System.out.println("*       Καλώς ορίσατε στο       *");
        System.out.println("*           ΠΕΣ ΒΡΕΣ            *");
        System.out.println("*-------------------------------*\n");
    }

    private void printMenu() {
        System.out.println("Παρακαλώ επιλέξτε...\n");
        System.out.println("1. Παίξε!");
        System.out.println("2. Κανόνες");
        System.out.println("3. Έξοδος");
    }
}

   

   



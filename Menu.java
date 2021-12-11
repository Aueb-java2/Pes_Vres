public class Menu {
    private int choice;
    
    public void runMenu() {
        printHeader();
        printMenu();
        readChoice();
    }

    private void readChoice() {
        choice = Input.getInput(1, 3);
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

   

   



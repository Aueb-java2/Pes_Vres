public class Choices {
    private String name1;

    private String name2;

    private int roundSeconds;

    private int noOfCategories;

    private int category1;

    private int category2;

    private int category3;

    private int category4;

    public void runChoices() {
        readNames();
        printSecondsChoices();
        readRoundSeconds();
        readNoOfCategories();
        readCategories();
    }

    public int getCategory1() {
        return category1;
    }

    public int getCategory2() {
        return category2;
    }

    public int getCategory3() {
        return category3;
    }

    public int getCategory4() {
        return category4;
    }

    private  void readCategories() {
        System.out.println("1. Ελληνική Μυθολογία");
        System.out.println("2. Ελληνικός Πολιτισμός");
        System.out.println("3. Ελληνική Γεωγραφία");
        System.out.println("4. Ελληνική Ιστορία");
        switch (noOfCategories) {
        case 1:
            System.out.println("Παρακαλώ επιλέξτε τον αριθμό της πρώτης κατηγορίας");
            category1 = Input.getInput(1, 4);
            break;
        case 2:
            System.out.println("Παρακαλώ επιλέξτε τον αριθμό της πρώτης κατηγορίας");
            category1 = Input.getInput(1, 4);
            System.out.println("Παρακαλώ επιλέξτε τον αριθμό της δεύτερης κατηγορίας");
            category2 = Input.getInput(1, 4);
            break;
        case 3:
            System.out.println("Παρακαλώ επιλέξτε τον αριθμό της πρώτης κατηγορίας");
            category1 = Input.getInput(1, 4);
            System.out.println("Παρακαλώ επιλέξτε τον αριθμό της δεύτερης κατηγορίας");
            category2 = Input.getInput(1, 4);
            System.out.println("Παρακαλώ επιλέξτε τον αριθμό της τρίτης κατηγορίας");
            category3 = Input.getInput(1, 4);
            break;
        default:
            System.out.println("Παρακαλώ επιλέξτε τον αριθμό της πρώτης κατηγορίας");
            category1 = Input.getInput(1, 4);
            System.out.println("Παρακαλώ επιλέξτε τον αριθμό της δεύτερης κατηγορίας");
            category2 = Input.getInput(1, 4);
            System.out.println("Παρακαλώ επιλέξτε τον αριθμό της τρίτης κατηγορίας");
            category3 = Input.getInput(1, 4);
            System.out.println("Παρακαλώ επιλέξτε τον αριθμό της τέταρτης κατηγορίας");
            category4 = Input.getInput(1, 4);
            break;
        }
        
    }

    public int getNoOfCategories() {
        return noOfCategories;
    }

    private void readNoOfCategories() {
        System.out.print("Παρακαλώ πληκτρολογήστε τον αριθμό των κατηγοριών...");
        noOfCategories = Input.getInput(1, 4);
    }
    
    private void readNames() {
        System.out.print("Παρακαλώ πληκρολογήστε το όνομα της ομάδας1...\n");
        name1 = Input.getStringInput();
        System.out.println("Παρακαλώ πληκρολογήστε το όνομα της ομάδας2...");
        name2 = Input.getStringInput();
        
    }

    public  String getName1() {
        return name1;
    }

    public  String getName2() {
        return name2;
    }

    public int  getRoundSeconds() {
        return roundSeconds;
    }

    private void printSecondsChoices() {
        System.out.println("Παρακαλώ επιλέξτε τα δευτερόλεπτα κάθε γύρου...\n");
        System.out.println("1. 45 δευτερόλεπτα");
        System.out.println("2. 60 δευτερόλεπτα");
        System.out.println("3. 75 δευτερόλεπτα");
    }

    private void readRoundSeconds() {
        int choice = Input.getInput(1, 3);
        switch (choice) {
            case 1:
                roundSeconds = 45;
                break;
            case 2:
                roundSeconds = 60;
                break;
            default:
                roundSeconds = 75;
                break;
        }
    }
    
}

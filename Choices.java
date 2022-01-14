public class Choices {
    private String name1;

    private String name2;

    private int roundSeconds;

    private int noOfCategories;

    private int[] categories;

    public void runChoices() {
        readNames();
        printSecondsChoices();
        readRoundSeconds();
        readNoOfCategories();
        readCategories();
    }

    public int[] getCategories() {
        return categories;
    }

    private  void readCategories() {
        System.out.println("1. Ελληνική Μυθολογία");
        System.out.println("2. Ελληνικός Πολιτισμός");
        System.out.println("3. Ελληνική Γεωγραφία");
        System.out.println("4. Ελληνική Ιστορία");
        categories = new int[noOfCategories]; 
        int category;
        System.out.println("Παρακαλώ επιλέξτε τον αριθμό 1ης κατηγορίας");
        categories[0] = Input.getInput(1, 4);
        for (int i = 1; i < categories.length; i++) {
            System.out.println("Παρακαλώ επιλέξτε τον αριθμό " + (i+1) + "ης κατηγορίας");
            category = Input.getInput(1, 4);
            while (Search.linearSearch(categories, category) != -1) {
                System.out.println("Έχετε ήδη πληκτρολογήσει τον αριθμό αυτής της κατηγορίας");
                category = Input.getInput(1, 4);
            }
            categories[i] = category;
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

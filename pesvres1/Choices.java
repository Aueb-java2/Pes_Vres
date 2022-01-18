public class Choices {

    /*Name of the first team*/
    private String name1;

    /*Name of the second team*/
    private String name2;

    /*Seconds of each round that 
    have been selected from the user*/
    private int roundSeconds;

    /*Number of categories that 
    have been selected from the user*/
    private int noOfCategories;

    /*Categories that have been
    selected from the user in order*/
    private int[] categories;

    /*Prints and reads the choices of each game*/
    public void runChoices() {
        readNames();
        printSecondsChoices();
        readRoundSeconds();
        readNoOfCategories();
        readCategories();
    }

    /*Returns the categories in order*/
    public int[] getCategories() {
        return categories;
    }

    /*Reads the categories of each round and
    creates table categories[]*/
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

    /*Returns the number of the categories given*/
    public int getNoOfCategories() {
        return noOfCategories;
    }

    /*Reads the number of the categories*/
    private void readNoOfCategories() {
        System.out.println("Παρακαλώ πληκτρολογήστε τον αριθμό των κατηγοριών...");
        noOfCategories = Input.getInput(1, 4);
    }
    
    /*Reads the names of both teams*/
    private void readNames() {
        System.out.println("Παρακαλώ πληκρολογήστε το όνομα της ομάδας1...");
        name1 = Input.getStringInput();
        System.out.println("Παρακαλώ πληκρολογήστε το όνομα της ομάδας2...");
        name2 = Input.getStringInput();
        
    }

    /*Returns the name of the first team*/
    public  String getName1() {
        return name1;
    }

    /*Returns the name of the second team*/
    public  String getName2() {
        return name2;
    }

    /*Returns the seconds of each round given by the user*/
    public int  getRoundSeconds() {
        return roundSeconds;
    }

    private void printSecondsChoices() {
        System.out.println("Παρακαλώ επιλέξτε τα δευτερόλεπτα κάθε γύρου...");
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

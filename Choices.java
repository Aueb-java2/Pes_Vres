import java.util.Scanner;

public class Choices {
    private static String name1;

    private static String name2;

    private static int roundSeconds;

    private static int noOfCategories;

    private static int category1;

    private static int category2;

    private static int category3;

    private static int category4;

    public static void runChoices() {
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

    private static void readCategories() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Ελληνική Μυθολογία");
        System.out.println("2. Ελληνικός Πολιτισμός");
        System.out.println("3. Ελληνική Γεωγραφία");
        System.out.println("4. Ελληνική Ιστορία");
        switch (noOfCategories) {
        case 1:
            System.out.println("Παρακαλώ επιλέξτε τον αριθμό της πρώτης κατηγορίας");
            category1 = sc.nextInt();
            break;
        case 2:
            System.out.println("Παρακαλώ επιλέξτε τον αριθμό της πρώτης κατηγορίας");
            category1 = sc.nextInt();
            System.out.println("Παρακαλώ επιλέξτε τον αριθμό της δεύτερης κατηγορίας");
            category2 = sc.nextInt();
            break;
        case 3:
            System.out.println("Παρακαλώ επιλέξτε τον αριθμό της πρώτης κατηγορίας");
            category1 = sc.nextInt();
            System.out.println("Παρακαλώ επιλέξτε τον αριθμό της δεύτερης κατηγορίας");
            category2 = sc.nextInt();
            System.out.println("Παρακαλώ επιλέξτε τον αριθμό της τρίτης κατηγορίας");
            category3 = sc.nextInt();
            break;
        default:
            System.out.println("Παρακαλώ επιλέξτε τον αριθμό της πρώτης κατηγορίας");
            category1 = sc.nextInt();
            System.out.println("Παρακαλώ επιλέξτε τον αριθμό της δεύτερης κατηγορίας");
            category2 = sc.nextInt();
            System.out.println("Παρακαλώ επιλέξτε τον αριθμό της τρίτης κατηγορίας");
            category3 = sc.nextInt();
            System.out.println("Παρακαλώ επιλέξτε τον αριθμό της τέταρτης κατηγορίας");
            category4 = sc.nextInt();
            break;
        }
        
    }

    public int getNoOfCategories() {
        return noOfCategories;
    }

    private static void readNoOfCategories() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Παρακαλώ πληκτρολογήστε τον αριθμό των κατηγοριών...");
        noOfCategories = sc.nextInt();
        while (noOfCategories < 1 || noOfCategories > 4) {
            System.out.println("Πληκρολογήστε ξανά...\n");
            noOfCategories = sc.nextInt();
        }
        
    }

    private static void readNames() {
        Scanner in = new Scanner(System.in);
        System.out.print("Παρακαλώ πληκρολογήστε το όνομα της ομάδας1...\n");
        name1 = in.nextLine();
        System.out.println("Παρακαλώ πληκρολογήστε το όνομα της ομάδας2...");
        name2 = in.nextLine();
        
    }

    public static String getName1() {
        return name1;
    }

    public static String getName2() {
        return name2;
    }

    public int getRoundSeconds() {
        return roundSeconds;
    }

    private static void printSecondsChoices() {
        System.out.println("Παρακαλώ επιλέξτε τα δευτερόλεπτα κάθε γύρου...\n");
        System.out.println("1. 45 δευτερόλεπτα");
        System.out.println("2. 60 δευτερόλεπτα");
        System.out.println("3. 75 δευτερόλεπτα");
    }

    private static void readRoundSeconds() {
        Scanner sc = new Scanner(System.in);
        roundSeconds = sc.nextInt();
        while (roundSeconds < 1 || roundSeconds > 3) {
            System.out.println("Πληκρολογήστε ξανά...\n");
            roundSeconds = sc.nextInt();
        }
        
    }
    
}

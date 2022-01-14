import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.io.*;

public class Input {
    public static Scanner in = new Scanner(System.in);

    private int remaindedMilliSeconds;

    public int getRemaindedMilliSeconds() {
        return remaindedMilliSeconds;
    }

    public Input(int MilliSeconds) {
        remaindedMilliSeconds = MilliSeconds;
    }

    TimerTask task = new TimerTask() {
        public void run() {
            System.out.println("Tελείωσε ο χρόνος σου...");
            System.out.println("Πατήστε οποιοδήποτε πλήκτρο για να συνεχίσετε...");
            remaindedMilliSeconds = 0;
        }    
    };

    public static String getStringInput() {
        return in.nextLine();
    }

    public int getInput() throws IOException, InterruptedException {
        int answerNo = -1;
        String str;
        Timer timer = new Timer();
        timer.schedule(task, remaindedMilliSeconds);
        int numMilliSeconds;
        Date startDate = new Date();
        str = in.nextLine();
        Date endDate = new Date();
            try {
                if (remaindedMilliSeconds > 0) {
                    answerNo = Integer.parseInt(str);
                    numMilliSeconds = (int)((endDate.getTime() - startDate.getTime()));
                    remaindedMilliSeconds -= numMilliSeconds;
                    if (answerNo <= 10 && answerNo >= 1) {
                        timer.cancel();
                        
                    } else {
                        System.out.println("Λάθος εισαγωγή... Πληκτρολογήστε αριθμό ανάμεσα στους 1-10"); 
                        timer.cancel();
                    }
                }
            } catch (Exception e) {
                endDate = new Date();
                numMilliSeconds = (int)((endDate.getTime() - startDate.getTime()));
                remaindedMilliSeconds -= numMilliSeconds;
                if (remaindedMilliSeconds > 0) {
                    System.out.println("Λάθος εισαγωγή... Προσπαθήστε ξανά...");
                    timer.cancel();
                }
            }
        return answerNo;
    }

    public static int getInput(int value1, int value2) {
        int choice = -1;
        System.out.println("Πληκτρολογήστε αριθμό ανάμεσα στους αριθμούς " + value1 + "-" + value2);
        do {
            try {
                choice = Integer.parseInt(in.nextLine());
                if (choice < value1 || choice > value2) {
                    System.out.println("Λάθος εισαγωγή...");
                }
            } catch (NumberFormatException e) {
                System.out.println("Λάθος εισαγωγή... Προσπαθήστε ξανά...");
            }
        } while (choice < value1 || choice > value2);
        return choice;
    }

}

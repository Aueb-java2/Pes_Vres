import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class Countdown implements Runnable{

    private int roundMilliSeconds;

    public int roundScore = 0;
    private String catName;
    
    public static String question;
    public static int[] points = new int[10];
    public static String[] answers = new String[10];

    public Countdown(int Seconds, Round r){
        this.roundMilliSeconds = Seconds * 1000;
        this.catName = r.catName;
    }

    public void run(){
        try{
        	Driver.questionDB(catName);
        	Driver.answerDB(catName);
        	System.out.println("Ερώτηση: " + question);
        	for (int i = 0; i < answers.length; i++) {
        		System.out.printf("%d. %s%n", i + 1, answers[i]);
        	}
            //so let's start counting
            ArrayList<Integer> answers = new ArrayList<Integer>(Arrays.asList(1, 2, 3 , 4, 5, 6, 7, 8, 9, 10));            
            int answerNo;
            int i = roundMilliSeconds;
            int count = 0;          
            while (i > 0 && count < 10) {
                Input in = new Input(i);
                answerNo = in.getInput();
                i = in.getRemaindedMilliSeconds();
                if (i > 0) {
                    if (answers.contains(answerNo)) {
                        System.out.println("Πληκτρολογήσατε την απάντηση "+ answerNo );
                        roundScore += points[answerNo - 1];
                        count++;
                        answers.remove(answers.indexOf(answerNo));
                    } else if (answerNo >=1 && answerNo <= 10) {
                        System.out.println("Έχετε δώσει ήδη αυτήν την απάντηση....");
                    }
                    System.out.println("Τα δευτερόλεπτα που απομένουν είναι " + (double)i / 1000 + "\n");
                }
            }
            if (count == 10) {
                System.out.println("Απαντήσατε και τις δέκα ερωτήσεις!!");
            } else {
                System.out.println("Απαντήσατε " + count + " ερωτήσεις...");
            }
            System.out.println("Πήρατε " + roundscore + " σε αυτόν τον γύρο.");
        }catch(InterruptedException | IOException | SQLException e){
            System.out.println("Countdown interrupted");
        }
    }
}

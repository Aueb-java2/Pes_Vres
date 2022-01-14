import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Countdown implements Runnable{

    private int roundMilliSeconds;

    private int roundScore = 0;

    public Countdown(int Seconds){
        this.roundMilliSeconds = Seconds * 1000;
    }

    public void run(){
        try{
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
                        count++;
                        answers.remove(answers.indexOf(answerNo));
                        //roundScore += τους ποντους της ερώτησης
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
        }catch(InterruptedException | IOException e){
            System.out.println("Countdown interrupted");
        }
    }
}

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.io.*;
public class Input {
    public static Scanner in = new Scanner(System.in);
    private String str = "";

    private int remaindedSeconds;

    public int getRemaindedSeconds() {
        return remaindedSeconds;
    }

    public Input(int Seconds) {
        remaindedSeconds = Seconds;
    }

    TimerTask task = new TimerTask()
    {
        public void run()
        {
            if( str.equals("") )
            {
                System.out.println( "you input nothing. exit..." );
                System.exit( 0 );
            }
        }    
    };

    public static String getStringInput() {
        return in.nextLine();
    }

    public void getInput() throws IOException, InterruptedException  {
        Timer timer = new Timer();
        timer.schedule(task, remaindedSeconds * 1000);
        BufferedReader in = new BufferedReader(
        new InputStreamReader( System.in ) );
        str = in.readLine();
        remaindedSeconds--;
        

        timer.cancel();
        System.out.println( "you have entered: "+ str ); 
    }

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
}

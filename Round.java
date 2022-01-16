import java.util.Random;

public class Round {
    private int roundSeconds;
    
    private int category;
    
    public static String catName;

    private int roundScore;
    

    public Round(int roundSeconds, int category) {
        this.roundSeconds = roundSeconds;
        this.category = category;
        setCatName();
    }

    private void setCatName() {
    	switch (category) {
    		case 1:
    			catName = "Μ";
    			break;
    		case 2:
    			catName = "Π";
    			break;
    		case 3:
    			catName = "Γ";
    			break;
    		default:
    			catName = "Ι";
    			break;
    	}
    	Random r = new Random();
    	catName = String.format("%s%d", catName, r.nextInt(20) + 1);
    }

    public int getRoundScore() {
        return roundScore;
    }


    public void runRound() {
        //database connection εμφάνιση ερωτησης / απάντησης ανάλογα με κατηγορίες
        System.out.println("Πατήστε enter για να ξεκινήσει ο γύρος");
        Input.getStringInput();
        System.out.println("Έχεις " + roundSeconds + " δευτερόλεπτα");
        Countdown c = new Countdown(roundSeconds);
        c.run();
        //c.getroundScore();
        //team1addscore
    }
}

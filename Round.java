public class Round {
    private int roundSeconds;
    
    private int category;

    private int roundScore;
    

    public Round(int roundSeconds, int category) {
        this.roundSeconds = roundSeconds;
        this.category = category;
    }


    public int getRoundScore() {
        return roundScore;
    }


    public void runRound() {
        //ΕΜΦΑΝΙΣΗ ΕΡΩΤΗΣΗΣ kai apanthshs
        System.out.println("Πατήστε οποιοδήποτε πλήκτρο για να ξεκινήσει ο γύρος");
        Input.getStringInput();
        System.out.println("Έχεις " + roundSeconds + " δευτερόλεπτα");
        Countdown c = new Countdown(roundSeconds);
        c.run();
        //c.getroundScore();
        //team1addscore
    }
}

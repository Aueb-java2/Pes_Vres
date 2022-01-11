public class Round {
    public static void runRound(int RoundSeconds, String category) {
        //ΕΜΦΑΝΙΣΗ ΕΡΩΤΗΣΗΣ 
        System.out.println("Exeis 10'' ");
        Countdown c = new Countdown(RoundSeconds);
        c.run();
    }
}

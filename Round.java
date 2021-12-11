public class Round implements java.lang.Runnable{

    @Override
    public void run() {
        Round.runRound(0, null);
    }

    public static void runRound(int roundSeconds, String category) {
        // print question and answers//
         while (roundSeconds > 0){
          // scanner for answers//
          //score ++ score of answer//
          try {
            System.out.println("Remaining: "+ roundSeconds +" seconds");
            roundSeconds--;
            Thread.sleep(1000L);    // 1000L = 1000ms = 1 second
           }
           catch (InterruptedException e) {
               //I don't think you need to do anything for your particular problem
           }
         } 
    }

}

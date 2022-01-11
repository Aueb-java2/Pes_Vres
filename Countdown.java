public class Countdown implements Runnable{

    private int roundSeconds;

    public Countdown(int Seconds){
        this.roundSeconds = Seconds;
    }

    public void run(){
        try{
            //so let's start counting
            for(int i = roundSeconds; i > 0; i--){
                Input in = new Input(i);
                in.getInput();
                i = in.getRemaindedSeconds();
                System.out.println("seconds remaining " + i + "\n");
            }
              System.out.println("TIMEOUT");
        }catch(InterruptedException e){
            System.out.println("Countdown interrupted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

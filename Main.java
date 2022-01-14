import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException, InterruptedException {
    //Game game = new Game(60, "category1");
    //game.runGame("gr", "rew");
    //Round.runRound(5, "category");
    //Round.runRound(10, "category");
    Menu menu = new Menu();
    menu.printHeader();
    int choice = -1;
    while (choice != 3) {
      menu.runMenu();
      choice = menu.getChoice();
      if (choice == 1) {
        Choices choices = new Choices();
        choices.runChoices();
        Game game = new Game(choices);
        game.runGame();
      } else if (choice == 2) {
        Rules.printRules();
      }
    }
    System.exit(0);
  }
}

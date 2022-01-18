import java.sql.SQLException;

public class Main {
  public static void main(String[] args) throws SQLException {
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

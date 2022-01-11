public class Main {
  public static void main(String[] args) {
    Menu menu = new Menu();
    menu.runMenu();
    Choices choices = new Choices();
    choices.runChoices();
    switch (choices.getNoOfCategories()) {
      case 1:
        Game game = new Game(roundSeconds, category1)
        break;
    
      default:
        break;
    }
  }
}

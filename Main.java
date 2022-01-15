public class Main {

	public static void main(String[] args) {
		//Game game = new Game(60, "category1");
		//game.runGame("gr", "rew");
		//Round.runRound(5, "category");
		//Round.runRound(10, "category");
		Menu.screenMenu();
		Menu.printHeader();
		Menu.printMenu();

		int choice = -1;
		if (choice == 1) {
			Choices choices = new Choices();
			Game game = new Game(choices);
			game.runGame();
		}
	}
}
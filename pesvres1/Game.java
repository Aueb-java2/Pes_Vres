public class Game {
    private int roundSeconds;

    private int noOfCategories;

    private int[] categories;

    private final int NO_OF_ROUNDS = 10;
    
    private int count = 0;

    private String name1;
    
    private String name2;

    public Game(Choices c) {
        this.roundSeconds = c.getRoundSeconds();
        this.noOfCategories = c.getNoOfCategories();
        this.categories = c.getCategories();
        this.name1 = c.getName1();
        this.name2 = c.getName2();
    }

    private int pickCategory() {
        count++;
        switch (noOfCategories) {
            case 1:
                return categories[0];
            case 2:
                switch (count % 2) {
                    case 1:
                        return categories[0];              
                    default:
                        return categories[1];
                }
            case 3:
                switch (count % 3) {
                    case 2:
                        return categories[1];  
                    case 1:
                        return categories[0];
                    default:
                        return categories[2];
                }
            default:
                switch (count % 4) {
                    case 3:
                        return categories[2];
                    case 2:
                        return categories[1];  
                    case 1:
                        return categories[0];
                    default:
                        return categories[3];
            }
        }
    }
    
    public void runGame() {
        Team team1 = new Team(name1, 0);
        Team team2 = new Team(name2, 0);
        int category;
        for (int i = 0; i < NO_OF_ROUNDS; i++) {
            category = pickCategory();
            System.out.println("Γύρος νούμερο " + (i + 1) + " για την ομάδα " + name1);
            Round r1 = new Round(roundSeconds, category);
            r1.runRound();
            team1.addScore(r1.getRoundScore());
            System.out.println("Γύρος νούμερο " + (i + 1) + " για την ομάδα " + name2);
            Round r2 = new Round(roundSeconds, category);
            r2.runRound();
            team2.addScore(r2.getRoundScore());
        }
        printWinner(team1.getScore(), team2.getScore(), team1.getName(), team2.getName());
    }

    private void printWinner(int score1, int score2, String name1, String name2) {
        if (score1 > score2) {
            System.out.println("Νικητής η ομάδα" + name1);
        } else if (score1 == score2) {
            System.out.println("Ισοπαλία");
        } else {
            System.out.println("Νικητής η ομάδα" + name2);
        }
    }
}

public class Game {
    private int roundSeconds;

    private int noOfCategories;

    private String category1;

    private String category2;

    private String category3;

    private String category4;

    private final int NO_OF_ROUNDS = 10;
    
    private int count = 0;

    public Game(int roundSeconds, String category1) {
        this.roundSeconds = roundSeconds;
        this.category1 = category1;
    }

    public Game(int roundSeconds, String category1, String category2) {
        this.roundSeconds = roundSeconds;
        this.category1 = category1;
        this.category2 = category2;
    }

    public Game(int roundSeconds, String category1, String category2, String category3) {
        this.roundSeconds = roundSeconds;
        this.category1 = category1;
        this.category2 = category2;
        this.category3 = category3;
    }

    public Game(int roundSeconds, int noOfCategories, String category1, String category2, String category3, String category4) {
        this.roundSeconds = roundSeconds;
        this.noOfCategories = noOfCategories;
        this.category1 = category1;
        this.category2 = category2;
        this.category3 = category3;
        this.category4 = category4;
    }

    private String pickCategory() {
        count++;
        switch (noOfCategories) {
            case 1:
                return category1;
            case 2:
                switch (count % 2) {
                    case 1:
                        return category1;                
                    default:
                        return category2;
                }
            case 3:
                switch (count % 3) {
                    case 2:
                        return category2;  
                    case 1:
                        return category1;
                    default:
                        return category4;
                }        
            default:
                switch (count % 4) {
                    case 3:
                        return category3;
                    case 2:
                        return category2;  
                    case 1:
                        return category1;
                    default:
                        return category4;
            }
        }
    }
    
    public void runGame() {
        var team1 = new Team(Choices.getName1(), 0);
        var team2 = new Team(Choices.getName2(), 0);
        for (int i = 0; i < NO_OF_ROUNDS; i++) {
            System.out.println("Round no" + i + "for team" + team1.getName());
            String category = pickCategory();
            Round.runRound(roundSeconds, category);
            System.out.println("Round no" + i + "for team" + team2.getName());
            Round.runRound(roundSeconds, category);
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

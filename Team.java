public class Team {
    private String name;

    private int score;

    public Team(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Team [name=" + name + ", score=" + score + "]";
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

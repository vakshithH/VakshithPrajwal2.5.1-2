class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void addPoints(int points) {
        score += points;
    }

    public void resetScore() {
        score = 0;
    }
}

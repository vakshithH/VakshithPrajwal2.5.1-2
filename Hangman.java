import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Hangman {
    private List<String> phrases;
    private List<Player> players;
    private Player currentPlayer;
    private String currentPhrase;
    private boolean isOver;
    private Player winner;

    public Hangman(List<String> phrases) {
        this.phrases = phrases;
        this.players = new ArrayList<>();
        this.isOver = false;
        this.winner = null;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void selectRandomPhrase() {
        Random random = new Random();
        int randomIndex = random.nextInt(phrases.size());
        currentPhrase = phrases.get(randomIndex);
    }

    public void startGame() {
        selectRandomPhrase();
        currentPlayer = players.get(0);
        while (!isOver) {
            // Game logic here (guessing, solving, changing players, etc.)
        }
        endGame();
    }

    public void makeGuess(String letter) {
        // Implement guessing logic here
    }

    public void solvePuzzle(String phrase) {
        // Implement puzzle solving logic here
    }

    public void endGame() {
        // Calculate the winner and display results
    }
}
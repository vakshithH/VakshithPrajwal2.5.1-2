public class Main {
    public static void main(String[] args) {
        List<String> phrases = new ArrayList<>();
        phrases.add("HELLO WORLD");
        phrases.add("JAVA PROGRAMMING");
        phrases.add("HANGMAN GAME");

        Hangman game = new Hangman(phrases);

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        game.addPlayer(player1);
        game.addPlayer(player2);

        game.startGame();
    }
}
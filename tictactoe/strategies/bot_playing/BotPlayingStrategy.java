package tictactoe.strategies.bot_playing;

//import javafx.util.Pair;
import tictactoe.models.Board;
import tictactoe.models.Pair;

public interface BotPlayingStrategy {

    public Pair<Integer, Integer> makeMove(Board board);
}

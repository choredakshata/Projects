package tictactoe.models;

//import javafx.util.Pair;
import tictactoe.factories.BotPlayingStrategyFactory;
import tictactoe.strategies.bot_playing.BotPlayingStrategy;

public class BotPlayer extends Player{
    private BotLevel botLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public BotPlayer(String name, Symbol s, BotLevel level) {
        super(name, s);
        this.botLevel = level;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(botLevel);
    }

    @Override
    public Pair<Integer, Integer> makeMove(Board board) {
        return botPlayingStrategy.makeMove(board);
    }
}

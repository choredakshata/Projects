package tictactoe.strategies.bot_playing;

//import javafx.util.Pair;
import tictactoe.exceptions.InvalidGameStateException;
import tictactoe.models.Board;
import tictactoe.models.Cell;
import tictactoe.models.CellStatus;
import tictactoe.models.Pair;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Pair<Integer, Integer> makeMove(Board board) {
        for (List<Cell> row : board.getCells()) {
            for (Cell cell : row) {
                if(cell.getCellStatus().equals(CellStatus.UNOCCUPIED)){
                    return new Pair<>(cell.getRow(), cell.getCol());
                }
            }
        }

        throw new InvalidGameStateException("No place for bot to make a move");
    }
}

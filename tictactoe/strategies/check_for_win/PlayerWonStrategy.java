package tictactoe.strategies.check_for_win;

import tictactoe.models.Board;
import tictactoe.models.Cell;
import tictactoe.models.Move;

public interface PlayerWonStrategy {

    public boolean checkForWin(Board board, Cell currentCell);

    public void handleUndo(Move move);
}

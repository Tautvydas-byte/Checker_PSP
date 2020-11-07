import java.io.IOException;
import java.util.ArrayList;

public class GameLevel {

    private GameField gameField;
    private Position movePosition;

   private ArrayList<Checker> checkers;
   private ArrayList<Checker> checkerOpponent;

    public GameLevel(GameField gameField, ArrayList<Checker> checkers, ArrayList<Checker> checkerOpponent) {
        this.gameField = gameField;
        this.checkers = checkers;
        this.checkerOpponent = checkerOpponent;
    }

    public GameField getGameField() {
        return gameField;
    }

    public void setGameField(GameField gameField) {
        this.gameField = gameField;
    }

    public ArrayList<Checker> getCheckers() {
        return checkers;
    }

    public void setCheckers(ArrayList<Checker> checkers) {
        this.checkers = checkers;
    }


    public ArrayList<Checker> getcheckerOpponent() {
        return checkerOpponent;
    }

    public void setcheckerOpponent(ArrayList<Checker> checkerOpponent) {
        this.checkerOpponent = checkerOpponent;
    }

    public void moveAChecker(Position position, ConsoleInput consoleInput) throws IOException {
        for (int i = 0; i < checkers.size();i++)
        {
            if (checkers.get(i).getPosition().equals(position))
            {
                System.out.println("Enter new position");
                checkers.get(i).setPosition(consoleInput.getPositionInput());
                break;
            }
        }
    }

}

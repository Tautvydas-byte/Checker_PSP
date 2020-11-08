import java.io.IOException;
import java.util.ArrayList;

public class GameLevel {

    private GameField gameField;
    private Position movePosition;

    private ArrayList<Checker> checkers;
    private ArrayList<Checker> checkersOpponent;

    private CheckersBehavior checkersBehavior;// behavior=elgsena, duoda possuble moves
    private ArrayList<Position> possibleMoves;
    private boolean playerTurn;



    public GameLevel(GameField gameField, ArrayList<Checker> checkers, ArrayList<Checker> checkersOpponent) {
        this.gameField = gameField;
        this.checkers = checkers;
        this.checkersOpponent = checkersOpponent;

        this.checkersBehavior = new CheckersBehavior();
        this.possibleMoves = new ArrayList<Position>();
        playerTurn = true;
    }

    public GameField getGameField() {
        return gameField;
    }

    public ArrayList<Checker> getCheckers() {
        return checkers;
    }

    public ArrayList<Checker> getOpponentCheckers() {
        return checkersOpponent;
    }

    public void placeCheckers() {
        for (int y = 0; y < gameField.getHeight(); y++) {
            for (int x = 0; x < gameField.getWidth(); x++) {

                if (y <= 2 && (y + x) % 2 == 0) {
                    checkersOpponent.add(new Checker(new Position(y, x)));
                }
                if (y >= gameField.getHeight()-3 && (y + x) % 2 == 0) {
                    checkers.add(new Checker(new Position(y, x)));
                }

            }
        }
    }

    public void movePlayerChecker(Position position, ConsoleInput consoleInput) throws IOException {
        for (int i = 0; i < checkers.size();i++)
        {
            if (checkers.get(i).getPosition().equals(position))
            {
                possibleMoves = checkersBehavior.getPossibleMoves(checkers.get(i),playerTurn, checkers, checkersOpponent, gameField);

                System.out.print("Your possible moves: ");
                possibleMoves.forEach(possibleMove -> System.out.print(possibleMove.getX() + "" + possibleMove.getY() + " "));
                System.out.println("");// -> eina per possibleMove ir pritaiko (possibleMove.getX() ir possibleMove.getY()) reiksmes, veikia kaip ciklas

                if (!possibleMoves.isEmpty()) {
                    Position nextCheckerPosition;
                    while (true) {
                        nextCheckerPosition = consoleInput.getPositionInput();
                        if (containsPosition(possibleMoves, nextCheckerPosition)) break;
                        System.out.println("Suggested position is not possible.");
                    }

                    checkers.get(i).setPosition(nextCheckerPosition);
                }
                else System.out.println("Selected checker has no possible moves");

                playerTurn = false;
                return;
            }
        }
        System.out.println("Your entered coordinates didn't match for any checker on player side. Try again.");
    }
    public void moveOpponentChecker(Position position, ConsoleInput consoleInput) throws IOException {
        for (int i = 0; i < checkersOpponent.size(); i++)
        {
            if (checkersOpponent.get(i).getPosition().equals(position)) {
                System.out.println("Enter new position");


                possibleMoves = checkersBehavior.getPossibleMoves(checkersOpponent.get(i),playerTurn, checkers, checkersOpponent, gameField);

                System.out.print("Your possible moves: ");
                possibleMoves.forEach(possibleMove -> System.out.print(possibleMove.getX() + "" + possibleMove.getY() + " "));
                System.out.println("");

                if (!possibleMoves.isEmpty()) {
                    Position nextCheckerPosition;
                    while (true) {
                        nextCheckerPosition = consoleInput.getPositionInput();
                        if (containsPosition(possibleMoves, nextCheckerPosition)) break;
                        System.out.println("Suggested position is not possible.");
                    }

                    checkersOpponent.get(i).setPosition(nextCheckerPosition);
                }
                else System.out.println("Selected checker has no possible moves");

                playerTurn = true;
                return;
            }
        }
        System.out.println("Your entered coordinates didn't match for any checker on opponent  side. Try again.");
    }

    public boolean containsPosition (ArrayList<Position> possibleMoves, Position position) //Metoda perkelt kazkur kitur reiktu
    {
        for(Position possibleMove: possibleMoves)
        {
            if (possibleMove.equals(position)) return true;
        }
        return false;
    }

}

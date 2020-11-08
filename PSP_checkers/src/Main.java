import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {

    GameField field = new GameField();
    GameRender gameRender = new GameRender();

    ArrayList<Checker> checkers = new ArrayList<Checker>();
    ArrayList<Checker> checkerOpponent = new ArrayList<Checker>();

    GameLevel gameLevel = new GameLevel(field, checkers, checkerOpponent);
    gameLevel.placeCheckers();


    ConsoleInput consoleInput = new ConsoleInput();

    while(true){
        System.out.println("Player turn.");
        gameRender.renderMap(gameLevel);
        gameLevel.movePlayerChecker(consoleInput.getPositionInput(),consoleInput);

        System.out.println("Opponent turn.");
        gameRender.renderMap(gameLevel);
        gameLevel.moveOpponentChecker(consoleInput.getPositionInput(),consoleInput);
    }
  }
}

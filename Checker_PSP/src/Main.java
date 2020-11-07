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

    for (int y = 0; y < gameLevel.getGameField().getWidth(); y++) {
      for (int x = 0; x < gameLevel.getGameField().getHeight(); x++) {
        if (y >= 0 && y <= 2 && (y + x) % 2 == 0) {
          checkers.add(new Checker(new Position(y, x)));
        }
        if (y >= 5 && y <= 8 && (y + x) % 2 == 0) {
          checkers.add(new Checker(new Position(y, x)));
        }
      }
    }

    ConsoleInput consoleInput = new ConsoleInput();

    while(true){
        gameRender.renderMap(gameLevel);
        System.out.println("Enter checker coordinates");
        gameLevel.moveAChecker(consoleInput.getPositionInput(),consoleInput);
    }
  }
}

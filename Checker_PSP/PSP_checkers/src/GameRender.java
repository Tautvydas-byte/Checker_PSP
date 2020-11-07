import java.io.IOException;

public class GameRender {
  public void renderMap(GameLevel gameLevel) throws IOException {

    System.out.print("   ");
    for (int i = 0; i < gameLevel.getGameField().getWidth(); i++) {
      System.out.print(" " + i + " ");
    }
    System.out.println();

    for (int y = 0; y < gameLevel.getGameField().getWidth(); y++) {
      for (int x = 0; x < gameLevel.getGameField().getHeight(); x++) {

        if (x == 0) System.out.print(y + "| ");

        boolean spotHasChecker = false;

        for (Checker checker : gameLevel.getCheckers()) {
          if (checker.at(y, x)) {
            System.out.print(" P ");
            spotHasChecker = true;
          }
        }

        for (Checker checker : gameLevel.getCheckersOpponent()) {
          if (checker.at(y, x)) {
            System.out.print(" O ");
            spotHasChecker = true;
          }
        }

        if (!spotHasChecker) {
          if (gameLevel.getGameField().isSquareBlack(y, x)) System.out.print(" + ");
          else if (gameLevel.getGameField().isSquareWhite(y, x)) System.out.print(" - ");
        }
      }
      System.out.println();
    }
  }
}

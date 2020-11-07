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

        if (y == 0 && x == 0) System.out.print("0| ");
        if (y == 1 && x == 0) System.out.print("1| ");
        if (y == 2 && x == 0) System.out.print("2| ");
        if (y == 3 && x == 0) System.out.print("3| ");
        if (y == 4 && x == 0) System.out.print("4| ");
        if (y == 5 && x == 0) System.out.print("5| ");
        if (y == 6 && x == 0) System.out.print("6| ");
        if (y == 7 && x == 0) System.out.print("7| ");

        boolean checkerMade = false;

        for (Checker checker : gameLevel.getCheckers()) {
          if (checker.at(x, y)) {
            if (y <= 2) System.out.print(" % ");
            else System.out.print(" ■ ");
            checkerMade = true;
            continue;
          }
        }

        /*for (Checker checker : gameLevel.getcheckerOpponent()) {
          if (checker.at(x, y)) {
            if (y <= 2) System.out.print(" ○ ");
            else System.out.print(" □ ");
            checkerMade = true;
            continue;
          }
        }*/

        if (gameLevel.getGameField().isBlack(y, x) && !checkerMade) {
          System.out.print(" ○ ");
        } else if (gameLevel.getGameField().isWhite(y, x) && !checkerMade) {
          System.out.print(" ○ ");
        }
      }
      System.out.println();
    }
  }
}

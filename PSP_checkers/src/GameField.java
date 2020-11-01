import java.io.IOException;

public class GameField {

  private int model[][] =
      new int[][] {
        {8, 0, 8, 0, 8, 0, 8, 0},
        {0, 8, 0, 8, 0, 8, 0, 8},
        {8, 0, 8, 0, 8, 0, 8, 0},
        {0, 8, 0, 8, 0, 8, 0, 8},
        {8, 0, 8, 0, 8, 0, 8, 0},
        {0, 8, 0, 8, 0, 8, 0, 8},
        {8, 0, 8, 0, 8, 0, 8, 0},
        {0, 8, 0, 8, 0, 8, 0, 8}
      };

  public int getHeight() {
    return model.length;
  }

  public int getWidth() {
    return model[0].length;
  }

  public boolean isBlack(int y, int x) {
    return model[y][x] == 8;
  }

  public boolean isWhite(int y, int x) {
    return model[y][x] == 0;
  }

  public boolean isPositionCorrect(int y, int x){
      return model[y][x] == 8;
  }

    public boolean isPositionCorrect(Position position){
      return isPositionCorrect(position.getY(), position.getX());
    }


    /*public boolean isRightSide(Position position){
      return isPositionCorrect(position) && position.getX() == getWidth()-1;
    }

    public boolean isLeftSide(Position position){
      return isPositionCorrect(position) && position.getX() == 0;
    }

    public boolean isUp(Position position){
        return isPositionCorrect(position) && position.getY() == 0;
    }

    public boolean isDown(Position position){
        return isPositionCorrect(position) && position.getY() == getHeight()-1;
    }*/
}

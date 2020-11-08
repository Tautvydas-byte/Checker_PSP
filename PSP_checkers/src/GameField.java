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

  public boolean isSquareBlack(int y, int x) {
    return model[y][x] == 8;
  }

  public boolean isSquareWhite(int y, int x) {
    return model[y][x] == 0;
  }

  public boolean isPositionCorrect(int y, int x){
      return model[y][x] == 8;
  }

    public boolean isPositionCorrect(Position position){
      return isPositionCorrect(position.getY(), position.getX());
    }


    public boolean isRightLimitSide(Position position){//apie butent ribinius krastus
      return isPositionCorrect(position) && position.getX() == getWidth()-1 && !(isLowerRightCorner(position) || isUpperRightCorner(position));
    }//corner tikrina atskirai

    public boolean isLeftLimitSide(Position position){
      return isPositionCorrect(position) && position.getX() == 0  && !(isLowerLeftCorner(position) || isUpperLeftCorner(position));
    }

    public boolean isUpperLimitSide(Position position){
        return isPositionCorrect(position) && position.getY() == 0 && !(isUpperLeftCorner(position) || isUpperRightCorner(position));
    }

    public boolean isLowerLimitSide(Position position){
        return isPositionCorrect(position) && position.getY() == getHeight()-1 && !(isLowerRightCorner(position) || isLowerLeftCorner(position));
    }
    public boolean isLowerLeftCorner(Position position)
    {
      return isPositionCorrect(position) && position.getX() == 0 && position.getY() == getHeight()-1;
    }
    public boolean isLowerRightCorner(Position position)
    {
      return isPositionCorrect(position) && position.getX() == getWidth()-1 && position.getY() == getHeight()-1;
    }
    public boolean isUpperRightCorner(Position position)
    {
      return isPositionCorrect(position) && position.getX() == getWidth()-1 && position.getY() == 0;
    }
    public boolean isUpperLeftCorner(Position position)
    {
      return isPositionCorrect(position) && position.getX() == 0 && position.getY() == 0;
    }
    public boolean isNotInEitherSide(Position position)
    {
      return isPositionCorrect(position) &&
              !(isUpperLimitSide(position) || isLowerLimitSide(position) || isRightLimitSide(position) || isLeftLimitSide(position));
    }//jei bus corner tai priklausys X ir Y pusems, bet siaip niekur nenaudojama, bet galbut veliau reikes

}

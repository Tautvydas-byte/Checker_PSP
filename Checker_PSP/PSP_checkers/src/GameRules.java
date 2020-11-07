

public class GameRules {
    private GameLevel level;

    private boolean gameOver = false;

    public GameRules(GameLevel level) {
        this.level = level;
    }

    public GameRules(boolean gameOver) {
        this.gameOver = gameOver;
    }

    /*public boolean hasWinner(){
        boolean result = false;
    }*/
/*
   public void IsSideWrong(MovingDirection movingDirection)
   {
       switch(movingDirection)
        {
            case : movingDirection = MovingDirection. leftUp; break;

            case  : movingDirection = MovingDirection. leftDown; break;

            case  : movingDirection = MovingDirection. rightUp; break;

            case rightDown : movingDirection = MovingDirection. rightDown; break;

            case allSides: movingDirection = MovingDirection.allSides; break;
        }
   }

    public void moveFromLeftWall(Position position)
    {
        switch(move){
            case "only one way":
                if(level.getGameField().isPositionCorrect(level.))
                break;
        }
    }
    public void moveFromRightWall(Position position)
    {
        switch(){
            case "only one way":
                break;
        }
    }
    public void moveFromFirstPlayerWall(Position position)
    {
        switch(){
            case "only one way":
                break;
        }
    }
    public void moveFromOpponentPlayerWall(Position position)
    {
        switch(){
            case "only one way":
                break;
        }
    }
    public void cantCrossMoreThanOne(Position position){
       switch(){
           case "only one way":
               break;
       }
    }
*/
}
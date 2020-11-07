import java.util.ArrayList;

public class CheckersBehavior {

    public ArrayList<Position> getPossibleMoves(Checker selectedChecker, boolean playerTurn, ArrayList<Checker> checkers, ArrayList<Checker> checkersOpponent, GameField gameField) {
        ArrayList<Position> possiblePositions = new ArrayList<Position>();

        Position selectedCheckerPosition = selectedChecker.getPosition();

            if(gameField.isLeftSide(selectedCheckerPosition))
            {
                if(!thereIsCheckerInPosition(selectedCheckerPosition.rightUp(), checkers) && playerTurn)
                {
                    possiblePositions.add( new Position(selectedCheckerPosition.rightUp()));
                }
                if(!thereIsCheckerInPosition(selectedCheckerPosition.rightDown(), checkers) && !playerTurn)
                {
                    possiblePositions.add( new Position(selectedCheckerPosition.rightDown()));
                }
            }

            else if (gameField.isRightSide(selectedCheckerPosition))
            {
                if(!thereIsCheckerInPosition(selectedCheckerPosition.leftUp(),checkers) && playerTurn)
                {
                    possiblePositions.add(new Position(selectedCheckerPosition.leftUp()));
                }
                if(!thereIsCheckerInPosition(selectedCheckerPosition.leftDown(),checkers) && !playerTurn)
                {
                    possiblePositions.add( new Position(selectedCheckerPosition.leftDown()));
                }
            }

            else if (gameField.isLowerSide(selectedCheckerPosition))
            {
                if(!thereIsCheckerInPosition(selectedCheckerPosition.leftUp(),checkers))
                {
                    possiblePositions.add( new Position(selectedCheckerPosition.leftUp()));
                }

                if(!thereIsCheckerInPosition(selectedCheckerPosition.leftUp(),checkers))
                {
                    possiblePositions.add( new Position(selectedCheckerPosition.leftUp()));
                }
            }

            else if (gameField.isLowerRightCorner(selectedCheckerPosition))
            {
                if(thereIsCheckerInPosition(selectedCheckerPosition.leftUp(),checkers))
                {
                    possiblePositions.add( new Position(selectedCheckerPosition.leftUp()));
                }
            }

            else if (gameField.isLowerLeftCorner(selectedCheckerPosition))
            {
                if(thereIsCheckerInPosition(selectedCheckerPosition.rightUp(),checkers))
                {
                    possiblePositions.add( new Position(selectedCheckerPosition.rightUp()));
                }
            }
            else if (gameField.isNotInEitherSide(selectedCheckerPosition))
            {
                if (!thereIsCheckerInPosition(selectedCheckerPosition.rightUp(), checkers) && playerTurn)
                {
                    possiblePositions.add( new Position(selectedCheckerPosition.rightUp()));
                }
                if (!thereIsCheckerInPosition(selectedCheckerPosition.leftUp(), checkers) && playerTurn)
                {
                    possiblePositions.add( new Position(selectedCheckerPosition.leftUp()));
                }

                if (!thereIsCheckerInPosition(selectedCheckerPosition.rightDown(), checkers) && !playerTurn)
                {
                    possiblePositions.add( new Position(selectedCheckerPosition.rightDown()));
                }
                if (!thereIsCheckerInPosition(selectedCheckerPosition.leftDown(), checkers) && !playerTurn)
                {
                    possiblePositions.add( new Position(selectedCheckerPosition.leftDown()));
                }
            }
        return possiblePositions;
    }

    private boolean thereIsCheckerInPosition(Position position, ArrayList<Checker> checkers)
    {
        for (Checker checker : checkers)
        {
            if (checker.getPosition().equals(position)) return true;
        }
        return false;
    }
}

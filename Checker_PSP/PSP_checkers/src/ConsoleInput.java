import java.io.IOException;
import java.util.Scanner;

public class ConsoleInput {

  public Position getPositionInput() throws IOException {
    int yCheckerPlace ;
    int xCheckerPlace;
      Scanner input = new Scanner(System.in);
    System.out.print("Input checker coordination ex.: 51");

    String coordinates;
    while (true)
    {
      coordinates = input.next();
      if (coordinatesAreValidNumber(coordinates)) break;
      else System.out.println("Please enter coordinates in proper form.");
    }


    yCheckerPlace = Integer.parseInt(coordinates.substring(1));
    xCheckerPlace = Integer.parseInt(coordinates.substring(0, 1));
    return new Position(yCheckerPlace, xCheckerPlace);
  }

  private boolean coordinatesAreValidNumber(String coordinates) {

      if (coordinates.length() != 2) return false;

      try {
        Integer.parseInt(coordinates);
      } catch (Exception e){
        return false;
      }

      return true;
  }
}

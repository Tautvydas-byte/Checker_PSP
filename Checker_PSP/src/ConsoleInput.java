import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleInput {

  public Position getPositionInput() throws IOException {
    int yCheckerPlace ;
    int xCheckerPlace;
      Scanner input = new Scanner(System.in);
    System.out.print("Input checker coordination ex.: 51");
    String coordinates = input.next();

    yCheckerPlace = Integer.parseInt(coordinates.substring(1));
    xCheckerPlace = Integer.parseInt(coordinates.substring(0,1));

    return new Position(yCheckerPlace, xCheckerPlace);
  }
}

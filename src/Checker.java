public class Checker {

  private Position position;

  public Checker(Position position) {
    this.position = position;
  }

  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public boolean at(Position position) {
    return this.position.getY() == position.getY() && this.position.getX() == position.getX();
    //gaunu pozicija ir tikrinu ar yra checeris toj pozicijoj ar ne
  }

  public boolean at(int x, int y) {
    return this.position.getY() == y && this.position.getX() == x;
    //gaunu pozicija ir tikrinu ar yra checeris toj pozicijoj ar ne
  }
}

public class Position {

  private int x;
  private int y;

  public Position(int y, int x) {
    this.x = x;
    this.setY(y);
  }

  public Position(Position position) {
    this.x = position.x;
    this.y = position.y;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public boolean equals(Position pos) {
    return this.x == pos.getX() && this.y == pos.getY();
  }

  public Position leftUp() {
    return new Position(y - 1, x - 1);
  }

  public Position rightUp() {
    return new Position(y + 1, x - 1);
  }

  public Position leftDown() {
    return new Position(y - 1, x + 1);
  }

  public Position rigDown() {
    return new Position(y + 1, x + 1);
  }

  public Position addX(int dx) {
    this.x += dx;
    return this;
  }

  public Position addY(int dy) {
    this.y += dy;
    return this;
  }

  public boolean at(int x2, int y2) {
    return this.x == x2 && this.y == y2;
  }
}

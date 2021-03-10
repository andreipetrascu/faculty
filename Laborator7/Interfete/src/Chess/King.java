package Chess;

public class King implements ChessPiece {

    public String name;
    private int x;
    private int y;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean movePiece(int nx, int ny) {
        if ((nx >= 0 && nx <= 7 && ny >= 0 && ny <= 7) && (((this.x == nx) && ((ny == this.y - 1) || (ny == this.y + 1))) ||
                ((this.y == ny) && ((nx == this.x - 1) || (nx == this.x + 1))) ||
                ((nx == this.x - 1) && (ny == this.y - 1)) || ((nx == this.x + 1) && (ny == this.y + 1)) ||
                ((nx == this.x - 1) && (ny == this.y + 1)) || ((nx == this.x + 1) && (ny == this.y - 1)))) {

            return true;
        } else return false;
    }

    public King(String s, int nx, int ny) {
        this.name = s;
        this.x = nx;
        this.y = ny;
    }

    public King() {
        this.name = "_";
    }
}

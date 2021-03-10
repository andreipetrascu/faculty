package Chess;

public class King extends ChessPiece {

    public King(String s, int nx, int ny){
        super(s, nx, ny);
    }
    public King(){
        super();
    }

    public boolean movePiece(int nx, int ny) {
        if ((nx >= 0 && nx <= 7 && ny >= 0 && ny <= 7) && (((this.x == nx) && ((ny == this.y - 1) || (ny == this.y + 1))) ||
                ((this.y == ny) && ((nx == this.x - 1) || (nx == this.x + 1))) ||
                ((nx == this.x - 1) && (ny == this.y - 1)) || ((nx == this.x + 1) && (ny == this.y + 1)) ||
                ((nx == this.x - 1) && (ny == this.y + 1)) || ((nx == this.x + 1) && (ny == this.y - 1))))
            //  System.out.println("Good move");
        return true;
        else return false;
    }
}

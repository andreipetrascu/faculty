package Chess;

public class Queen extends ChessPiece {
    public Queen(String s, int nx, int ny){
        super(s, nx, ny);
    }

    public boolean movePiece(int nx, int ny) {
        //Not complete conditions
        if( (nx >= 0 && nx <= 7 && ny >= 0 && ny <= 7) && ( (this.x == nx) || (this.y == ny)  ))
            return true;
        else
            return false;
    }
}

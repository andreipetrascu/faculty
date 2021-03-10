package Chess;

abstract public class ChessPiece {

    protected String name;
    protected int x;
    protected int y;

    public ChessPiece(String s, int nx, int ny){
        name = s;
        x = nx;
        y = ny;
    }
    public ChessPiece(){
        name = "_";
    }

    abstract public boolean movePiece(int nx, int ny);
}

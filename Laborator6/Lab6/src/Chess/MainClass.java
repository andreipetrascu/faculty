package Chess;

public class MainClass {
    public static void main(String[] args){

        ChessBoard board = new ChessBoard();
        King k1 = new King("BK", 1, 1);
        Queen q1 = new Queen("WQ", 5, 5);

        board.chessBoard[k1.x][k1.y] = k1;
        board.chessBoard[q1.x][q1.y] = q1;

        if(k1.movePiece(1, 2) == true){
            board.movePiece(k1, 1, 2);
        }

        if(q1.movePiece(5, 0) == true){
            board.movePiece(q1, 5, 0);
        }
        board.displayBoard();
        System.out.println(q1.y);
    }
}

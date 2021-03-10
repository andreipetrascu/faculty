package Chess;

public class ChessBoard {

    protected ChessPiece[][] chessBoard = new ChessPiece[8][8];

    public ChessBoard(){
        ChessPiece piece = new King();
        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++){
                chessBoard[i][j] = piece;
            }
        }
    }

    public void displayBoard(){
        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++){
                System.out.print(chessBoard[i][j].name + " ");
            }
            System.out.println();
        }
    }

    public void movePiece(ChessPiece piece, int nx, int ny){
        this.chessBoard[piece.x][piece.y] = new King();
        this.chessBoard[nx][ny] = piece;
        piece.x = nx;
        piece.y = ny;
    }
}

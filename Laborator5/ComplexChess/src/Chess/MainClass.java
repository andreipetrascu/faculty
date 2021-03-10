package Chess;

import Chess.ChessBoard;

public class MainClass {
    public static void main(String[] args){

        ChessBoard b1 = new ChessBoard();
        b1.displayBoard();

        b1.moveSomething(0, 4, 1, 4);

       // King k1 = new King("BK", 0, 4);
       // k1.moveTest(1, 4);
    }
}

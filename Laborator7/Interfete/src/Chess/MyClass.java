package Chess;

public class MyClass {
    public static void main(String[] args) {
        ChessPiece[][] board = new ChessPiece[8][8];

        King k1 = new King("k", 0, 0);
        King k2 = new King("k", 2, 4);

        board[0][0] = k1;
        board[2][4] = k2;

        int nx = 0;
        int ny = 1;

        if (k1.movePiece(nx, ny) == true) {
            board[nx][ny] = k1;
            System.out.println("Successful move.");
        } else {
            System.out.println("Try other values for nx and ny...");
        }

        System.out.println("Hallo");
    }
}

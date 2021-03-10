package Chess;

public class ChessBoard {

    private String[][] board;

    public ChessBoard()
    {
        board = new String[][]{
                {"BR", "BH", "BB", "BQ", "BK", "BB", "BH", "BR"},
                {"BP", "BP", "BP", "BP", "BP", "BP", "BP", "BP"},
                {"_", "_", "_", "_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_", "_", "_", "_"},
                {"WP", "WP", "WP", "WP", "WP", "WP", "WP", "WP"},
                {"WR", "WH", "WB", "WQ", "WK", "WB", "WH", "WR"},
        };

    }

    public void displayBoard()
    {
        for(int i=0; i<8; i++)
        {
            for(int j=0; j<8; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void moveSomething(int cx, int cy, int nx, int ny){
        switch (this.board[cx][cy]){
            case "BK":
            {
                King k1 = new King("BK", cx, cy);
                if(k1.moveTest(nx, ny) == true){
                    if(this.board[nx][ny] == "_"){
                        this.board[nx][ny] = "BK";
                        this.board[cx][cy] = "_";
                    }
                    else{
                        System.out.println("Occupied position");
                    }
                }
                else{
                    System.out.println("Wrong move");
                }
            }
        }
    }
}


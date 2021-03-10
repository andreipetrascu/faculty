package Chess;

public class King {
    private String name;
    private int x;
    private int y;

    public King(String name, int x, int y){
       this.name = name;
       this.x = x;
       this.y = y;
    }

    public boolean moveTest(int nx, int ny){
            if  ((nx>=0 && nx<=7 && ny>=0 && ny<=7) && ( ((this.x == nx)&&((ny == this.y-1)||(ny == this.y+1))) ||
                    ((this.y == ny)&&((nx == this.x-1)||(nx == this.x+1))) ||
                    ((nx == this.x-1)&&(ny == this.y-1)) || ((nx == this.x+1)&&(ny == this.y+1)) ||
                    ((nx == this.x-1)&&(ny == this.y+1)) || ((nx == this.x+1)&&(ny == this.y-1)))){
              //  System.out.println("Good move");
                return true;
        }
            else{
              //  System.out.println("Bad move");
                return false;
            }
    }
}

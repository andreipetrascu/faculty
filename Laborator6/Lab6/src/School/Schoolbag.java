package School;

public class Schoolbag {

    Supplies[] list;
    private int currentPosition = 0;

    public Schoolbag(int nrOfSupplies){
        list = new Supplies[nrOfSupplies];
    }
    public Schoolbag(){
        this(5);
    }

    public void addManual(Manual x){
        list[currentPosition] = x;
        currentPosition++;
    }

    public void addNotebook(Notebook x){
        list[currentPosition] = x;
       currentPosition++;
    }

    public void listItems(){
       for(int i=0; i<currentPosition; i++){
            System.out.println(this.list[i].getLabel());
      }
        System.out.println();
    }

    public void listManual(){
        for(int i=0; i<currentPosition; i++){
            if(this.list[i] instanceof Manual)
            System.out.println(this.list[i].getLabel());
        }
        System.out.println();
    }

    public void listNotebook(){
        for(int i=0; i<currentPosition; i++){
            if(this.list[i] instanceof Notebook)
                System.out.println(this.list[i].getLabel());
        }
        System.out.println();
    }

    public int getNuSupplies(){
        return currentPosition;
    }

    public int getNuManual(){
        int sum = 0;
        for(int i=0; i<currentPosition; i++){
            if(this.list[i] instanceof Manual)
               sum++;
        }
        return sum;
    }

    public int getNuNotebook(){
        int sum = 0;
        for(int i=0; i<currentPosition; i++){
            if(this.list[i] instanceof Notebook)
                sum++;
        }
        return sum;
    }
}

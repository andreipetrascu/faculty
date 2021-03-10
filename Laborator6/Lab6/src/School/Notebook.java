package School;

public class Notebook extends Supplies{

    public Notebook(String name){
        this.label = name;
    }
    public String getLabel(){
        return "Notebook: " + this.label;

    }
}

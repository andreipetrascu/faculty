package School;

public class Manual extends Supplies {

    public Manual(String name){
        this.label = name;
    }

    public String getLabel(){
        return "Manual: " + this.label;
    }
}


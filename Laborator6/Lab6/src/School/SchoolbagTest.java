package School;

public class SchoolbagTest {

    public static void main(String[] args){

        Manual m1 = new Manual("Math");
        Manual m2 = new Manual("Biology");
        Manual m3 = new Manual("Chemistry");

        Notebook n1 = new Notebook("Physics");
        Notebook n2 = new Notebook("POO");
        Notebook n3 = new Notebook("SDA");

        Schoolbag s = new Schoolbag(7);

        s.addManual(m1);
        s.addNotebook(n1);
        s.addManual(m2);
        s.addNotebook(n2);
        s.addNotebook(n3);

        System.out.println(s.getNuSupplies());
        System.out.println(s.getNuManual());
        System.out.println(s.getNuNotebook());

       s.listItems();
       s.listManual();
       s.listNotebook();

    }
}

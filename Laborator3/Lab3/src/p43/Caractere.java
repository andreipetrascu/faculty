package p43;
import java.util.*;

public class Caractere {

    public static boolean vocala(char x){
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' ||
        x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {
            return true;
        }
        return false;
    }

    public static boolean consoana(char x){
        if (x == 'b' || x == 'c' || x == 'd' || x == 'f' || x == 'g' || x == 'h' || x == 'j' || x == 'k'
                || x == 'l' || x == 'm' || x == 'n' || x == 'p' || x == 'q' || x == 'r' || x == 's'
                || x == 't' || x == 'v' || x == 'w' || x == 'x' || x == 'y' || x == 'z' || x == 'B' || x == 'C' || x == 'D'
                || x == 'F' || x == 'G' || x == 'H' || x == 'J' || x == 'K'
                || x == 'L' || x == 'M' || x == 'N' || x == 'P' || x == 'Q' || x == 'R' || x == 'S'
                || x == 'T' || x == 'V' || x == 'W' || x == 'X' || x == 'Y' || x == 'Z') {
            return true;
        }
        return false;
    }


    public static void main43(){

        String a = "SimpleCodeForCharacters";
        char[] b = a.toCharArray();

        for(char j:b){
            System.out.print(j + " ");
        }

        System.out.println();

        int nrConsoane = 0;
        int nrVocale = 0;
        boolean c;
        boolean v;



        for(int i=0; i<b.length; i++){
            c = consoana(b[i]);
            v = vocala(b[i]);
            if(c == true){
                nrConsoane++;
            }
            if(v == true){
                nrVocale++;
            }
        }

        System.out.println("Consoane = " + nrConsoane);
        System.out.println("Vocale = " + nrVocale);

        Scanner in = new Scanner(System.in);
        String voc1;
        char voc2;
        System.out.println("Introduceti o vocala ");
        voc1 = in.nextLine();
        voc2 = voc1.charAt(0);

        System.out.println("Indicii: ");

        for(int i=0; i<b.length; i++){
            if(b[i] == voc2){
                System.out.print(i + " ");
            }
        }


    }
}


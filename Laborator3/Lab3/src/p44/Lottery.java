package p44;
import java.util.Random;

public class Lottery {
    public static void main44(){

        int[] myChoice = {1, 2, 3, 4, 5, 6};
        int[] countWinner = new int[6];
        int nrOfElections = 1000;
        int copyElections = nrOfElections;
        int count=0;


        while (nrOfElections > 0){

            count = 0;

            for(int i=0; i<6; i++){
                Random rand = new Random();
                int r1 = rand.nextInt(50);

                if(r1 == myChoice[i]){
                    count++;
                }
            }
            countWinner[count]++;

            nrOfElections--;
        }

        for(int i=0; i<6; i++){
            double p = copyElections;
            double percentage = (countWinner[i]*100)/p;

            System.out.print("Draws with " + i + " winner numbers " + countWinner[i]);
            System.out.print("     " + percentage + "%");
            System.out.println();
        }

    }
}

package p45;

import java.util.Random;

public class LotterySimulation {
    public static void main45(){

        int nrOfElections = 10;
        int copyElections = nrOfElections;

        while (nrOfElections > 0){

            for(int i=0; i<6; i++){
                Random rand = new Random();
                int r1 = rand.nextInt(50);

                System.out.print(r1 + " ");
            }
            System.out.println();
            nrOfElections--;
        }

    }
}

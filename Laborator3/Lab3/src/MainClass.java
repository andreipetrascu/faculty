
import p41.Goldbach;
import p42.Newton;
import p43.Caractere;
import p44.Lottery;
import p45.LotterySimulation;

import javax.swing.*;

public class MainClass {

    public static void main(String[] args){

        String select = JOptionPane.showInputDialog(null, "Select a task between 1 and 6 ");
        int sel = Integer.parseInt(select);

        switch (sel){
            case 1:
            System.out.println("Task 4.1:");
            Goldbach x1 = new Goldbach();
            x1.main41();
            break;

            case 2:{
                System.out.println("Task 4.2:");
                Newton x2 = new Newton();
                x2.main42();
                break;
            }

            case 3:{
                System.out.println("Task 4.3:");
                Caractere x3 = new Caractere();
                x3.main43();
                break;
            }

            case 4:{
                System.out.println("Task 4.4:");
                Lottery x4 = new Lottery();
                x4.main44();
                break;
            }

            case 5:{
                System.out.println("Task 4.5:");
                LotterySimulation x5 = new LotterySimulation();
                x5.main45();
                break;
            }


            default:
                System.out.println("Invalid input");

        }


        /*

        System.out.println("Task 4.6:");*/
    }

}

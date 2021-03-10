package p41;

import javax.swing.*;

public class Goldbach {


    public static void main41() {

        String first;
        String last;
        int m;
        int n;

        first = JOptionPane.showInputDialog(null, "m = ");
        last = JOptionPane.showInputDialog(null, "n = ");

        m = Integer.parseInt(first);
        n = Integer.parseInt(last);

        boolean[] primeNumbers = new boolean[n/2+2];

        for(int i=2; i<n/2+1; i++){
            if(isPrime(i) == true){
                primeNumbers[i] = true;
            }
        }

        for(int i=2; i<n/2+1; i++){

            if(primeNumbers[i] == true){

                for(int j=i; j<n/2+1; j++){

                    int sum = i+j;
                    if(primeNumbers[j] == true && sum>=m && sum<=n && sum%2==0  ){
                        System.out.println( sum + "=" + i + "+" + j  );
                    }
                }
            }
        }
    }

    public static boolean isPrime(int x){
        if(x<2){
            return false;
        }
        if(x==2){
            return true;
        }
        if(x%2==0){
            return false;
        }
        for(int d=3; d*d<=x; d+=2){
            if(x%d==0){
                return false;
            }
        }
        return true;
    }

}

package p42;

public class Newton {


    public static void main42(){

        int n=0;
        //f(x) = ax^2+bx+c
        double a = 1;
        double b = 1;
        double c = -5;

        double e = 0.0001;

        double xo = 1;
        double xn = xo;
        double y1 = a*xo*xo + b*xo + c;
        double y2 = 2*a*xo+b;

        do {
            n++;
            xn = xo;

            y1 = a*xo*xo + b*xo + c;
            y2 = 2*a*xo+b;

            xo = xo - y1/y2;

        }while ( Math.abs(xo-xn) >= e);

        System.out.println(xo );
        System.out.println("Numar de iteratii:" + n);

    }



}

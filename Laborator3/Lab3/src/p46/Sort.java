/*package p46;

public class Sort {
}
*/

class Order {

    public static void main(String[] args) {
        int a1,a2,a3,a4;
        a1=4; a2=1; a3=10; a4=2;

        long result = pack(a1,a2,a3,a4);
        System.out.println("Long: " + result);
        System.out.println("Binary: " + Long.toBinaryString(result));
    }

    public static long pack(int c1, int c2, int c3, int c4){
        return ((0xFFL & c1) << 24) | ((0xFFL & c2) << 16) | ((0xFFL & c3) << 8) |(0xFFL    &c4);
    }
}
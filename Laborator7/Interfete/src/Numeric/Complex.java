package Numeric;

public class Complex implements Numeric {
    private int rez;
    private int imz;

    public int getRez() {
        return rez;
    }

    public void setRez(int rez) {
        this.rez = rez;
    }

    public int getImz() {
        return imz;
    }

    public void setImz(int imz) {
        this.imz = imz;
    }

    public Numeric multiply(Numeric n) {
        Numeric m = new Complex();
        ((Complex) m).rez = this.rez * ((Complex) n).rez - this.imz * ((Complex) n).imz;
        ((Complex) m).imz = this.rez * ((Complex) n).imz + this.imz * ((Complex) n).rez;
        return m;
    }
}

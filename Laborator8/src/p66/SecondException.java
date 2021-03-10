package p66;

public class SecondException extends Exception{
    private String message;

    public SecondException(String msg) {
        this.message = msg;
    }

    public void printIt() {
        System.out.println(this.message);
    }
}

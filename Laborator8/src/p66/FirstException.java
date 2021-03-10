package p66;

public class FirstException extends Exception {
    private String message;

    public FirstException(String msg) {
        this.message = msg;
    }

    public void printMessage() {
        System.out.println(this.message);
    }
}

package p65;

public class ExceptionTest extends Exception{
    String message;

    public ExceptionTest(String msg) {
        this.message = msg;
    }

    public void printMessage() {
        System.out.println(this.message);
    }

}

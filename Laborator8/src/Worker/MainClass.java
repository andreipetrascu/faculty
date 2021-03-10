package Worker;

public class MainClass {
    public static void main(String[] args) {
        Worker man = new Worker();
        WorkCalendar newCalendar = new WorkCalendar();

        man.setName("John");
        man.setCalendar(newCalendar);

        try {
            man.work("Sunday");
        } catch (NonWorkingDayException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            man.work("Monday");
        } catch (NonWorkingDayException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

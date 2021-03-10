package Worker;

public class Worker {
    private String name;
    private WorkCalendar calendar;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkCalendar getCalendar() {
        return calendar;
    }

    public void setCalendar(WorkCalendar calendar) {
        this.calendar = calendar;
    }

    public void work(String day) throws NonWorkingDayException {
        if(calendar.isWorking(day) == true)
        {
            System.out.println("Is working");
        }
        else
        {
            throw new NonWorkingDayException("This is not a working day for me.");
        }
    }


}

package Worker;

public class WorkCalendar {
    private Day[] calendar = new Day[7];

    public WorkCalendar()
    {
        this.calendar[0] = new Day("Monday", true);
        this.calendar[1] = new Day("Tuesday", true);
        this.calendar[2] = new Day("Wednesday", true);
        this.calendar[3] = new Day("Thursday", true);
        this.calendar[4] = new Day("Friday", true);
        this.calendar[5] = new Day("Saturday", false);
        this.calendar[6] = new Day("Sunday", false);
    }

    public WorkCalendar(boolean b0, boolean b1, boolean b2, boolean b3, boolean b4, boolean b5, boolean b6)
    {
        this.calendar[0] = new Day("Monday", b0);
        this.calendar[1] = new Day("Tuesday", b1);
        this.calendar[2] = new Day("Wednesday", b2);
        this.calendar[3] = new Day("Thursday", b3);
        this.calendar[4] = new Day("Friday", b4);
        this.calendar[5] = new Day("Saturday", b5);
        this.calendar[6] = new Day("Sunday", b6);
    }

    public boolean isWorking(String dayName)
    {
        for(int i=0; i<this.calendar.length; i++)
        {
            if(this.calendar[i].getName() == dayName)
                return this.calendar[i].isWorking();
        }
        return false;
    }

    /**
     * Set day as working or not working
     * @param dayName
     * @param working
     */
    public void setCalendar(String dayName, boolean working) {
        for(int i=0; i<this.calendar.length; i++)
        {
            if(this.calendar[i].getName() == dayName){
                this.calendar[i].setWorking(working);
            }
        }

    }
}

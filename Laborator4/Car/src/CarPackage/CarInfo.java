package CarPackage;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CarInfo {

    private Date oilChange;
    private Date airFilterChange;
    private Date oilFilterChange;
    private Date gasFilterChange;
    private Date pollenFilterChange;

    public CarInfo(){
        Calendar c1 = new GregorianCalendar(2018, 2, 11);
        Calendar c2 = new GregorianCalendar(2017, 8, 30);
        Calendar c3 = new GregorianCalendar(2017, 10, 1);
        Calendar c4 = new GregorianCalendar(2019, 4, 20);
        Calendar c5 = new GregorianCalendar(2015, 11, 7);

        this.oilChange = c1.getTime();
        this.airFilterChange = c2.getTime();
        this.oilFilterChange = c3.getTime();
        this.gasFilterChange = c4.getTime();
        this.pollenFilterChange = c5.getTime();
    }

    public void showCarInfo(){
        System.out.println("Oil change: " + this.oilChange.toString());
        System.out.println("Air filter change: " + this.airFilterChange.toString());
        System.out.println("Oil filter change: " + this.oilFilterChange.toString());
        System.out.println("Gas filter change: " + this.gasFilterChange.toString());
        System.out.println("Pollen filter change: " + this.pollenFilterChange.toString());
    }
}

package edu.sjsu.assignment3;
import java.time.LocalDate;


public class MonthlyAppointment extends Appointment{
    /**
     * this class is for appointments that occur every month
     *
     */

    public MonthlyAppointment(String description, LocalDate startDate, LocalDate endDate) {  //autogenerated
        super(description, startDate, endDate);
    }

    @Override
   public boolean occursOn(LocalDate date) {
        if(check(date) && (date.getDayOfMonth() == ((getStartDate().getDayOfMonth()))))  //day is short
            return true;
        else
            return false;
    }


}
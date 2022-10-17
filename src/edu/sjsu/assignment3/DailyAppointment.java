package edu.sjsu.assignment3;
import java.time.LocalDate;

/**
 * this class is for reocurring daily aoppointments
 */

public class DailyAppointment extends Appointment{  //have to be public?
    public DailyAppointment(String description, LocalDate startDate, LocalDate endDate) {
        super(description, startDate, endDate);
    }

//override compare to?
    @Override   //why not overriding gives no error?, include last day!!
    public boolean occursOn(LocalDate date) {
        return check(date);
    }
}

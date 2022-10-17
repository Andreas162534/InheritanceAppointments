package edu.sjsu.assignment3;
import java.time.LocalDate;

/**
 * this class is for appintments that are just once so startDate == endDate!
 */
public class OnetimeAppointment extends Appointment{  //classes public bc of main


    public OnetimeAppointment(String description, LocalDate startDate) {  //how come this??  (with OneTime? appointment
        super(description, startDate, startDate);
    }

    @Override
     public boolean occursOn(LocalDate date) {   // could also use isEqual method, differenc?
        return getStartDate().isEqual(date);  //can i use getter as if its variable? not always huh!

    }




    }

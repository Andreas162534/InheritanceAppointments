package edu.sjsu.assignment3;
import java.time.LocalDate;

/**
 * This class is the superclass of all kinds of Appointments
 *
 */


//cannot be instintiatied -> abstract, still has constuctor to build object

public abstract class Appointment implements Comparable<Appointment> {
    private String description;  //must be private
    private LocalDate startDate;
    private LocalDate endDate;



    public Appointment(String description, LocalDate startDate, LocalDate endDate) {  //initializing?
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;

    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    @Override
    public String toString(){
        return this.getClass() + " " +this.description + " " + this.startDate + " " + this.endDate;
    }
    public abstract boolean occursOn(LocalDate date);  //passt so

    /**
     * This method checks if the appointment is on the same date or not
     * @param date
     * @return boolean
     */

    //de morgan
    protected boolean check(LocalDate date) {  //will be inherited
        //check if input is between start and end date
        if (!(!date.isAfter(getStartDate()) || !date.isBefore(getEndDate())) || getStartDate().isEqual(date) || getEndDate().isEqual(date)) {  //muss keine getter verwednen, weil method in superclass ist!
            return true;
        }
        return false;
    }

    /**
     * This method makes appointments comparable and sorts them for start, then endDate and dthen description
     * @param other the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Appointment other) {

        if (this.startDate.compareTo(other.startDate) != 0) {
            return this.startDate.compareTo(other.startDate);  //returns differnce
        }
        if (this.endDate.compareTo(other.endDate) != 0) {
            return this.endDate.compareTo(other.endDate);
        }
        return this.description.compareTo(other.description);

    }

    //45321

}



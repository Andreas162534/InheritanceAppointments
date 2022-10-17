package edu.sjsu.assignment3;

import java.util.Comparator;

/**
 * This interface compares the Appointments in the order: descrition, start date, end date
 */
public class DesComparator implements Comparator<Appointment> {  //das muss interface sein!!
   // public Comparator<Appointment> DesComparator = new Comparator<Appointment>() {

    @Override
    public int compare(Appointment a, Appointment b) {  //kann das wirklich stimmen?
        if (!a.getDescription().equals(b.getDescription())) {
            return a.getDescription().compareTo(b.getDescription());
        }
        if (!a.getStartDate().equals(b.getStartDate())) {
            if (a.getStartDate().isAfter(b.getStartDate())) {
                return 1;
            } else
                return -1;
        }
        if (!a.getEndDate().equals(b.getEndDate())) {
            if (a.getEndDate().isAfter(b.getEndDate())) {
                return 1;
            } else
                return -1;
        }
        return 0;  //gleich
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}


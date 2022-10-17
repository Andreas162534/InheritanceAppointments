package edu.sjsu.assignment3;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class DesComparatorTest{
    @Test
    public void comTest(){
        LocalDate startDate = LocalDate.parse("2022-01-27");//
        LocalDate endDate = LocalDate.parse("2022-05-18");//

        LocalDate testDate1 = LocalDate.parse("2022-01-27");  //
        LocalDate testDate2 = LocalDate.parse("2022-03-18"); //
       // LocalDate testDate3 = LocalDate.parse("2022-05-27");  //
        Appointment a1 = new DailyAppointment("Class", startDate, endDate);
        Appointment a2 = new DailyAppointment("Class", startDate, endDate);

        DesComparator com = new DesComparator();

        int b = com.compare(a1,a2);
        assertEquals(0, b);
    }

}

















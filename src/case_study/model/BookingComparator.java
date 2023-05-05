package case_study.model;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        return o1.getStartDate().compareTo(o2.getStartDate());
    }
}

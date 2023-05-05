package case_study.repository;
import case_study.model.Booking;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {
    static Set<Booking> set=new TreeSet<>();
    static {
        set.add(new Booking("0123", LocalDate.of(2023, 4, 25),LocalDate.of(2023, 4, 25),LocalDate.of(2023, 5, 25),"SV-0123","SVVL-0001"));
        set.add(new Booking("0124",LocalDate.of(2023, 4, 25),LocalDate.of(2023, 4, 21),LocalDate.of(2023, 5, 25),"SV-0124","SVVL-0002"));
        set.add(new Booking("0125",LocalDate.of(2023, 4, 25),LocalDate.of(2023, 4, 20),LocalDate.of(2023, 5, 25),"SV-0125","SVVL-0003"));
    }
    @Override
    public Set<Booking> getSet() {
        return set;
    }
    public void add(Booking booking){
        set.add(booking);
    }

}

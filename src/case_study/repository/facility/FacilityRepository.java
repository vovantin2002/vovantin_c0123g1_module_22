package case_study.repository.facility;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.repository.BookingRepository;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    BookingRepository bookingRepository=new BookingRepository();
    public void addNewFacility(Facility facility, int number) {
        facilityMap.put(facility, number);
    }

    private static LinkedHashMap<Facility, Integer> facilityMap;

    static {
        facilityMap = new LinkedHashMap<>();
        facilityMap.put(new Villa("SVVL-0001", "Villa 1", "100", "500", "5", "High", "Free", "2", "1"), 0);
        facilityMap.put(new House("SVHO-0002", "House 1", "50", "400", "6", "High", "Free", "2"), 0);
        facilityMap.put(new Room("SVRO-0003", "Room 1", "50", "300", "7", "Normal", "Free"), 0);
    }


    @Override
    public Map getMap() {
        return facilityMap;
    }
}

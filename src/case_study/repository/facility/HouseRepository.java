package case_study.repository.facility;

import case_study.model.facility.House;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HouseRepository {
    static Map<House, Integer> houses = new HashMap<>();

    static {
        houses.put(new House("SVHO-0002", "House 1", "50", "400", "6", "High", "Free", "2"), 0);
    }


        public  Map<House,Integer> getMapHouse(){
            return houses;
        }
}

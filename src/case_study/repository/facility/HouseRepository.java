package case_study.repository.facility;

import case_study.model.facility.House;

import java.util.LinkedList;
import java.util.List;

public class HouseRepository {
    House house=new House("SVHO-0002", "House 1", "50", "400", "6", "High", "Free", "2");

       static List<House> houseList=new LinkedList<>();
        static{
               houseList.add(new House("SVHO-0002", "House 1", "50", "400", "6", "High", "Free", "2"));
        }
        public House getHouse(){
            return house;
        }
        public  List<House> getHouseList(){
            return houseList;
        }
}

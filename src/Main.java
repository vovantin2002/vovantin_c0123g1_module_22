import case_study.model.Booking;
import case_study.model.facility.House;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Main { static Scanner scanner = new Scanner(System.in);
//    static Set<Booking> set=new TreeSet<>();
//    static {
//        set.add(new Booking("0123",LocalDate.of(2021, 11, 25),LocalDate.of(2021, 11, 25),LocalDate.of(2021, 11, 25),"SV-0123","SVVL-0001"));
//        set.add(new Booking("0124",LocalDate.of(2021, 11, 25),LocalDate.of(2021, 11, 23),LocalDate.of(2021, 11, 25),"SV-0124","SVVL-0002"));
//        set.add(new Booking("0125",LocalDate.of(2021, 11, 25),LocalDate.of(2021, 11, 24),LocalDate.of(2021, 11, 25),"SV-0125","SVVL-0003"));
//    }
    public static class BookingSystem {

        private LinkedHashMap<String, Integer> bookings = new LinkedHashMap<>(); // Khai báo LinkedHashMap

        public void addBooking(String newBooking) {
            if (bookings.containsKey(newBooking)) { // Nếu phần tử đã có trong Map
                int count = bookings.get(newBooking); // Lấy giá trị của phần tử
                bookings.put(newBooking, count + 1); // Tăng giá trị của phần tử và cập nhật lại trong Map
            } else { // Nếu phần tử chưa có trong Map
                bookings.put(newBooking, 1); // Thêm mới phần tử và gán giá trị ban đầu là 1
            }
        }

//House house=map
    } public static void main(String[] args) {Map<String, Integer> map = new HashMap<>();
//        public void updateTimesOfUsingService(String serviceNum) {
//            Set<House> houseSet = houses.keySet();
//            House updatedHouse = null;
//            // find House Object with provided serviceNum
//            for (House house: houseSet) {
//                if(house.serviceID.equals(serviceNum)){
//                    updatedHouse = house;
//                    break;
//                }
//            }
//            // get the using times then add back to the map with increased times by 1
//            int usingTimes = houses.get(updatedHouse);
//            houses.put(updatedHouse, usingTimes + 1);
//            WriteFileHouse.write(houses);
//        }

    }
    }


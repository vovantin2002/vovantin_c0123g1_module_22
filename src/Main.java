import case_study.model.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

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


    } public static void main(String[] args) {
        BookingSystem bs = new BookingSystem();
        bs.addBooking("Customer A"); // Thêm phần tử vào Map với giá trị ban đầu là 1
        bs.addBooking("Customer B"); // Thêm phần tử mới vào Map với giá trị ban đầu là 1
        bs.addBooking("Customer A"); // Tăng giá trị của phần tử "Customer A" trong Map lên 1
        System.out.println(bs.bookings); // In ra Map để kiểm tra kết quả
    }
    }


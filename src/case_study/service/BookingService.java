package case_study.service;

import case_study.model.Booking;
import case_study.model.facility.Facility;
import case_study.repository.BookingRepository;
import case_study.repository.facility.FacilityRepository;
import case_study.service.facility.FacilityService;
import case_study.service.person.CustomerService;
import case_study.util.Validate;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookingService implements IBookingService {
    FacilityRepository facilityRepository=new FacilityRepository();
    FacilityService facilityService = new FacilityService();
    CustomerService customerService = new CustomerService();
    static Scanner sc = new Scanner(System.in);
    BookingRepository bookingRepository = new BookingRepository();
    Set<Booking> bookingSet = bookingRepository.getSet();

    @Override
    public void display() {
        for (Booking b : bookingSet) {
            System.out.println(b);
        }
    }

    public void add() {
        boolean flag = true;
        String bookingId = null;
        while (flag) {
            System.out.print("Enter bookingId: ");
            bookingId = sc.nextLine();
            if (bookingId == null || bookingId.equals("")) {
                System.err.print("Please enter information. ");
            } else {
                flag = false;
            }
        }
        String bookingDayy = null;
        LocalDate bookingDay = null;
        while (bookingDay == null) {
            System.out.print("Enter bookingDay: ");
            bookingDayy = sc.nextLine();
            bookingDay = Validate.parseStringToLocalDate(bookingDayy);
        }
        String startDate = null;
        LocalDate startDay = null;
        while (startDay == null) {
            System.out.print("Enter startDate: ");
            startDate = sc.nextLine();
            startDay = Validate.parseStringToLocalDate(startDate);

        }

        LocalDate dayEndTime = null;
        while (dayEndTime == null) {
            System.out.print("Enter day end: ");
            String dayEnd = sc.nextLine();
            dayEndTime = Validate.parseStringToLocalDate(dayEnd);
        }
        customerService.display();
        String customerId = Validate.checkIdCustomer();
        facilityService.display();
        flag = true;
        String serviceCode = null;
        while (flag) {
            System.out.print("Enter serviceCode: ");
            serviceCode = sc.nextLine();
            if (serviceCode == null || serviceCode.equals("")) {
                System.err.print("Please enter information. ");
            } else {
                flag = false;
            }
        }
        Booking booking = new Booking(bookingId, bookingDay, startDay, dayEndTime, customerId, serviceCode);
        bookingRepository.add(booking);
        System.out.println("successfully added new. ");
        if(facilityRepository.getMap().containsKey(serviceCode)){
            
        }
    }

    @Override
    public void edit() {

    }

}

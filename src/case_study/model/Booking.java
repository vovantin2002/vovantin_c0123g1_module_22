package case_study.model;


import java.time.LocalDate;
import java.util.Objects;

public class Booking implements Comparable {
    private String bookingId;
    private LocalDate bookingDay;
    private LocalDate startDate;
    private LocalDate endDate;
    private String customerId;
    private String serviceCode;

    public Booking() {
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", bookingDay='" + bookingDay + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customerId='" + customerId + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(bookingId, booking.bookingId) && Objects.equals(bookingDay, booking.bookingDay) && Objects.equals(startDate, booking.startDate) && Objects.equals(endDate, booking.endDate) && Objects.equals(customerId, booking.customerId) && Objects.equals(serviceCode, booking.serviceCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, bookingDay, startDate, endDate, customerId, serviceCode);
    }

    public Booking(String bookingId, LocalDate bookingDay, LocalDate startDate, LocalDate endDate, String customerId, String serviceCode) {
        this.bookingId = bookingId;
        this.bookingDay = bookingDay;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerId = customerId;
        this.serviceCode = serviceCode;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDate getBookingDay() {
        return bookingDay;
    }

    public void setBookingDay(LocalDate bookingDay) {
        this.bookingDay = bookingDay;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getAll() {
        return bookingId + "," + bookingDay + "," + startDate + "," + endDate + "," + customerId + "," + serviceCode;
    }

    @Override
    public int compareTo(Object o) {
        if (((Booking) o).startDate.isAfter(this.startDate)) {
            return -1;
        } else if (((Booking) o).startDate.isBefore(this.startDate)) {
            return 1;
        } else if(((Booking) o).startDate.isEqual(this.startDate)){
            return -1;
        } else return 0;

    }
    }


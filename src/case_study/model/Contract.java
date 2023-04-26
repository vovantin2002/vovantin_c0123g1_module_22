package case_study.model;

public class Contract {
    protected String contractId;
    protected String bookingId;
    protected String deposit;
    protected String total;
    protected String customerId;

    public Contract() {
    }

    public Contract(String contractId, String bookingId, String deposit, String total, String customerId) {
        this.contractId = contractId;
        this.bookingId = bookingId;
        this.deposit = deposit;
        this.total = total;
        this.customerId = customerId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractId='" + contractId + '\'' +
                ", bookingId='" + bookingId + '\'' +
                ", deposit='" + deposit + '\'' +
                ", total='" + total + '\'' +
                ", customerId='" + customerId + '\'' +
                '}';
    }

    public String getAll() {
        return contractId + "," + bookingId + "," + deposit + "," + total + "," + customerId;
    }
}

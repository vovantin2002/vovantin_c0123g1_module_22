package bai_13.model;

public class WorkflowManagement {
    private int id;
    private String spendingName;
    private String spendingDate;
    private int spendingAmount;
    private String moreDescription;

    public WorkflowManagement(int id, String spendingName, String spendingDate, int spendingAmount, String moreDescription) {
        this.id = id;
        this.spendingName = spendingName;
        this.spendingDate = spendingDate;
        this.spendingAmount = spendingAmount;
        this.moreDescription = moreDescription;
    }

    public String getSpendingDate() {
        return spendingDate;
    }

    public void setSpendingDate(String spendingDate) {
        this.spendingDate = spendingDate;
    }

    public WorkflowManagement() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpendingName() {
        return spendingName;
    }

    public void setSpendingName(String spendingName) {
        this.spendingName = spendingName;
    }

    public int getSpendingAmount() {
        return spendingAmount;
    }

    public void setSpendingAmount(int spendingAmount) {
        this.spendingAmount = spendingAmount;
    }

    public String getMoreDescription() {
        return moreDescription;
    }

    public void setMoreDescription(String moreDescription) {
        this.moreDescription = moreDescription;
    }

    @Override
    public String toString() {
        return "WorkflowManagement{" +
                "id=" + id +
                ", spendingName='" + spendingName + '\'' +
                ", spendingDate='" + spendingDate + '\'' +
                ", spendingAmount=" + spendingAmount +
                ", moreDescription='" + moreDescription + '\'' +
                '}';
    }
}

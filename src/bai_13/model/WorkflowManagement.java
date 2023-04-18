package bai_13.model;

public class WorkflowManagement {
    private int id;
    private String spendingName;
    private int spendingAmount    ;
    private String moreDescription;

    public WorkflowManagement(int id, String spendingName, int spendingAmount, String moreDescription) {
        this.id = id;
        this.spendingName = spendingName;
        this.spendingAmount = spendingAmount;
        this.moreDescription = moreDescription;
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
                ", spendingAmount=" + spendingAmount +
                ", moreDescription='" + moreDescription + '\'' +
                '}';
    }
}

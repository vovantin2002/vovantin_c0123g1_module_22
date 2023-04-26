package case_study.model.facility;

public abstract class Facility {
    protected String idService;
    protected String nameService;
    protected String areaAll;
    protected String price;
    protected String numberHumanMax;
    protected String rentalType;

    public Facility() {
    }

    public Facility(String idService, String nameService, String areaAll, String price, String numberHumanMax, String rentalType) {
        this.idService = idService;
        this.nameService = nameService;
        this.areaAll = areaAll;
        this.price = price;
        this.numberHumanMax = numberHumanMax;
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idService='" + idService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaAll='" + areaAll + '\'' +
                ", price='" + price + '\'' +
                ", numberHumanMax='" + numberHumanMax + '\'' +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getAreaAll() {
        return areaAll;
    }

    public void setAreaAll(String areaAll) {
        this.areaAll = areaAll;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNumberHumanMax() {
        return numberHumanMax;
    }

    public void setNumberHumanMax(String numberHumanMax) {
        this.numberHumanMax = numberHumanMax;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
}

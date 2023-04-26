package case_study.model.facility;


public class House extends Facility {
    private String roomStandard;
    private String numOfLevel;

    public House() {
    }


    public House(String idService, String nameService, String areaAll, String price, String numberHumanMax, String rentalType, String roomStandard, String numOfLevel) {
        super(idService, nameService, areaAll, price, numberHumanMax, rentalType);
        this.roomStandard = roomStandard;
        this.numOfLevel = numOfLevel;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumOfLevel() {
        return numOfLevel;
    }

    public void setNumOfLevel(String numOfLevel) {
        this.numOfLevel = numOfLevel;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numOfLevel='" + numOfLevel + '\'' +
                ", idService='" + idService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaAll='" + areaAll + '\'' +
                ", price='" + price + '\'' +
                ", numberHumanMax='" + numberHumanMax + '\'' +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    public String getAll() {
        return idService + "," + nameService + "," + areaAll + "," + price + "," + numberHumanMax + "," + rentalType + "," + roomStandard + "," + numOfLevel;
    }

}

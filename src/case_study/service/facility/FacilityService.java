package case_study.service.facility;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.repository.facility.FacilityRepository;
import case_study.util.Validate;

import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    static FacilityRepository facilityRepository = new FacilityRepository();
    static Map<Facility, Integer> facilityIntegerMap = facilityRepository.getMap();
    Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        for (Facility facility : facilityIntegerMap.keySet()) {
            System.out.println(facility);
        }
    }

    public void displayFacilityMaintenance() {
        if (facilityIntegerMap != null) {
            for (Map.Entry<Facility, Integer> facility : facilityIntegerMap.entrySet()) {
                if (facility.getValue() >= 5) {
                    System.out.println(facility);
                }
            }
        }
    }

    @Override
    public void add() {
        String chos = "-1";
        while (!chos.equals("4")) {
            System.out.print("Add new facillity: \n" +
                    "1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "Enter your selection: ");
            chos = sc.nextLine();
            switch (chos) {
                case "1":
                    String id = Validate.checkIdVilla();
                    String name = Validate.checkName();
                    String areaAll = Validate.checkArea();
                    String price = Validate.checkPrice();
                    String numberHumanMax = Validate.checkNumberHumanMax();
                    String rentalType = Validate.checkRentalType();
                    String roomStandard = Validate.checkRoomStandard();
                    String poolArea = Validate.checkArea();
                    String numOfLevel = Validate.checkNumOfLevel();
                    Villa villa = new Villa(id, name, areaAll, price, numberHumanMax, rentalType, roomStandard, poolArea, numOfLevel);
                    System.out.println("Enter number of times used: ");
                    int n = Integer.parseInt(sc.nextLine());
                    facilityRepository.addNewFacility(villa, n);
                    System.out.println("successfully added new. ");
                    break;
                case "2":
                    String id1 = Validate.checkIdHouse();
                    String name1 = Validate.checkName();
                    String areaAll1 = Validate.checkArea();
                    String price1 = Validate.checkPrice();
                    String numberHumanMax1 = Validate.checkNumberHumanMax();
                    String rentalType1 = Validate.checkRentalType();
                    String roomStandard1 = Validate.checkRoomStandard();
                    String numOfLevel1 = Validate.checkNumOfLevel();
                    House house = new House(id1, name1, areaAll1, price1, numberHumanMax1, rentalType1, roomStandard1, numOfLevel1);
                    System.out.println("Enter number of times used: ");
                    int n1 = Integer.parseInt(sc.nextLine());
                    facilityRepository.addNewFacility(house, n1);
                    System.out.println("successfully added new. ");
                    break;
                case "3":
                    String id2 = Validate.checkIdRoom();
                    String name2 = Validate.checkName();
                    String areaAll2 = Validate.checkArea();
                    String price2 = Validate.checkPrice();
                    String numberHumanMax2 = Validate.checkNumberHumanMax();
                    String rentalType2 = Validate.checkRentalType();
                    boolean flag = true;
                    String freeServiceIncluded = null;
                    while (flag) {
                        System.out.print("Enter free ServiceIncluded: ");
                        freeServiceIncluded = sc.nextLine();
                        if (freeServiceIncluded == null || freeServiceIncluded.equals("")) {
                            System.err.print("Please enter information. ");
                        } else {
                            flag = false;
                        }
                    }
                    Room room = new Room(id2, name2, areaAll2, price2, numberHumanMax2, rentalType2, freeServiceIncluded);
                    System.out.println("Enter number of times used: ");
                    int n2 = Integer.parseInt(sc.nextLine());
                    facilityRepository.addNewFacility(room, n2);
                    System.out.println("successfully added new. ");
                    break;
                case "4":

                    break;
                default:
                    System.out.print("Invalid selection, please re-enter.");
            }
        }
    }

    @Override
    public void edit() {

    }

}

package case_study.util;

import case_study.model.facility.House;
import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndWriteHouse {
    static File file = new File("case_study\\data\\house.csv");

    public static LinkedHashMap<House, Integer> read(House house) {
        LinkedHashMap<House, Integer> houseIntegerLinkedHashMap = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                houseIntegerLinkedHashMap.put(new House(strings[0], strings[1], strings[2],
                        strings[3], strings[4], strings[5], strings[6],
                        strings[7]), Integer.parseInt(strings[8]));
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseIntegerLinkedHashMap;
    }

    public static void write(LinkedHashMap<House, Integer> houseIntegerLinkedHashMap) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<House, Integer> h :
                    houseIntegerLinkedHashMap.entrySet()) {
                bufferedWriter.write(h.getKey().getAll() + "," + h.getValue());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

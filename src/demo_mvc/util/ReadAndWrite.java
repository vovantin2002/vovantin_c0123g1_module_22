package demo_mvc.util;

import demo_mvc.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    static File file = new File("demo_mvc\\data\\text.csv");

    public static void write(Student student) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(student.getToCsv());
            fileWriter.write("\n");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Student> read() {
        ArrayList<Student> studentList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = "";
            while ((str = bufferedReader.readLine()) != null && !(str).equals("")) {
                String[] str1 = str.split(",");
                Student student = new Student(Integer.parseInt(str1[0]), str1[1]);
                studentList.add(student);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return studentList;
    }
}

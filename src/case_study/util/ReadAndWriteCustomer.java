package case_study.util;

import case_study.model.person.Customer;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCustomer {
   static File file=new File("case_study\\data\\customer.csv");
    public static void write(List<Customer> list){

        FileWriter fileWriter=null;

        try {
            fileWriter =new FileWriter(file);
            for (Customer customer:list) {
                fileWriter.write(customer.getInfoToCsv());
                fileWriter.write("\n");
            }
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static List<Customer> read(){
        List<Customer>eList=new ArrayList<>();
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try {
            fileReader=new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            String line="";
            while ((line=bufferedReader.readLine())!=null && !(line).equals("")){
                String [] str=line.split(",");
                Customer customer=new Customer(str[0],str[1],str[2],str[3],str[4],str[5],str[6],str[7],str[8]);
                eList.add(customer);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return eList;
    }
}

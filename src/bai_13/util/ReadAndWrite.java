package bai_13.util;

import bai_13.model.WorkflowManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    static File file = new File("bai_13\\data\\text.csv");

    public static void write(WorkflowManagement workflowManagement) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(workflowManagement.writeToFile());
            bufferedWriter.write("\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    } public static void writeToDelete(List<WorkflowManagement> workflowManagementList1) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i <workflowManagementList1.size() ; i++) {
                bufferedWriter.write(workflowManagementList1.get(i).writeToFile());
                bufferedWriter.write("\n");
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static List<WorkflowManagement> read(){
        List<WorkflowManagement>workflowManagementList=new ArrayList<>();
        FileReader fileReader =null;
        BufferedReader bufferedReader=null;
        try {
           fileReader =new FileReader(file);
           bufferedReader=new BufferedReader(fileReader);
           String str="";
           while ((str=bufferedReader.readLine())!=null){
               String []str1=str.split(",");
               WorkflowManagement workflowManagement=new WorkflowManagement(Integer.parseInt(str1[0]),str1[1],str1[2],Integer.parseInt(str1[3]),str1[4]);
               workflowManagementList.add(workflowManagement);
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
        return workflowManagementList;
    }
}

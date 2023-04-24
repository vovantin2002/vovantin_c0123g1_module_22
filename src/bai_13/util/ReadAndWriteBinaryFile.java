package bai_13.util;

import bai_13.model.WorkflowManagement;

import java.io.*;
import java.util.List;

public class ReadAndWriteBinaryFile {

    static File file = new File("bai_13\\data\\binary.text");

    public static List<WorkflowManagement> read() {
        List<WorkflowManagement> workflowManagementList = null;
        ObjectInputStream objectInputStream = null;
        FileInputStream fileInputStream = null;
        try {
            if (file.length() == 0) {
                return workflowManagementList;
            } else {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                workflowManagementList = (List<WorkflowManagement>) objectInputStream.readObject();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectInputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return workflowManagementList;
    }

    public static void write(List<WorkflowManagement> workflowManagementList) {
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(workflowManagementList);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

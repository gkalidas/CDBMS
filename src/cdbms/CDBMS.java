package cdbms;

import java.io.*;
import java.util.LinkedList;
// import Employee;

public class CDBMS implements Serializable {
    private LinkedList<Employee> Table;

    public CDBMS() {
        System.out.println("CDBMS started successfully.");
        Table = new LinkedList<>();
    }

    // Insert into Employee
    public void InsertIntoTable(String name, int age, String address, int salary) {
        Employee eobj = new Employee(name, age, address, salary);
        Table.add(eobj);
        System.out.println("CDBMS: > New record inserted successfully.");
    }

    // Select * from Employee
    public void SelectStarFrom() {
        System.out.println("------------------------------------------------------------");
        System.out.println("Data from the Employee table:");
        System.out.println("------------------------------------------------------------");
        for (Employee eref : Table) {
            System.out.println(eref);
        }
        System.out.println("------------------------------------------------------------");
    }

    // Backup
    public void TakeBackup() {
        try {
            FileOutputStream fos = new FileOutputStream("CDBMS.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.close();
            fos.close();
            System.out.println("Database stored successfully in secondary storage.");
        } catch (Exception eobj) {
            System.out.println("Exception occurred while taking backup: " + eobj);
        }
    }

    // Restore
    public static CDBMS RestoreBackup(String path) {
        try {
            CDBMS ret = null;
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ret = (CDBMS) ois.readObject();
            ois.close();
            fis.close();
            return ret;
        } catch (Exception eobj) {
            System.out.println("Exception occurred while restoring backup: " + eobj);
            return null;
        }
    }

    // Select by ID
    public void SelectSpecificID(int id) {
        boolean found = false;
        for (Employee eref : Table) {
            if (eref.EmpID == id) {
                found = true;
                System.out.println(eref);
                break;
            }
        }
        if (!found) {
            System.out.println("There is no such record.");
        }
    }

    // Select by Name
    public void SelectSpecificName(String name) {
        boolean found = false;
        for (Employee eref : Table) {
            if (name.equals(eref.EmpName)) {
                found = true;
                System.out.println(eref);
            }
        }
        if (!found) {
            System.out.println("There is no such record.");
        }
    }

    // Delete by ID
    public void DeleteSpecificID(int id) {
        boolean found = false;
        int index = 0;

        for (Employee eref : Table) {
            if (eref.EmpID == id) {
                found = true;
                break;
            }
            index++;
        }
        if (!found) {
            System.out.println("There is no such record.");
        } else {
            Table.remove(index);
            System.out.println("Record deleted successfully.");
        }
    }
}

package cdbms;

import java.util.Scanner;

public class CDBMSApplication {
    public static void main(String[] Args) throws Exception {
        CDBMS mobj = CDBMS.RestoreBackup("CDBMS.ser");

        if (mobj == null) {
            System.out.println("Unable to restore backup. Creating new DBMS instance.");
            mobj = new CDBMS();
        }

        Scanner sobj = new Scanner(System.in);

        int iOption = 0;
        int salary, age, id;
        String name, address;

        System.out.println("------------------------------------------------------------");
        System.out.println("-------- CDBMS ----------");
        System.out.println("------------------------------------------------------------");

        while (iOption != 20) {
            System.out.println("------------------------------------------------------------");
            System.out.println("1: Insert into Employee");
            System.out.println("2: Select * from Employee");
            System.out.println("3: Take a backup of Table");
            System.out.println("4: Select * from Employee where EmpID = ");
            System.out.println("5: Select * from Employee where EmpName = ");
            System.out.println("6: Delete * from Employee where EmpID = ");
            System.out.println("20: Terminate the DBMS");
            System.out.println("------------------------------------------------------------");
            System.out.println("Please select the desired operation on the database.");

            iOption = sobj.nextInt();

            if (iOption == 1) {
                sobj.nextLine(); // consume newline
                System.out.println("Enter the name of the employee:");
                name = sobj.nextLine();
                System.out.println("Enter the age of the employee:");
                age = sobj.nextInt();

                sobj.nextLine(); // consume newline
                System.out.println("Enter the address of the employee:");
                address = sobj.nextLine();
                System.out.println("Enter the salary of the employee:");
                salary = sobj.nextInt();

                mobj.InsertIntoTable(name, age, address, salary);
            } else if (iOption == 2) {
                mobj.SelectStarFrom();
            } else if (iOption == 3) {
                mobj.TakeBackup();
            } else if (iOption == 4) {
                System.out.println("Enter the employee ID: ");
                id = sobj.nextInt();
                mobj.SelectSpecificID(id);
            } else if (iOption == 5) {
                sobj.nextLine(); // consume newline
                System.out.println("Enter the name of Employee: ");
                name = sobj.nextLine();
                mobj.SelectSpecificName(name);
            } else if (iOption == 6) {
                System.out.println("Enter the employee ID: ");
                id = sobj.nextInt();
                mobj.DeleteSpecificID(id);
            } else if (iOption == 20) {
                System.out.println("Thank you for using CDBMS.");
                mobj.TakeBackup();
                mobj = null;
                System.gc();
                break;
            }
        }
        sobj.close();
    }
}

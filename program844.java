import java.util.*;
import java.io.*;

// Serializable is also called as marker interface
// Advanced file io
class Employee implements Serializable{
    public int EmpID;
    public String EmpName;
    public int EmpAge;
    public String EmpAddress;
    public int EmpSalary;

    // TODO - static and unnamed block
    private static int Counter;
    static{
        // System.out.println("Inside static block.");
        Counter = 1;
    }

    public Employee(String b, int c, String d, int e){
        // System.out.println("Inside constuctor.");
        this.EmpID = Counter++;
        this.EmpName = b;
        this.EmpAge = c;
        this.EmpAddress = d;
        this.EmpSalary = e;
    }

    public void DisplayInformation(){
        System.out.println("ID : "+this.EmpID+" Name : "+this.EmpName+" Age : "+this.EmpAge+" Salary : "+this.EmpSalary);
    }

    @Override
    public String toString(){
        return "ID : "+this.EmpID+" Name : "+this.EmpName+" Age : "+this.EmpAge+" Salary : "+this.EmpSalary+ " Address : "+this.EmpAddress;
    }
}

class MarvellousDBMS implements Serializable{
    private LinkedList <Employee> Table;
    public MarvellousDBMS(){
        // constructor is used to allocate resources/memory.
        System.out.println("Marvellous DBMS started successfully.");
        Table = new LinkedList();
    }
    // Insert into Employee values(1,'Amit',21,'Pune',21000)
    public void InsertIntoTable(    String name,
                                    int age,
                                    String address,
                                    int salary){
        Employee eobj = new Employee(name, age, address, salary);
        Table.add(eobj);
        System.out.println("Marvellous DBMS: > New record inserted Successfully.");
    }

    // Select * from Employee
    public void SelectStarFrom(){
        System.out.println("------------------------------------------------------------");
        System.out.println("Data from the Employee table, ");
        System.out.println("------------------------------------------------------------");
        for(Employee eref: Table){
            System.out.println(eref);
        }
        System.out.println("------------------------------------------------------------");
    }

    // Incomplete 
    public void TakeBackup(){
        try{
            FileOutputStream fos = new FileOutputStream("MarvellousDBMS.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.Table);
            oos.close();
            fos.close();
            System.out.println("Database gets successfully stored into secondary storage.");
        }
        catch (Exception eobj){
            System.out.println("Exception occured...");
        }
    }

    // Select * from Employee where Empid = 11
    public void SelectSpecificID(int id){
        boolean found = false;
        for(Employee eref: Table){
            if(eref.EmpID == id){
                found = true;
                System.out.println(eref);
                break;
            }
        }
        if(found == false){
            System.out.println("There is no such record.");
        }
    }
}

class program844{
    public static void main(String Args[]) throws Exception{
        MarvellousDBMS mobj = new MarvellousDBMS();
        Scanner sobj = new Scanner(System.in);

        int iOption = 0;
        int salary = 0;
        int age = 0;
        int id = 0;

        String name = "";
        String address = "";

        System.out.println("------------------------------------------------------------");
        System.out.println("-------- Marvellous DBMS ----------");
        System.out.println("------------------------------------------------------------");
        while(iOption != 20){
            System.out.println("------------------------------------------------------------");
            System.out.println("1: Insert into Employee");
            System.out.println("2: Select * from Employee");
            System.out.println("3: Take a backup of Table");
            System.out.println("4: Select * from Employee where EmpID = ");

            System.out.println("20: Terminate the DBMS");
            System.out.println("------------------------------------------------------------");
            System.out.println("Please select the desired operation on the database.");

            iOption = sobj.nextInt();
            if(iOption ==1 ){
                System.out.println("Please enter the data that you want to enter.");
                
                // This will not skip the \n
                sobj.nextLine();
                System.out.println("Enter the name of the employee.");
                name = sobj.nextLine();
                System.out.println("Enter the age of the employee.");
                age = sobj.nextInt();
                
                // This will not skip the \n
                sobj.nextLine();
                System.out.println("Enter the address of the employee.");
                address = sobj.nextLine();
                System.out.println("Enter the salary of the employee.");
                salary = sobj.nextInt();

                mobj.InsertIntoTable(name, age, address, salary);
            }
            else if(iOption == 2){
                mobj.SelectStarFrom();
            }
            else if(iOption == 3){
                mobj.TakeBackup();
            }
            else if(iOption == 4){
                System.out.println("Enter the employee ID : ");
                id = sobj.nextInt();

                mobj.SelectSpecificID(id);
            }
            else if(iOption == 20){
                System.out.println("Thanks you for using Marvelloius DBMS.");
                mobj = null;
                System.gc();
                break;
            }
        }// End of while
    }   // End of main
}

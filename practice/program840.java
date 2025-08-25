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
        return "ID : "+this.EmpID+" Name : "+this.EmpName+" Age : "+this.EmpAge+" Salary : "+this.EmpSalary;
    }
}

class MarvellousDBMS implements Serializable{
    private LinkedList <Employee> Table;
    public MarvellousDBMS(){
        // constructor is used to allocate resources/memory.
        System.out.println("Marvellous DBMS started successfully.");
        Table = new LinkedList();

    }
}

class program840{
    public static void main(String Args[]) throws Exception{
        MarvellousDBMS mobj = new MarvellousDBMS();
    }
}

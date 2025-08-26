package cdbms;

import java.io.Serializable;

public class Employee implements Serializable {
    public int EmpID;
    public String EmpName;
    public int EmpAge;
    public String EmpAddress;
    public int EmpSalary;

    private static int Counter;

    static {
        Counter = 1;
    }

    public Employee(String name, int age, String address, int salary) {
        this.EmpID = Counter++;
        this.EmpName = name;
        this.EmpAge = age;
        this.EmpAddress = address;
        this.EmpSalary = salary;
    }

    public void DisplayInformation() {
        System.out.println("ID : " + this.EmpID +
                           " Name : " + this.EmpName +
                           " Age : " + this.EmpAge +
                           " Address : " + this.EmpAddress +
                           " Salary : " + this.EmpSalary);
    }

    @Override
    public String toString() {
        return "ID : " + this.EmpID +
               " Name : " + this.EmpName +
               " Age : " + this.EmpAge +
               " Salary : " + this.EmpSalary +
               " Address : " + this.EmpAddress;
    }
}

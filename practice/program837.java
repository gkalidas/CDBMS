import java.util.*;

class Employee{
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
}

class program837{
    public static void main(String Args[]){
        // Create a LinkedList to store Employee data
        LinkedList <Employee> lobj = new LinkedList();

        Employee eobj1 = new Employee("Amit", 23, "Pune", 21000);
        Employee eobj2 = new Employee("Sagar", 23, "Pune", 21000);
        Employee eobj3 = new Employee("Pooja", 23, "Pune", 21000);
        Employee eobj4 = new Employee("Gauri", 23, "Pune", 21000);

        // Add employee 
        lobj.add(eobj1);
        lobj.add(eobj2);
        lobj.add(eobj3);
        lobj.add(eobj4);

        System.out.println(lobj);
    }
}
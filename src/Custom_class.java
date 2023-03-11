class Employee
{
    int id;
    int salary;
    String name;
    public void PrintDetails()
    {
        System.out.print("My id is " + id);
        System.out.println(" and My name is " + name);
//        System.out.println(" and my salary is " + salary);
    }
    public int getSalary()
    {
        return salary;
    }
}

public class Custom_class {
    public static void main(String[] args) {
//        System.out.println("This is our first custom class!!");
        Employee subham = new Employee();//Instantiating a new Employee object
        Employee ranjan = new Employee();//Instantiating a new Employee object
        //Setting Attributes for subham
        subham.id = 56;
        subham.salary = 30;
        subham.name = "Subham Kumar Padhy";
        //Setting Attributes for subham
        ranjan.id = 45;
        ranjan.salary = 23;
        ranjan.name = "Ranjan Kumar sahu";

        //Printing Properties
        subham.PrintDetails();
        ranjan.PrintDetails();
        int salary = ranjan.getSalary();
        System.out.println(salary);;
//        System.out.println(subham.id);
//        System.out.println(subham.name);
    }
}

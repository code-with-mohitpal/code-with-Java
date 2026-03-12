


//single inheritance : single parent and single child relationship

//example : person(name, age, gender) -> employee(id , salary)

//parent class
class Person{
    protected String name; // protected so that child can able to access it
    protected int age;
    protected String gender;

    public void showDetails() // method or behaviour
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Gender : "+gender);
    }
}

//class childClass extends parentClass
class Employee extends Person{
    protected long empId;
    protected String designation;
    protected double salary;

    public void employeeDetails()
    {
        System.out.println("Employee ID : "+empId);
        System.out.println("Employee Designation : "+designation);
        System.out.println("Employee Salary "+salary);
    }
}


class Inheritence{
    public static void main(String args[])
    {
        Employee emp1 = new Employee();
        //attributes of parent Person but we inherit into Employee class
        //so now employee object can able to access all the property of
        
        //Person Class attributes
        emp1.name = "Raj";
        emp1.gender = "M";
        emp1.age = 21;

        //Person Class Method
        emp1.showDetails();

        //Employee class attributes
        emp1.empId = 4231;
        emp1.designation = "SDE1";
        emp1.salary = 300000;

        //employee class method
        emp1.employeeDetails();
    }
}
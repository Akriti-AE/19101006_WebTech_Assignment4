class Employee{
    String Name;
    int Year;
    String Address;
    Employee(String name,int year, String address){
        Name=name;
        Year=year;
        Address=address;
    }
    
    void EmployeeDetails(){
    System.out.println(Name+ "  " +Year + "  " +Address);
    }
}

class Question2{
    public static void main(String args[]){
        System.out.println("Name " + " Year of Joining " + " Address" );
        Employee e1=new Employee("Robert", 1994, "64C-WallsStreet");
        e1.EmployeeDetails();

        Employee e2=new Employee("Sam", 2000, "68D-WallsStreet");
        e2.EmployeeDetails();

        Employee e3=new Employee("John", 2002, "70F-WallsStreet");
        e3.EmployeeDetails();
    }
}
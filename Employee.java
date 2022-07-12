import java.util.Set;

public class Employee {
    //attributes
    private String name;
    double age;
    private double salary;
    Location location;

    //constructor
    Employee(String name, double age, double salary, Location location){
        this.age = age;
        this.location = location;
        this.salary = salary;
        this.name = name;
    }
    //getters
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    //setters
    public void setName(String newName){
        this.name = newName;
    }

    public void setSalary(double newSalary){
        this.salary = newSalary;
    }

    //behaviour

    void salaryIncreament(){
        this.salary = this.salary+100;
        System.out.print(this.salary);
    }
    
}

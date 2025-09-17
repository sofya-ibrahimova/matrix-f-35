public class Employee {
    String name;
    int salary;


    Employee (){
        this.name = "Unknown";
        this.salary = 0;
    }

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    String printInfo (){
        return "Ad: " + this.name + "\nMaas: " + this.salary;
    }
}



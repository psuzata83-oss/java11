

//create an employee class with:
//id
//name 
//salary
//create a parameterized constructor to initilaze all three value.
//create a method displayEmployee()to display the employee information.
//create three employee objects in main().
class Employee{
    int id;
    String name;
    double salary;

    public Employee( int id , String name, double salarly) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayEmployee(){
            System.out.println("Employee id" + id);
            System.out.println("Employee name" + name);
            System.out.println("Employee salary" + salary);

        }
    }
    public class Example   {
        public static void main(String[] args) {
            Employee e1 = new Employee(1,"Gita",3000000);
            e1.displayEmployee();
        }
    }
    

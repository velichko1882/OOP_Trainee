package staff;

import staff.model.entity.Car;
import staff.model.entity.Employee;
import staff.model.entity.Salary;
import staff.model.entity.impl.Driver;
import staff.model.entity.impl.Programmer;
import staff.model.entity.impl.ProjectManager;
import staff.model.entity.impl.Tester;
import staff.model.entity.impl.Cleaner;
import staff.model.enums.Category;
import staff.model.enums.ProgLanguage;
import staff.model.enums.TesterType;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Employee> staff = new ArrayList<Employee>();
        staff.add(new ProjectManager(25,"Jack", "Tomson", 12,
                new Salary(1000, 500), 205, "SalaryApp"));
        staff.add(new Programmer(30, "John", "Smith", 5,
                new Salary(800,200), Category.SENIOR, 52, ProgLanguage.JAVA));
        staff.add(new Tester(58, "Anna", "Belova", 1,
                new Salary(300, 150), Category.JUNIOR, 45, TesterType.FUNCTIONAL));
        staff.add(new Driver(89, "Bob", "Peres", 20,
                new Salary(300, 150), 4, new Car("Toyota Corolla", "AI 5687-3"),0));
        staff.add(new Cleaner(62, "Helen", "Terner", 5,
                new Salary(200, 100), 2, 7));

        for (Employee employee:staff) {
            printEmployee(employee);
        }
        
    }

    private static void printEmployee(Employee employee){
        System.out.println(employee);
        employee.work();
        System.out.println("\tFull month salary = " + employee.getTotalSalary() + "$");
        System.out.println("-----------------------------------------------------------");
    }
}

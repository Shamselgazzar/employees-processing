import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Ahmed", Department.Developer, 75000));
        employees.add(new Employee(2, "Sara", Department.Tester, 65000));
        employees.add(new Employee(3, "Mohammed", Department.HR, 60000));
        employees.add(new Employee(4, "Fatima", Department.DevOps, 80000));
        employees.add(new Employee(5, "Hassan", Department.TechOps, 70000));
        employees.add(new Employee(6, "Layla", Department.Developer, 78000));
        employees.add(new Employee(7, "Youssef", Department.HR, 59000));
        employees.add(new Employee(8, "Nour", Department.Tester, 66000));
        employees.add(new Employee(9, "Amina", Department.DevOps, 82000));
        employees.add(new Employee(10, "Khaled", Department.TechOps, 71000));



        System.out.println();
        List<String> S = EmployeeProcessor.getEmployeeNames(employees);

        System.out.println();
        List<Employee> E = EmployeeProcessor.getEmployeesInDepartment(employees, Department.HR);

        System.out.println();
        int sum = EmployeeProcessor.getSalarySum(employees);

        // expecting user input to be either 0.15 or 15 and the function will still work the same
        System.out.println();
        List<Employee> newSalaries = EmployeeProcessor.getIncrementedSalaries(employees, .15);
        newSalaries.forEach(System.out::println);
    }
}

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeProcessor {

    public static List<Employee> getEmployeesInDepartment(List<Employee> employees, Department department){
        List<Employee> employeesInDepartment;

        employeesInDepartment = employees.stream()
                .filter(employee -> employee.getDepartment().equals(department))
                .collect(Collectors.toList());

        System.out.println("Employees in " + department + ":");
        employeesInDepartment.forEach(System.out::println);

        return employeesInDepartment;
    }

    public static List<String> getEmployeeNames(List<Employee> employees){
        List<String> employeeNames;
        employeeNames = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println("Employee names are:");
        employeeNames.forEach(System.out::println);

        return employeeNames;
    }

    public static int getSalarySum(List<Employee> employees){
        int salarySum;
        salarySum = employees.stream()
                .map(Employee::getSalary)
                .mapToInt(Integer::intValue).sum();

        System.out.println("Employees salary sum equals: "+ salarySum + "$");

        return salarySum;

    }

    public static  List<Employee> getIncrementedSalaries(List<Employee> employees, Double incrementPercentage){
        if(incrementPercentage < 1){ incrementPercentage *= 100;}
        Double percentage = incrementPercentage;

        List<Employee> newSalaries;
        newSalaries = employees.stream()
                .map(employee -> new Employee(
                        employee.getId(),
                        employee.getName(),
                        employee.getDepartment(),
                        (int) (employee.getSalary()*(1+(percentage /100)))
                )).collect(Collectors.toList());

        return newSalaries;
    }
}

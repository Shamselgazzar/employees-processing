public class Employee {
    private final int id;
    private final String name;
    private final Department department;
    private final int salary;

    public Employee(int id, String name, Department department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee {ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary + "}";
    }

}

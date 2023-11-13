import java.util.Objects;

public class Employee {
    private final int id;
    private final String firstNameEmployee;
    private final String middleNameEmployee;
    private final String lastNameEmployee;
    int department;

    private static int count = 1;
    double salaryEmployeeMonth;


    public Employee(String lastNameEmployee, String firstNameEmployee, String middleNameEmployee, int department, double salaryEmployeeMonth) {
        this.id = count++;
        this.lastNameEmployee = lastNameEmployee;
        this.firstNameEmployee = firstNameEmployee;
        this.middleNameEmployee = middleNameEmployee;
        this.department = department;
        this.salaryEmployeeMonth = salaryEmployeeMonth;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalaryEmployeeMonth() {
        return salaryEmployeeMonth;
    }

    public void setSalaryEmployeeMonth(double salaryEmployeeMonth) {
        this.salaryEmployeeMonth = salaryEmployeeMonth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstNameEmployee, employee.firstNameEmployee)
                && Objects.equals(middleNameEmployee, employee.middleNameEmployee)
                && Objects.equals(id, employee.id) && Objects.equals(department, employee.department)
                && Objects.equals(salaryEmployeeMonth, employee.salaryEmployeeMonth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNameEmployee, middleNameEmployee, lastNameEmployee);
    }

    @Override
    public String toString() {
        return id + " Сотрудник: " + lastNameEmployee + " " + firstNameEmployee + " " + middleNameEmployee
                + " " + department + " отдел" + ", зарплата за месяц = " + salaryEmployeeMonth + " рублей";
    }

    public String getNameString(){
        return " Сотрудник: "+ lastNameEmployee + " " + firstNameEmployee + " " + middleNameEmployee;
    }

    public String getPersonalDepartment(){
        return id + " Сотрудник: " + lastNameEmployee + " " + firstNameEmployee + " " + middleNameEmployee
                + " " + ", зарплата за месяц = " + salaryEmployeeMonth + " рублей";
    }
}
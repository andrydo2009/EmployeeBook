import java.util.Arrays;

public class ServiceListEmployee {
    public static void increaseSalaryMonth(Employee[] employeesIncreaseSalary) {
        double increase;
        double indexSalary = 0.1;
        for (Employee employee : employeesIncreaseSalary) {
            if (employee != null) {
                increase = employee.getSalaryEmployeeMonth() + (employee.getSalaryEmployeeMonth() * indexSalary);
                employee.setSalaryEmployeeMonth(increase);
            }
        }
        System.out.println(Arrays.toString(employeesIncreaseSalary));
    }

    public static String searchMinSalaryDepartment(Employee[] employeesMinSalaryDep, int numDepartment) {
        double minSalary = Integer.MAX_VALUE;
        String namePerson=null;
        for (Employee employee : employeesMinSalaryDep) {
            if (employee == null) {
                minSalary=0;
                continue;
            }
            if (employee.getDepartment() == numDepartment && minSalary > employee.getSalaryEmployeeMonth()) {
                minSalary = employee.getSalaryEmployeeMonth();
                namePerson ="Минимальная зарплата в " + numDepartment + " отделе - " + minSalary + " " + employee.getNameString();
            }
        }
        return namePerson;
    }

    public static String searchMaxSalaryDepartment(Employee[] employeesMaxSalaryDep, int numDepartment) {
        double maxSalary = Integer.MIN_VALUE;
        String namePerson=null;
        for (Employee employee : employeesMaxSalaryDep) {
            if (employee == null) {
                maxSalary=0;
               continue ;
            }
            if (employee.getDepartment() == numDepartment && maxSalary < employee.getSalaryEmployeeMonth()) {
                maxSalary = employee.getSalaryEmployeeMonth();
                namePerson ="Масксимальная зарплата в " + numDepartment + " отделе - " + maxSalary +" "+ employee.getNameString();
            }
        }
        return namePerson;
    }

    public static String searchAverageSalaryDepartment(Employee[] employeesAverageSalaryDep, int numDepartment) {
        double averageDepSalary = 0;
        int element = 0;
        String namePerson=null;
        for (Employee employee : employeesAverageSalaryDep) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == numDepartment) {

                element++;
                averageDepSalary += employee.getSalaryEmployeeMonth();
                averageDepSalary/=element;
                namePerson="Средняя зарплата в " + numDepartment + " отделе - " + averageDepSalary;
            }

        }
        return namePerson;
    }
    @SuppressWarnings("UnusedReturnValue")
    public static String searchSumSalaryDepartment(Employee[] employeesSumSalaryDep, int numDepartment) {
        double sumDepSalary = 0;
        String namePerson=null;
        for (Employee employee : employeesSumSalaryDep) {
            if (employee == null) {
                sumDepSalary =0;
                continue;
            }
            if (employee.getDepartment() == numDepartment) {
                sumDepSalary += employee.getSalaryEmployeeMonth();
                namePerson="Сумма затрат на зарплаты в " + numDepartment + " отделе - " + sumDepSalary;
            }
        }
        return namePerson;
    }

    public static void increaseSalaryDepartmentMonth(Employee[] employeesIncreaseSalaryDepartment,int numDepartment,double indexSalary) {
        double index=indexSalary/100;
        double increase;
        for (Employee employee : employeesIncreaseSalaryDepartment) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == numDepartment) {
                increase = employee.getSalaryEmployeeMonth() + (employee.getSalaryEmployeeMonth() * index);
                employee.setSalaryEmployeeMonth(increase);
            }
        }
        System.out.println(Arrays.toString(employeesIncreaseSalaryDepartment));
    }

    public static void printAllPersonalDepartment(Employee[] employeesPersonalDepartment, int numDepartment) {
        for (Employee employee : employeesPersonalDepartment) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == numDepartment) {
                System.out.println(employee.getPersonalDepartment());
            }
        }
    }

    public static void searchLessThatNumber(Employee[] searchLessNumber, int number ) {
        System.out.println("Сотрудники с зарплатой меньше " + number + " : ");
        for (Employee employee : searchLessNumber) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalaryEmployeeMonth() < number) {
                System.out.println(employee.getPersonalDepartment());
            }
        }
    }

    public static void searchMoreThatNumber(Employee[] searchMoreNumber, int number ) {
        System.out.println("Сотрудники с зарплатой больше " + number + " : ");
        for (Employee employee : searchMoreNumber) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalaryEmployeeMonth() > number) {
                System.out.println(employee.getPersonalDepartment());
            }
        }
    }
}


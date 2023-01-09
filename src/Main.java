import java.util.Arrays;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        Employee[] listEmployee=new Employee[10];

        listEmployee[0]  =
                new Employee("Адамович", "Татьяна", "Владимировна",
                        1, 15_000);
        listEmployee[1] =
                new Employee("Айду", "Эдуард", "Альфред-Иоханесович",
                        1, 35_000);
        //      listEmployee[0]  = null;

        //      listEmployee[1]  = null;

        listEmployee[2] =
                new Employee("Акопян", "Арсений", "Владимирович",
                        2, 41_000);
        listEmployee[3] =
                new Employee("Алексеевский", " Дмитрий", "Владимирович",
                        2, 32_000);
        listEmployee[4] =
                new Employee("Курочкин", "Сергей", "Сергеевич",
                        3, 36_500);
        listEmployee[5] =
                new Employee("Алёшин", "Владимир", "Владимирович",
                        3, 78_388);
        listEmployee[6] =
                new Employee("Дяченко", "Арсений", "Вениаминович",
                        4, 12_400);
        listEmployee[7] =
                new Employee("Цинц", "Павел", "Петрович",
                        4, 28_506);
        listEmployee[8] =
                new Employee("Гершгорин ", "Роман ", "Александрович",
                        5, 44_555);
        listEmployee[9] =
                new Employee("Кановей", "Владимир", "Григорьевич",
                        5, 43_336);




        System.out.println(Arrays.toString(listEmployee));
        listEmployee[6].setDepartment(4);
        System.out.println(Arrays.toString(listEmployee));
        ServiceListEmployee.increaseSalaryMonth(listEmployee);
        System.out.println(ServiceListEmployee.searchMinSalaryDepartment(listEmployee,1));
        System.out.println(ServiceListEmployee.searchMaxSalaryDepartment(listEmployee,1));
        System.out.println(ServiceListEmployee.searchAverageSalaryDepartment(listEmployee,1));
        ServiceListEmployee.searchSumSalaryDepartment(listEmployee,1);
        ServiceListEmployee.increaseSalaryDepartmentMonth(listEmployee,1,50);
        ServiceListEmployee.printAllPersonalDepartment(listEmployee,1);
        ServiceListEmployee.searchLessThatNumber(listEmployee,45_000);
        ServiceListEmployee.searchMoreThatNumber(listEmployee,50_000);



    }
}

// THE END
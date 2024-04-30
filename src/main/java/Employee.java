import lombok.Data;

import java.time.LocalDate;

/**
 * Класс сотрудника
 */
@Data
public class Employee {
    public String name;
    public int age;
    public int salary;

    /**
     * Метод, который поднимает зарплату при выполнении условий в методе salary_increase
     * @param employee - сотрудник
     */
    public void upSalary(Employee employee){
        employee.salary += 1000;
    }

    LocalDate firstDate = LocalDate.of(2019, 8, 10);
    LocalDate secondDate = LocalDate.of(2019, 7, 1);

    /**
     * Метод для сравнения дат
     * @param firstDate
     * @param secondDate
     * @return
     */
    public void compareDatas(LocalDate firstDate, LocalDate secondDate){
        if(firstDate.isBefore(secondDate)){
            System.out.println(secondDate + " is earlier than " + firstDate);
        }
        System.out.println(firstDate + " is earlier than " + secondDate);
    }
}

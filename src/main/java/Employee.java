import lombok.Data;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * Класс сотрудника
 */
@Data
public class Employee {
    public String name;
    public int age;
    public int salary;
    private final Gender gender;



    /**
     * Метод, который поднимает зарплату при выполнении условий в методе raiseSalaries
     * @param percent - процентБ на который повышаем зарплату
     */
    public void raiseSalary(double percent) {
        this.salary *= (int) (1 + percent / 100);
    }

    LocalDate firstDate = LocalDate.of(2019, 8, 10);
    LocalDate secondDate = LocalDate.of(2019, 7, 1);

    /**
     * Метод для сравнения дат
     * @param firstDate
     * @param secondDate
     */
    public void compareDates(LocalDate firstDate, LocalDate secondDate){
        if(firstDate.isBefore(secondDate)){
            System.out.println(secondDate + " is earlier than " + firstDate);
        }
        System.out.println(firstDate + " is earlier than " + secondDate);
    }

}

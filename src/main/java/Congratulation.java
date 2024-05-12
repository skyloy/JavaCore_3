import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Congratulation {
    /**
     * Метод, поздравляющий сотрудников с праздниками
     *
     * @param employees - массив сотрудников
     * @return
     */
    public boolean congratulate(Employee[] employees){
        List<Employee> employeeList = Arrays.asList(employees);
        boolean flag = true;
        for(Employee employee : employeeList){
            if(LocalDate.now().isEqual(LocalDate.parse("2024-01-01"))){
                System.out.println(Holidays.NewYear.getCongratulation());
                return flag;
            }
            if(LocalDate.now().isEqual(LocalDate.parse("2024-01-01"))){
                if (employee.getGender().equals(Gender.FEMALE)){
                    System.out.println(Holidays.March8.getCongratulation());
                    return flag;
                }
            }
            if(LocalDate.now().isEqual(LocalDate.parse("2024-02-23"))){
                if (employee.getGender().equals(Gender.MALE)){
                    System.out.println(Holidays.February23.getCongratulation());
                    return flag;
                }
            }
        }
        System.out.println(Holidays.NoHoliday.getCongratulation());
        return flag = false;
    }
}

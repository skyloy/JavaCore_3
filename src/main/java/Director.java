/**
 * Класс руководителя. Наследник класса сотрудника.
 */
public class Director extends Employee{
    /**
     * Метод повышения зарплаты
     * @param array массив сотрудников
     */
    static void salary_increase(Employee[] array){
        for (Employee employee : array) {
            if (!(employee instanceof Director)) {
                employee.upSalary(employee);
            }
        }
    }
}

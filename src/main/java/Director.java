/**
 * Класс руководителя. Наследник класса сотрудника.
 */
public class Director extends Employee{
    public Director(Gender gender) {
        super(gender);
    }

    /**
     * Метод повышения зарплаты
     * @param employees массив сотрудников
     * @param percent процент, на который повышаем зарплату сотрудника
     */
    public static void raiseSalaries(Employee[] employees, double percent) {
        for (Employee employee : employees) {
            if (!(employee instanceof Director)) {
                employee.raiseSalary(percent);
            }
        }
    }
}

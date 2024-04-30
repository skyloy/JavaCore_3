// 1. Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты,
//    представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.

// 2. Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты в класс руководителя,
//    модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей.
//    В основной программе создайте руководителя и поместите его в общий массив сотрудников.
//    Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Director director = new Director();
        Employee[] employees = {employee1,director,employee2};
        Director.salary_increase(employees);

        System.out.println(employee1.getSalary());
        System.out.println(employee2.getSalary());
        System.out.println(director.getSalary());
    }
}

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(Gender.MALE);
        Employee employee2 = new Employee(Gender.FEMALE);
        Employee employee3 = new Employee(Gender.FEMALE);
        Employee employee4 = new Employee(Gender.MALE);
        Employee employee5 = new Employee(Gender.FEMALE);

        Director director1 = new Director(Gender.MALE);
        Director director2 = new Director(Gender.FEMALE);

        Employee[] employees = {employee1,employee2,employee3,employee4,employee5, director1, director2};

        Congratulation congratulation = new Congratulation();
        System.out.println(congratulation.congratulate(employees));
    }

}

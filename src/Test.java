import com.test.Manager;
import com.test.Salary;
import com.test.Worker;

public class Test {

    public static void main(String[] args) {

        Worker worker = new Worker("Sergey", 30, 'M', 10000);
        System.out.println("Worker's salary: $" + worker.getSalary());

        Manager manager = new Manager("Anna", 30, 'F', 10000, 10);
        System.out.println("Manager's salary: $" + manager.getSalary());

        System.out.println(Salary.getSum(new Worker[]{ worker, manager}));

    }
}

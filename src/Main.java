import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(40, "Архитектур", "Ерлан"));
        employees.add(new Employee(24, "Официант", "Марсель"));
        employees.add(new Employee(-12, "Безработный", "Майкл"));
        employees.add(new Employee(0, "Сад пред", "Бека"));
        employees.add(new Employee(20, "Менеджер по продажам", "Олег"));


        Exception myException = new myException("Ошибка в возрасте");

        try {
           for (Employee employee : employees){
               if (employee.getAge() <= 0 ){
                   throw  myException;
               }
           }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Все");
//            exit();
        }




    }
}
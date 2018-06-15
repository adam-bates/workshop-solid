pacakge com.solid._1_single_responsibility;

public class Test {
  
    public static void main(String[] args) {
        EmployeeEmailer emailer = new EmployeeEmailer();

        Employee employee = new Employee(1L, "John", "Smith", "jsmith@example.com");    
        emailer.send(employee);
    }
}

pacakge com.solid._1_single_responsibility;

public class Test {
  
    public static void main(String[] args) {
        Emailer emailer = new Emailer();

        Employee employee = new Employee(1L, "John", "Smith", "jsmith@example.com");    
        emailer.send(employee);
    }
}

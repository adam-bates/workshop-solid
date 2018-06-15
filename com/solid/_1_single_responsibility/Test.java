pacakge com.solid._1_single_responsibility;

public class Test {
  
    public static void main(String[] args) {
        Emailer emailer = new Emailer();

        Employee employee = new Employee(101L, "John", "Smith", "jsmith@example.com");
        if (employee.save())
            emailer.send(employee);

        Customer customer = new Customer(201L, "Jane", "Doe", "jane@janedoe.ca");
        if (customer.save())
            emailer.send(customer);
    }
}

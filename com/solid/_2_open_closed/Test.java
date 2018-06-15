package com.solid._2_open_closed;

public class Test {
  
    public static void main(String[] args) {
      
        Emailer<Employee> empEmailer = new EmployeeEmailer();
        Emailer<Customer> custEmailer = new CustomerEmailer();

        Employee employee = new Employee(101L, "John", "Smith", "jsmith@example.com");
        if (employee.save())
            empEmailer.sendTo(employee);

        Customer customer = new Customer(201L, "Jane", "Doe", "jane@janedoe.ca");
        if (customer.save())
            custEmailer.sendTo(customer);
        
        try {
            new Config().save();
        } catch (UnsupportedOperationException e) {
            System.out.println("Config cannot be saved");
        }
    }
}

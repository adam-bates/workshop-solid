package com.solid._5_dependency_inversion;

public class Test {
  
    public static void main(String[] args) {

        EmailService emailService = new AwesomeEmailService();
        Emailer<Employee> empEmailer = new EmployeeEmailer(emailService);
        Emailer<Customer> custEmailer = new CustomerEmailer(emailService);

        Employee employee = new Employee(101L, "John", "Smith", "jsmith@example.com");
        if (employee.save())
            empEmailer.sendTo(employee.refresh());

        Customer customer = new Customer(201L, "Jane", "Doe", "jane@janedoe.ca");
        if (customer.save())
            custEmailer.sendTo(customer.refresh());
    }
}

package com.solid._5_dependency_inversion;

public class Test {
  
    public static void main(String[] args) {
        Emailer<Employee> emailer = new EmployeeEmailer(new AwesomeEmailService());

        Employee employee = new Employee(1L, "John", "Smith", "jsmith@example.com");
        emailer.send(employee);
    }
}

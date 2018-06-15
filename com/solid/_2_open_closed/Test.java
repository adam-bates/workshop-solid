package com.solid._2_open_closed;

public class Test {
  
    public static void main(String[] args) {
        Emailer<Employee> emailer = new EmployeeEmailer();

        Employee employee = new Employee(1L, "John", "Smith", "jsmith@example.com");    
        emailer.send(employee);
    }
}

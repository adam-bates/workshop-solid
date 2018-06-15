package com.solid._4_interface_segregation;

public class Test {
  
    public static void main(String[] args) {
        Emailer<Employee> empEmailer = new EmployeeEmailer();
        Emailer<Customer> custEmailer = new CustomerEmailer();

        Employee employee = new Employee(101L, "John", "Smith", "jsmith@example.com");
        if (employee.save())
            empEmailer.sendTo(employee.refresh());

        Customer customer = new Customer(201L, "Jane", "Doe", "jane@janedoe.ca");
        if (customer.save())
            custEmailer.sendTo(customer.refresh());
      
        GUIObject guiObject = new GUIObject();
        for (int i = 0; i < 10; i++) guiObject.refresh();
    }
}

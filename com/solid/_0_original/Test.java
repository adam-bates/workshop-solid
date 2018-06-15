package com.solid._0_original;

public class Test {

    public static void main(String[] args) {

        Employee employee = new Employee(101L, "John", "Smith", "jsmith@example.com");
        if (employee.save())
            employee.sendEmail();

        Customer customer = new Customer(201L, "Jane", "Doe", "jane@janedoe.ca");
        if (customer.save())
            customer.sendEmail();
    }
}

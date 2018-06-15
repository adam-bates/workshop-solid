package com.solid._3_liskov_substitution;

class Test {

    public static void main(String[] args) {

        Employee employee = new Employee(101L, "John", "Smith", "jsmith@example.com");
        employee.save().refresh();

        Customer customer = new Customer(201L, "Jane", "Doe", "jane@janedoe.ca");
        customer.save().refresh();
      
        new Config(); // No more save method available!
    }
}

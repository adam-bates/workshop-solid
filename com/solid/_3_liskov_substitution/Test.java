package com.solid._3_liskov_substitution;

class Test {

    public static void main(String[] args) {
        Emailer<Employee> emailer = new EmployeeEmailer();

        Employee employee = new Employee(1L, "John", "Smith", "jsmith@example.com");
        emailer.send(employee);
    }
}

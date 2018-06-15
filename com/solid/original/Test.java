package com.solid.original;

public class Test {

    public static void main(String[] args) {
        Employee employee = new Employee(1L, "Adam", "Bates", "adam@adambates.ca");
        employee.sendEmail();
    }
}

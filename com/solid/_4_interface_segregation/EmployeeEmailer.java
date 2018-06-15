package com.solid._4_interface_segregation;

class EmployeeEmailer implements Emailer <Employee> {
    
    public void send(Employee employee) {
        System.out.println(String.format("Sending employee email to %s %s (%s) ...",
            employee.getFirstName(), employee.getLastName(), employee.getEmailAddress()));
    }
}

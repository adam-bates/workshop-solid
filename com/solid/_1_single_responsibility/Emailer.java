package com.solid._1_single_responsibility;

class EmployeeEmailer {
    
    public void send(Employee employee) {
        // send email to employee
        System.out.println(String.format("Sending email to %s %s (%s) ...",
            employee.getFirstName(), employee.getLastName(), employee.getEmailAddress()));
    }
}

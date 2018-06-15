package com.solid._2_open_closed;

class EmployeeEmailer implements Emailer <Employee> {
    
    public void send(Employee employee) {
        emailService.sendEmail(
            employee.getEmailAddress(),
            String.format("%s %s", employee.getFirstName(), employee.getLastName()),
            String.format("%s,\nWe wanted to say thanks for all of the hard work you do for our company!", employee.getFirstName())
        );
    }
}

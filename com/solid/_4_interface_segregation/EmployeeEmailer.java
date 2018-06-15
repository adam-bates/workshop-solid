package com.solid._4_interface_segregation;

class EmployeeEmailer implements Emailer <Employee> {
  
    private EmailService emailService;
    
    public EmployeeEmailer() {
        emailService = new AwesomeEmailService();
    }
  
    public void send(Employee employee) {
        emailService.sendEmail(
            employee.getEmailAddress(),
            String.format("%s %s", employee.getFirstName(), employee.getLastName()),
            String.format("%s,\nWe wanted to say thanks for all of the hard work you do for our company!", employee.getFirstName())
        );
    }
}

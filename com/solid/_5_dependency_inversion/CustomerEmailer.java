package com.solid._5_dependency_inversion;

class CustomerEmailer implements Emailer <Customer> {
  
    private EmailService emailService;
  
    public CustomerEmailer(EmailService emailService) {
        this.emailService = emailService;
    }
  
    public void sendTo(Customer customer) {
        emailService.sendEmail(
            customer.getEmailAddress(),
            String.format("Hello, %s %s!", customer.getFirstName(), customer.getLastName()),
            String.format("%s,\nThanks for being a loyal customer!", customer.getFirstName())
        );
    }
}

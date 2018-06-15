package com.solid._4_interface_segregation;

class CustomerEmailer implements Emailer <Customer> {
  
    private EmailService emailService;
    
    public CustomerEmailer() {
        emailService = new AwesomeEmailService();
    }
  
    public void send(Customer customer) {
        emailService.sendEmail(
            customer.getEmailAddress(),
            String.format("Hello, %s %s!", customer.getFirstName(), customer.getLastName()),
            String.format("%s,\nThanks for being a loyal customer!", customer.getFirstName())
        );
    }
}

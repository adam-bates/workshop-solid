package com.solid._2_open_closed;

class CustomerEmailer implements Emailer <Customer> {
  
    private AwesomeEmailService emailService;
    
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

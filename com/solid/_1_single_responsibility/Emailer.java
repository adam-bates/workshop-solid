package com.solid._1_single_responsibility;

class Emailer {
    
    private AwesomeEmailService emailService;
    
    public Emailer() {
        emailService = new AwesomeEmailService();
    }
    
    public void send(Emailable emailable) {
        if (emailable instanceof Employee)
            emailService.sendEmail(
                emailable.getEmailAddress(),
                String.format("%s %s", emailable.getFirstName(), emailable.getLastName()),
                String.format("%s,\nWe wanted to say thanks for all of the hard work you do for our company!", emailable.getFirstName())
            );
      
        else if (emailable instanceof Customer)
            emailService.sendEmail(
                emailable.getEmailAddress(),
                String.format("Hello, %s %s!", emailable.getFirstName(), emailable.getLastName()),
                String.format("%s,\nThanks for being a loyal customer!", emailable.getFirstName())
            );
      
        else throw new IllegalArgumentException();
    }
}

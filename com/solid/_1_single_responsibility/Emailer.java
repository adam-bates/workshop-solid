package com.solid._1_single_responsibility;

class Emailer {
    
    public void send(Emailable emailable) {
        if (emailable instanceof Employee)
            System.out.println(String.format("Sending employee email to %s %s (%s) ...",
                emailable.getFirstName(), emailable.getLastName(), emailable.getEmailAddress()));
      
        else if (emailable instanceof Customer)
            System.out.println(String.format("Sending customer email to %s %s (%s) ...",
                emailable.getFirstName(), emailable.getLastName(), emailable.getEmailAddress()));
      
        else System.out.println(String.format("Sending generic email to %s %s (%s) ...",
            emailable.getFirstName(), emailable.getLastName(), emailable.getEmailAddress()));
    }
}

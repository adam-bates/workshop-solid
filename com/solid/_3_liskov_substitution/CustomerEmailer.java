package com.solid._3_liskov_substitution;

class CustomerEmailer implements Emailer <Customer> {
  
    public void send(Customer customer) {
        System.out.println(String.format("Sending customer email to %s %s (%s) ...",
            customer.getFirstName(), customer.getLastName(), customer.getEmailAddress()));
    }
}

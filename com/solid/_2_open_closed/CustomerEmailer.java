package com.solid._2_open_closed;

class CustomerEmailer implements Emailer <Customer> {
  
    public void send(Customer customer) {
        System.out.println(String.format("Sending customer email to %s %s (%s) ...",
            customer.getFirstName(), customer.getLastName(), customer.getEmailAddress()));
    }
}

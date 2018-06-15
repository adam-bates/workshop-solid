package com.solid._4_interface_segregation;

class AwesomeEmailService implements EmailService {

    public void sendEmail(String address, String subject, String message) {
        // send email
        System.out.printf("Sending email to %s... \nSubject: %s\nMessage: %s\n\n", address, subject, message);
    }
}

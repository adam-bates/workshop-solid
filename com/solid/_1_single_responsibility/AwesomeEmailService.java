package com.solid._1_single_responsibility;

class AwesomeEmailService {
    public void sendEmail(String address, String subject, String message) {
        // send email
        System.out.printf("Sending email to %s... \nSubject: %s\nMessage: %s", address, subject, message);
    }
}

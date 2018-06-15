package com.solid._5_dependency_inversion;

class AwesomeEmailService implements EmailService {
    public void sendEmail(String address, String subject, String message) {
        // send email
        System.out.printf("Sending email to %s... \nSubject: %s\nMessage: %s", address, subject, message);
    }
}

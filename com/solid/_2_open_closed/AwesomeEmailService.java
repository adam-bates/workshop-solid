package com.solid._2_open_closed;

class AwesomeEmailService {

    public void sendEmail(String address, String subject, String message) {
        System.out.printf("Sending email to %s... \nSubject: %s\nMessage: %s\n\n", address, subject, message);
        // send email
    }
}

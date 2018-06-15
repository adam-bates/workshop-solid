package com.solid._5_dependency_inversion;

interface EmailService {
    void sendEmail(String address, String subject, String message);
}

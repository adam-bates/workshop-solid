package com.solid._4_interface_segregation;

interface Emailer <T extends Emailable> {
    void sendTo(T emailable);
}

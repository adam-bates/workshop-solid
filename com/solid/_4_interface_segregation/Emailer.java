package com.solid._4_interface_segregation;

interface Emailer <T extends Emailable> {
    void send(T emailable);
}

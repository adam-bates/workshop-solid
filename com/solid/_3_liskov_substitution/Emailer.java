package com.solid._3_liskov_substitution;

interface Emailer <T extends Emailable> {
    void send(T emailable);
}

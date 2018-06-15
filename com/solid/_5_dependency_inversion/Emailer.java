package com.solid._5_dependency_inversion;

interface Emailer <T extends Emailable> {
    void send(T emailable);
}

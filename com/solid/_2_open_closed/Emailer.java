package com.solid._2_open_closed;

interface Emailer <T extends Emailable> {
    void send(T emailable);
}

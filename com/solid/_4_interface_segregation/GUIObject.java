package com.solid._4_interface_segregation;

class GUIObject implements Refreshable <GUIObject> {

    public GUIObject refresh() {
        System.out.println("Refershing GUI object...");
        // refresh GUI object
        return this;
    }
}

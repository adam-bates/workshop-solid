package com.solid._4_interface_segregation;

class GUIObject implements Refreshable <GUIObject> {

    public GUIObject refresh() {
        // refresh
        return this;
    }
}

package com.solid.original;

class Employee {

    // attributes
    private long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    
    // constructor
    public Employee(long id, String firstName, String lastName, String emailAddress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    // accessors
    public long getId() { return this.id; }
    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    
    // mutators
    public void setId(long id) { this.id = id; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public void sendEmail() {
        // send email to employee
        System.out.println(String.format("Sending email to %s %s (%s) ...", firstName, lastName, emailAddress));
    }
}

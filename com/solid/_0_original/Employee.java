package com.solid._0_original;

class Employee implements Emailable {

    // attributes
    private long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    
    // constructor
    public Employee(long id, String firstName, String lastName, String emailAddress) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setEmailAddress(emailAddress);
    }

    // accessors
    public long getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmailAddress() { return emailAddress; }
    
    // mutators
    public void setId(long id) { this.id = id; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }
  
    public boolean save() {
        // Save employee to db
        return true;
    }

    public void sendEmail() {
        // send email to employee
        System.out.println(String.format("Sending employee email to %s %s (%s) ...", firstName, lastName, emailAddress));
    }
}

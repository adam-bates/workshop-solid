package com.solid._5_dependency_inversion;

class Customer extends DBModel <Customer> implements Emailable {

    // attributes
    private long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    
    // constructor
    public Customer(long id, String firstName, String lastName, String emailAddress) {
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
        System.out.println("Saving customer to db...\n");
        // save customer to db
        return true;
    }
    
    public Customer refresh() {
        System.out.println("Refreshing customer from db...\n");
        // refresh customer
        return this;
    }
}

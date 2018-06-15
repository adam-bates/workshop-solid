package com.solid._0_original;

class Customer extends Model implements Emailable {
    
    private AwesomeEmailService emailService;

    // attributes
    private long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    
    // constructor
    public Customer(long id, String firstName, String lastName, String emailAddress) {
        emailService = new AwesomeEmailService();
        
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
        // Save customer to db
        return true;
    }
    
    public void sendEmail() {
        emailService.sendEmail(
            customer.getEmailAddress(),
            String.format("Hello, %s %s!", customer.getFirstName(), customer.getLastName()),
            String.format("%s,\nThanks for being a loyal customer!", customer.getFirstName())
        );
    }
}

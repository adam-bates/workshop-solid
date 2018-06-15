package com.solid._0_original;

class Employee extends Model implements Emailable {
    
    private AwesomeEmailService emailService;

    // attributes
    private long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    
    // constructor
    public Employee(long id, String firstName, String lastName, String emailAddress) {
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
        System.out.println("Saving employee to db...\n");
        // save employee to db
        return true;
    }

    public void sendEmail() {
        emailService.sendEmail(
            emailAddress,
            String.format("%s %s", firstName, lastName),
            String.format("%s,\nWe wanted to say thanks for all of the hard work you do for our company!", firstName)
        );
    }
}

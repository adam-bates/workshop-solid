package com.solid._4_interface_segregation;

final class Config extends Model {

    private final String url;
    private final String token;
    private final int port;
    
    public Config() {
    
        // load config values from env...
        
        // ... until then, stub values
        this.url = "example.com";
        this.token = "abc123";
        this.port = 1234;
    }
    
    public String getUrl() { return url; }
    public String getToken() { return token; }
    public int getPort() { return port; }
}

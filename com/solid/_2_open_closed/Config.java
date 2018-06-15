package com.solid._2_open_closed;

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
    
    // Config values shouldn't be saved from application
    public boolean save() {
        throw new UnsupportedOperationException();
    }
}

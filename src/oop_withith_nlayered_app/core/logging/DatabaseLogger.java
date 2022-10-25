package oop_withith_nlayered_app.core.logging;

public class DatabaseLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Data Logged to Database: " + data);
    }
    
}

package oop_with_nlayered_app.core.logging;

public class FileLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Data Logged to File: " + data);
    }
    
}

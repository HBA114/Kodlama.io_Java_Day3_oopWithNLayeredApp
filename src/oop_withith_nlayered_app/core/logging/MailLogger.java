package oop_withith_nlayered_app.core.logging;

public class MailLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Log sent with Mail: " + data);
    }
    
}

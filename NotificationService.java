package w4;

import java.util.regex.Pattern;

public class NotificationService {

    public boolean sendEmail(String email, String message) {
        if (isValidEmail(email) && message != null && !message.trim().isEmpty()) {
            System.out.println("Email sent to: " + email + " with message: " + message);
            return true;
        }
        return false;
    }

    private boolean isValidEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }
}


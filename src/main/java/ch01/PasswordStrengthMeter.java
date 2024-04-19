package ch01;

import static ch01.PasswordStrength.*;

public class PasswordStrengthMeter {
    public PasswordStrength meter(String password) {
        if(password.length() < 8)
            return NORMAL;
        return STRONG;
    }
}

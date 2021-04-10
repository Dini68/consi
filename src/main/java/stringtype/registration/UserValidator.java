package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername(String username) {
        return !username.isBlank();
    }
    public boolean isValidPassword(String password1, String password2) {
        return password1.length() > 7 && password2.length() > 7 && password1.equals(password2);
    }
    public boolean isValidEmail(String email) {
        return email.charAt(0) != '@' && email.contains("@") && email.contains(".") &&
               email.charAt(email.length()-1) != '.' && email.indexOf('@') + 1 < email.indexOf('.');
    }

}

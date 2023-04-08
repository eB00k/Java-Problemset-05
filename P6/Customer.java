//PS06-Q1-AB: Problem-03 Customer Class
import java.security.SecureRandom;

public class Customer {
    private String firstName;
    private String lastName;
    private String address;
    private String cardNumber;
    private int pin;
    private String username;
    private String password;


    public Customer(String firstName, String lastName, String address, String cardNumber, int pin, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.username = username;
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            this.password = "DefaultPassword@20";
        }
    }

    public Customer(String firstName, String lastName, String address, String cardNumber, int pin, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.username = username;
        this.password = generatePassword();
    }

    public boolean isValidPassword(String password) {
        if (password.length() < 8 || password.length() > 20) {
            return false;
        }
        boolean hasDigit = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasSpecialSymbol = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (c == '@' || c == '#' || c == '$' || c == '%') {
                hasSpecialSymbol = true;
            }
        }
        return hasDigit && hasLowerCase && hasUpperCase && hasSpecialSymbol;
    }

    public String generatePassword() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            int randomIndex = random.nextInt(chars.length());
            char randomChar = chars.charAt(randomIndex);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            this.password = "DastanAkatov$121003";
        }
    }

    @Override
    public String toString() {
        return "Customer [firstName='" + firstName + "', lastName='" + lastName + "', cardNumber='" + cardNumber + "', pin='" + pin + "', username='" + username + "', password='" + password + "', address='" + address + "']";
    }
}
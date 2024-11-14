public class Passwords {

    public static boolean validatePassword(String password) {
        // Check length requirement
        if (password.length() < 8 || password.length() > 16) {
            return false;
        }

        // Define regular expressions for each character category
        String lowerCasePattern = ".*[a-z].*";
        String upperCasePattern = ".*[A-Z].*";
        String numberPattern = ".*[0-9].*";
        String specialCharacterPattern = ".*[~!@#$%^&*()\\-=+_].*";

        // Check if the password matches each category
        int categoryCount = 0;
        if (password.matches(lowerCasePattern)) categoryCount++;
        if (password.matches(upperCasePattern)) categoryCount++;
        if (password.matches(numberPattern)) categoryCount++;
        if (password.matches(specialCharacterPattern)) categoryCount++;

        // Ensure at least three out of the four categories are present
        return categoryCount >= 3;
    }

}
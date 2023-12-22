
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Users {
    int userLoginChoice;
    String userType;
    Scanner scanner = new Scanner(System.in);
    int defaultPassword = 1234;
    private Map<String, String> userCredentials; // Stores usernames and passwords
    public Users() {
        userCredentials = new HashMap<>();
    }


    public String login() {
        // Default password
        int defaultPassword = 1234;
        int defaultPasswordEntry;
        String defaultPasswordEntered = "incorrect";
        //Variable to register users new password
        int newPasswordEntryOne;
        int newPasswordEntryTwo;
        //new password
        int newPassword;

        // Admin login method
        while (true) {
            if (defaultPasswordEntered.equals("incorrect")){
                try {
                    System.out.println("Login as Admin | Please enter password:");
                    defaultPasswordEntry = scanner.nextInt();
                    if (defaultPasswordEntry == defaultPassword) {
                        defaultPasswordEntered = "correct";
                        System.out.println("Thank You! Please create new password.");
                    } else {
                        System.out.println("Incorrect password! Please try again");
                    }
                } catch (Exception e) {
                    System.out.println("Error: Input is not an number.");
                    scanner.next(); // Consume the invalid input
                }
            }
            if (defaultPasswordEntered.equals("correct")){
                try {
                    System.out.println("Enter a NEW PASSWORD with at least one or more digits:");
                    newPasswordEntryOne = scanner.nextInt();
                    System.out.println("Please re-enter NEW PASSWORD:");
                    newPasswordEntryTwo = scanner.nextInt();

                    if (newPasswordEntryOne == newPasswordEntryTwo) {
                        //assign new password to be stored in a variable for future logging-ins
                        newPassword = newPasswordEntryTwo;
                        System.out.println("New password created. You are now logged in!");
                        return "admin";
                    } else {
                        System.out.print("Sorry your passwords did not match, please try again!");
                    }

                } catch (Exception e) {
                    System.out.println("Error: Input is not an number.");
                    scanner.next(); // Consume the invalid input
                }
            }
        }
    }
    public void createUserAccount() {
        System.out.println("Enter a username:");
        String newUsername = scanner.next();

        if (userCredentials.containsKey(newUsername)) {
            System.out.println("Username already exists. Please choose another one.");
            return;
        }

        System.out.println("Enter a password for the new account:");
        String newPassword = scanner.next();

        userCredentials.put(newUsername, newPassword);
        System.out.println("Account created successfully!");
    }

    public void deleteUserAccount() {
        System.out.println("Enter your username:");
        String usernameToDelete = scanner.next();

        if (!userCredentials.containsKey(usernameToDelete)) {
            System.out.println("Username not found.");
            return;
        }

        System.out.println("Enter your password:");
        String passwordToDelete = scanner.next();

        String storedPassword = userCredentials.get(usernameToDelete);
        if (passwordToDelete.equals(storedPassword)) {
            userCredentials.remove(usernameToDelete);
            System.out.println("Account deleted successfully!");
        } else {
            System.out.println("Incorrect password. Account deletion failed.");
        }
    }
}
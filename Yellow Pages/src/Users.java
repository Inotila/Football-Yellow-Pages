import java.util.Scanner;

public class Users {
    int userLoginChoice;
    String userType;
    Scanner scanner = new Scanner(System.in);
    int defaultPassword = 1234;
    public String userStatus() {
        while (true) {
            // have user choose there status
            System.out.println("If you are a guest enter: 1 | If you are an admin enter: 2");
            int userLoginChoice = scanner.nextInt();

            if (userLoginChoice == 1 || userLoginChoice == 2) {
                if (userLoginChoice == 2) {
                    return userType = login();
                } else  {
                    return userType = "Guest user";
                }
            } else {
                System.out.print("You selected " + userLoginChoice + " : invalid entry! please try again" + "\n");
            }
        }
    }

    private String login() {
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
}
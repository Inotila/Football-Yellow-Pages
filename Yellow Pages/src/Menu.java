import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    int userMenuChoice;
    String userRole;

    private String[] getMenu(String userRole) {
        String[] menu;
        if (userRole == "Guest user") {
            menu = new String[]  {
                    "1. View contacts",
                    "2. Search for contact",
                    "3. Exit"
            };
        } else {
            menu = new String[]  {
                    "1. View contacts",
                    "2. Search for contact",
                    "3. Edit contacts",
                    "4. Logout",
                    "5. Exit"
            };
        }
        return menu;
    }

    public int menuDisplay(){
        // get users status
        Users userStatus = new Users();
//        userRole = userStatus.userStatus();

        //Menu options
        while (true) {
            try {
                System.out.println("Main menu:");

                // Check user's status or offer account creation/deletion
                System.out.println("If you are a guest, enter: 1 | If you are an admin, enter: 2");
                System.out.println("To create an account, enter: 3 | To delete an account, enter: 4");
                System.out.println("To login into your account, enter: 5 ");
                int loginChoice = scanner.nextInt();

                switch (loginChoice) {
                    case 1:
                        userRole = "Guest user";
                        break;
                    case 2:
                        userRole = userStatus.login();
                        break;
                    case 3:
                        userStatus.createUserAccount();
                        break;
                    case 4:
                        userStatus.deleteUserAccount();
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                        continue;
                }

                String[] menu = getMenu(userRole);

                System.out.println("Your are logged in as a: " + userRole + "\n");

                System.out.println( "Select your your option by entering a number from 1 - " + menu.length);
                for (int i=0; i < menu.length; i++ ) {
                    System.out.println(menu[i]);
                    AddContact editedTrigger =new AddContact();
                    if (AddContact.newContactSaved){
                        ViewContact newSavedListView = new ViewContact();
                        newSavedListView.viewContact();
                    }
                }
                userMenuChoice = scanner.nextInt();

                if (userMenuChoice == 4 && userRole.equals("admin")) {
                    // Logout option for admin
                    userRole = "Guest user";
                    System.out.println("Logged out successfully.");
                    continue; // Return to the main menu
                }

                if (userMenuChoice < menu.length+1 ) {
                    System.out.println(menu[userMenuChoice - 1]);
                    return userMenuChoice;
                } else {
                    if (userRole.equals("Guest user")) {
                        System.out.print("Invalid entry! You enter: " + userMenuChoice + " is not a number between 1 - " + menu.length + "!\n");
                    } else {
                        System.out.print("Invalid entry! You enter: " + userMenuChoice + " is not a number between 1 -" + menu.length + "!\n");

                    }
                }
            } catch (Exception e) {
                System.out.println("Error: Input is not an number."+ "\n" + "try again!");
                scanner.next(); // Consume the invalid input
            }
        }
    }

    private String[] fetchMenu(String userRole) {
        String[] menu;
        if (userRole.equals("Guest user")) {
            menu = new String[]{
                    "1. View contacts",
                    "2. Search for contact",
                    "3. Exit"
            };
        } else {
            menu = new String[]{
                    "1. View contacts",
                    "2. Search for contact",
                    "3. Edit contacts",
                    "4. Logout",
                    "5. Exit"
            };
        }
        return menu;
    }
}
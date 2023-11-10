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
                    "4. Exit"
            };
        }
        return menu;
    }

    public int menuDisplay(){
        // get users status
        Users userStatus = new Users();
        userRole = userStatus.userStatus();
        System.out.println("Your role is: " + userRole + "\n");

        //Menu options
        while (true) {
            try {
                System.out.println("Main menu:");

                String[] menu = getMenu(userRole);

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
                System.out.println("Error: Input is not an number."+ "\n");
                scanner.next(); // Consume the invalid input
            }
        }
    }
}
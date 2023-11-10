import java.util.InputMismatchException;
import java.util.Scanner;

public class AddContact {
    Scanner scanner = new Scanner(System.in);
    //boolean that works as switch in the view contact class to update that final slot
    boolean updateInProgress = false;
    static boolean editInProgress = false;
   static boolean newContactSaved = false;
    static boolean deleteInProgress = false;
    static String[] updatedPreSaveSurnamePhoneList;
    static String firstName;
    static String surname;
    static int phoneNumber;
    static int age;
    static String city;
    static int postalCode;
    static String streetName;
    static int  gateNumber;

    // enter name
    public String addName(){
        updateInProgress = true;
        // have user enter name
        System.out.println("Enter name:");
        firstName = scanner.next();
        return firstName;
    }
    // enter surname
    public String addSurname(){
        System.out.println("Enter surname:");
        surname = scanner.next();
        return surname;
    }
    // enter phone number
    public int addPhoneNumber(){
        //  create a switch
        boolean validNumber = false;
        //a loop with a catch to ensure user enter an actual integer
        do {
            try {
                System.out.println("Enter phone number:");
                phoneNumber = scanner.nextInt();
                // If entry is valid, set the switch  to true
                validNumber = true;
            } catch (InputMismatchException e) {
                // If the input is not an integer, catch the exception
                System.out.println("Invalid entry! Please enter a number greater than 0.");
                // Clear the buffer to prevent an infinite loop
                scanner.nextLine();
            }
        } while (!validNumber);
        return phoneNumber;
    }
    // enter age
    public int addAge(){
        //  create a switch
        boolean validAge = false;
        //a loop with a catch to ensure user enter an actual integer
        do {
            try {
                System.out.println("Enter age:");
                age = scanner.nextInt();
                // If entry is valid, set the switch  to true
                validAge = true;
            } catch (InputMismatchException e) {
                // If the input is not an integer, catch the exception
                System.out.println("Invalid entry! Please enter a number greater than 0.");
                // Clear the buffer to prevent an infinite loop
                scanner.nextLine();
            }
        } while (!validAge);
        return age;
    }
    // enter postalCode;
    public int addPostalCode(){
        //  create a switch
        //  create a switch
        boolean validPostalCode = false;
        //a loop with a catch to ensure user enter an actual integer
        do {
            try {
                System.out.println("Enter postal code:");
                postalCode = scanner.nextInt();
                // If entry is valid, set the switch  to true
                validPostalCode = true;
            } catch (InputMismatchException e) {
                // If the input is not an integer, catch the exception
                System.out.println("Invalid input. Please enter numbers only!");
                // Clear the buffer to prevent an infinite loop
                scanner.nextLine();
            }
        } while (!validPostalCode);
        return postalCode;
    }
    // enter City;
    public String addCity(){
        System.out.println("Enter City:");
        city = scanner.next();
        return city;
    }
    // enter streetName;
    public String addStreetName() {
        System.out.println("Enter street name:");
        streetName = scanner.next();
        return streetName;
    }
    // enter gateNumber;
    public int addGateNumber(){
        //  create a switch
        boolean validGateNumber = false;
        //a loop with a catch to ensure user enter an actual integer
        do {
            try {
                System.out.println("Enter gate number:");
                gateNumber = scanner.nextInt();
                // If entry is valid, set the switch  to true
                validGateNumber = true;
            } catch (InputMismatchException e) {
                // If the input is not an integer, catch the exception
                System.out.println("Invalid input. Please enter numbers only!");
                // Clear the buffer to prevent an infinite loop
                scanner.nextLine();
            }
        } while (!validGateNumber);
        return gateNumber;
    }
    public static void displayNewContact(){
        if(deleteInProgress){
            System.out.println("Number Deleted!");

        } else {
        System.out.println("New number saved!");
        }
        System.out.println("First Name " + firstName);
        System.out.println("Surname " +surname);
        System.out.println("Phone number " +phoneNumber);
        System.out.println("Age " + age);
        System.out.println("City: " + city + " | Postal Code: " + postalCode + " | Street: " + streetName + " | Gate Number: " + gateNumber);
    }
     public static boolean triggerEdit(){
         // ask user if they want to edit contact
         int userWantsToEdit = 0;
         int userWantsToDelete = 0;
         Scanner editScanner = new Scanner(System.in);
         //a loop with a catch to ensure user enter an actual integer
         do {
             try {
                 System.out.println("To edit contact enter: 1 | to save contact enter: 2 | to delete contact enter: 3");
                 userWantsToEdit = editScanner.nextInt();
                 // If entry is valid, set the switch  to true
                 if (userWantsToEdit == 1){
                     return editInProgress = true;
                 } else if ( userWantsToEdit == 2) {
                     System.out.println("Contact saved!");
                     //there is a bug in the code which is preventing me from seeing this new added contact
                     //created dummy menu where users can access the updated list
                     DummyMain loopMenu = new DummyMain();
                     loopMenu.dummyMain();
                 } else if (userWantsToEdit == 3) {
                     System.out.println("Are you sure you want to delete this contact? For YES enter:1 | For NO enter: 2");
                         //a loop with a catch to ensure user enter an actual integer
                         do {
                             try {
                                 userWantsToDelete = editScanner.nextInt();
                                 // If entry is valid, set the switch  to true
                                 if (userWantsToDelete ==1){
                                     deleteInProgress = true;
                                     return deleteInProgress;
                                 } else if (userWantsToDelete == 2) {
                                     System.out.println("Aborting contact delete");
                                 } else {
                                     System.out.println("Enter 1 to Delete | Enter 2 to abort contact delete");
                                 }
                             } catch (InputMismatchException e) {
                                 // If the input is not an integer, catch the exception
                                 System.out.println("Invalid input. Please enter numbers only!");
                                 // Clear the buffer to prevent an infinite loop
                                 editScanner.nextLine();
                             }
                         } while ( userWantsToEdit == 0 || userWantsToEdit >2);
                 } else {
                     System.out.println("Select 1 or 2");
                 }
             } catch (InputMismatchException e) {
                 // If the input is not an integer, catch the exception
                 System.out.println("Invalid input. Please enter numbers only!");
                 // Clear the buffer to prevent an infinite loop
                 editScanner.nextLine();
             }
         } while (userWantsToEdit < 1 || userWantsToEdit > 2);
         return editInProgress;
     }
     // delete name
    public String deleteName(){
        firstName = "";
        return firstName;
    }
    // delete surname
    public String deleteSurname(){
        surname = "";
        return surname;
    }
    // delete number
    public int deleteNumber(){
        phoneNumber = 0;
        return phoneNumber;
    }
    // delete age
    public int deleteAge(){
        age = 0;
        return age;
    }
    // delete postalCode;
    public int deletePostalCode(){
        postalCode = 0;
        return postalCode;
    }
    // delete City;
    public String deleteCity(){
        city = "";
        return city;
    }
    // delete streetName;
    public String deleteStreetName() {
        streetName = "";
        return streetName;
    }
    // delete gateNumber;
    public int deleteGateNumber(){
        gateNumber = 0;
        return gateNumber;
    }
}

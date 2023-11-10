import java.util.InputMismatchException;
import java.util.Scanner;

public class ViewContact {
    String[] preSaveSurnamePhoneList = new String[7];
    DummyMain getUpdatedList = new DummyMain();
    AddContact updateList = new AddContact();
    public void viewContact(){
        Scanner scanner = new Scanner(System.in);
        ContactDetails contactDetails = new ContactDetails();
        Menu returnToMenu = new Menu();
        // preSaved contact list
        preSaveSurnamePhoneList[0]= "Drogba";
        preSaveSurnamePhoneList[1]= "Henry";
        preSaveSurnamePhoneList[2]= "Eto";
        preSaveSurnamePhoneList[3]= "Diouf";
        preSaveSurnamePhoneList[4]= "Essien";
        preSaveSurnamePhoneList[5]= "Mikel";
        if ( getUpdatedList.dummyMainLoop) {
            preSaveSurnamePhoneList[6]= AddContact.surname;
        } else {
        preSaveSurnamePhoneList[6]= "This slot is Empty | Add new contact by selecting edit contacts in main menu";
//            System.out.println("This slot is Empty | Add new contact by selecting edit contacts in main menu");
        }

        for (int i = 0; i < preSaveSurnamePhoneList.length; i++){
            System.out.println((i +1)+". " + preSaveSurnamePhoneList[i]);}
        //give the choice to return to main menu or open a contact
        //  create a switch
            int goBackToMenu = 0;
            //a loop with a catch to ensure user enter an actual integer
            do {
                try {
                    System.out.println("To return to menu enter:1 | To return to view contact details enter: 2 ");
                    goBackToMenu = scanner.nextInt();
                  if (goBackToMenu == 1){
                      returnToMenu.menuDisplay();
                  } else if (goBackToMenu ==2) {
                      //ask user which contact they want to view
                      System.out.println("Enter the number of the contact you would like to view:");
                  }
                } catch (InputMismatchException e) {
                    // If the input is not an integer, catch the exception
                    System.out.println("Invalid entry! Please enter a number between 1 and 2.");
                    // Clear the buffer to prevent an infinite loop
                    scanner.nextLine();
                }
            } while (goBackToMenu !=1 && goBackToMenu != 2);

        //Open contact details
        int openContactDetails = 0;
        // if user goes back to menu and returns this will display the contact list again
        if (goBackToMenu == 1){
            for (int i = 0; i < preSaveSurnamePhoneList.length; i++){
                System.out.println((i +1)+". " + preSaveSurnamePhoneList[i]);}
        }
        System.out.println("Pick which number you would like to open");
         openContactDetails = scanner.nextInt();
        if (openContactDetails == 1){
            contactDetails.drogba();
        } else if (openContactDetails == 2) {
            contactDetails.henry();
        }else if (openContactDetails == 3) {
            contactDetails.eto();
        }else if (openContactDetails == 4) {
            contactDetails.diouf();
        }else if (openContactDetails == 5) {
            contactDetails.essien();
        }else if (openContactDetails == 6) {
            contactDetails.mikel();
        }else if (openContactDetails == 7) {
           contactDetails.newContactDetails();
        }
        //give the choice to return to main menu or exit
        //  create a switch to determine which option was picked
        int goBackToMenuAgain = 0;
        //a loop with a catch to ensure user enter an actual integer
        do {
            try {
                System.out.println("To return to menu enter:1 | To exit enter: 2 ");
                goBackToMenuAgain = scanner.nextInt();
                if (goBackToMenuAgain == 1){
                    returnToMenu.menuDisplay();
                } else if (goBackToMenuAgain ==2) {
                    //ask user which contact they want to view
                    System.out.println("Thank you! You have been logged out :)");
                }
            } catch (InputMismatchException e) {
                // If the input is not an integer, catch the exception
                System.out.println("Invalid entry! Please enter a number between 1 and 2.");
                // Clear the buffer to prevent an infinite loop
                scanner.nextLine();
            }
        } while (goBackToMenuAgain !=1 && goBackToMenuAgain != 2);
    }
}

public class DummyMain {
    boolean dummyMainLoop = true;
    public void dummyMain() {
        // welcome message
        System.out.println("Welcome to FootBall Yellow Pages!" + "\n");
        //display menu
        Menu menuDisplay = new Menu();
        menuDisplay.menuDisplay();
        //Search functionality
        Search search = new Search();

        int userMenuChoice = menuDisplay.userMenuChoice;
        // view contact list
        ViewContact viewContactList = new ViewContact();
        //access addContacts class
        AddContact addContact = new AddContact();
        // conditions depending on user choice
        if (userMenuChoice == 1){
            viewContactList.viewContact();
        } else if (userMenuChoice == 2) {
            Search.search();
        } else if (userMenuChoice == 3 && (!menuDisplay.userRole.equals("Guest user"))) {
            addContact.addName();
            addContact.addSurname();
            addContact.addAge();
            addContact.addCity();
            addContact.addPostalCode();
            addContact.addStreetName();
            addContact.addGateNumber();
            AddContact.displayNewContact();
            AddContact.triggerEdit();
            if (AddContact.editInProgress){
                addContact.addName();
                addContact.addSurname();
                addContact.addAge();
                addContact.addCity();
                addContact.addPostalCode();
                addContact.addStreetName();
                addContact.addGateNumber();
                AddContact.displayNewContact();
                AddContact.triggerEdit();
            }
            if (AddContact.deleteInProgress){
                addContact.deleteName();
                addContact.deleteSurname();
                addContact.deleteGateNumber();
                addContact.deleteAge();
                addContact.deleteCity();
                addContact.deletePostalCode();
                addContact.deleteStreetName();
                addContact.deleteGateNumber();
                AddContact.displayNewContact();
                AddContact.triggerEdit();
            }
        }
        else {
            System.out.println("Thank you for using Football Yellow Pages!");
        }
    }
}

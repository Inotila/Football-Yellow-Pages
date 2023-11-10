public class ContactDetails {
    AddContact getAddedContactDetails = new AddContact();
    String firstName;
    String surname;
    int phoneNumber;
    int  age;
    String city;
    int postalCode;
    String streetName;
    int    gateNumber;
    public void drogba( ){
        firstName = "Dider";
        surname ="Drogba";
        age = 36;
        phoneNumber = 2334424;
        city ="London";
        postalCode = 818;
        streetName = "Chelsea";
        gateNumber = 11;
        System.out.println("First Name " + firstName);
        System.out.println("Surname " +surname);
        System.out.println("Phone number " +phoneNumber);
        System.out.println("Age " + age);
        System.out.println("City: " + city + " | Postal Code: " + postalCode + " | Street: " + streetName + " | Gate Number: " + gateNumber);
    };
    public void henry( ){
        firstName = "Thiery";
        surname ="Henry";
        phoneNumber = 343294424;
        age = 34;
        city ="London";
        postalCode = 818;
        streetName = "Arsenal";
        gateNumber = 14;
        System.out.println("First Name " + firstName);
        System.out.println("Surname " +surname);
        System.out.println("Phone number " +phoneNumber);
        System.out.println("Age " + age);
        System.out.println("City: " + city + " | Postal Code: " + postalCode + " | Street: " + streetName + " | Gate Number: " + gateNumber);
    };
    public void eto( ){
        firstName = "Samuel";
        surname ="Eto";
        phoneNumber = 566784424;
        age = 40;
        city ="Milan";
        postalCode = 418;
        streetName = "Inter";
        gateNumber = 29;
        System.out.println("First Name " + firstName);
        System.out.println("Surname " +surname);
        System.out.println("Phone number " +phoneNumber);
        System.out.println("Age " + age);
        System.out.println("City: " + city + " | Postal Code: " + postalCode + " | Street: " + streetName + " | Gate Number: " + gateNumber);
    };
    public void diouf( ){
        firstName = "El Hadi";
        surname ="Diouf";
        phoneNumber = 886784424;
        age = 31;
        city ="Liverpool";
        postalCode = 348;
        streetName = "Problem";
        gateNumber = 13;
        System.out.println("First Name " + firstName);
        System.out.println("Surname " +surname);
        System.out.println("Phone number " +phoneNumber);
        System.out.println("Age " + age);
        System.out.println("City: " + city + " | Postal Code: " + postalCode + " | Street: " + streetName + " | Gate Number: " + gateNumber);
    };
    public void essien( ){
        firstName = "Michael";
        surname ="Essien";
        phoneNumber = 889994424;
        age = 36;
        city ="London";
        postalCode = 818;
        streetName = "Chelsea";
        gateNumber = 11;
        System.out.println("First Name " + firstName);
        System.out.println("Surname " +surname);
        System.out.println("Phone number " +phoneNumber);
        System.out.println("Age " + age);
        System.out.println("City: " + city + " | Postal Code: " + postalCode + " | Street: " + streetName + " | Gate Number: " + gateNumber);
    };
    public void mikel( ){
        firstName = "John Obi";
        surname ="Mikel";
        phoneNumber = 877994424;
        age = 29;
        city ="London";
        postalCode = 818;
        streetName = "Chelsea";
        gateNumber = 13;
        System.out.println("First Name " + firstName);
        System.out.println("Surname " +surname);
        System.out.println("Phone number " +phoneNumber);
        System.out.println("Age " + age);
        System.out.println("City: " + city + " | Postal Code: " + postalCode + " | Street: " + streetName + " | Gate Number: " + gateNumber);
    };
    public void newContactDetails( ){
        DummyMain getUpdatedContactViaDummy = new DummyMain();
        if (getAddedContactDetails.updateInProgress || getUpdatedContactViaDummy.dummyMainLoop){
        firstName = AddContact.firstName;
        surname = AddContact.surname;
        phoneNumber = AddContact.phoneNumber;
        age = AddContact.age;
        city = AddContact.city;
        postalCode = AddContact.postalCode;
        streetName = AddContact.streetName;
        gateNumber = AddContact.gateNumber;
        System.out.println("First Name " + firstName);
        System.out.println("Surname " +surname);
        System.out.println("Phone number " +phoneNumber);
        System.out.println("Age " + age);
        System.out.println("City: " + city + " | Postal Code: " + postalCode + " | Street: " + streetName + " | Gate Number: " + gateNumber);
    } else {
            System.out.println("This slot is empty!");
        }
    }
}

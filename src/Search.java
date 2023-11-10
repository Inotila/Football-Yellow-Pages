import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Search {
    static String searchEntry;
//    static ViewContact viewContact = new ViewContact();
    public static void search(){
        ContactDetails contacts = new ContactDetails();
        Scanner searchScanner = new Scanner(System.in);
        System.out.println("Enter the last name or street name of the contact you are looking for.");
        searchEntry = searchScanner.next().toLowerCase(Locale.ROOT);

        if (Objects.equals(searchEntry, "drogba")) {
            contacts.drogba();
        } else if (Objects.equals(searchEntry, "diouf") || Objects.equals(searchEntry, "problem")) {
            contacts.diouf();
        } else if (Objects.equals(searchEntry, "eto")|| Objects.equals(searchEntry, "inter")) {
            contacts.eto();
        } else if (Objects.equals(searchEntry, "herny") || Objects.equals(searchEntry, "arsenal")) {
            contacts.henry();
        } else if (Objects.equals(searchEntry, "mikel")) {
            contacts.mikel();
        } else if (Objects.equals(searchEntry, "essien")) {
            contacts.essien();
        } else if (Objects.equals(searchEntry, contacts.surname) || Objects.equals(searchEntry, contacts.streetName)) {
            contacts.newContactDetails();
        } else if (Objects.equals(searchEntry, "chelsea")) {
            contacts.drogba();
            contacts.essien();
            contacts.mikel();
        } else  {
            System.out.println("Sorry search not found");
        }
        System.out.println("Thank you for using Football Yellow Pages!");
    }
}

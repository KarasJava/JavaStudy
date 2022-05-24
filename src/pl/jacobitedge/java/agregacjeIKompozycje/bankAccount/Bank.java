package pl.jacobitedge.java.agregacjeIKompozycje.bankAccount;

public class Bank {
    public static void main(String[] args) {

        Person person1 = new Person();

        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "999999999";

        Address address1 = new Address();
        address1.city = "Warsaw";
        address1.postalCode = "20-222";
        address1.street = "11 Listopada";
        address1.home = 22;
        address1.flat = 43;

        person1.livingAddress = address1;
        person1.registeredAddress = address1;

        BankAccount account1 = new BankAccount();
        account1.balance = 20_000;
        account1.owner = person1;


        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.cashBorrowed = 20_000;
        credit1.cashReturned = 2_000;
        credit1.interestRate = 0.10;
        credit1.termMonths = 12;


        Person person2 = new Person();
        person2.firstName = "Marta";
        person2.lastName = "Kowalska";
        person2.pesel = "91070645628";

        person2.registeredAddress = new Address();
        person2.registeredAddress.city = "Kraków";
        person2.registeredAddress.postalCode = "30-333";
        person2.registeredAddress.street = "Mickiewicza";
        person2.registeredAddress.home = 15;
        person2.registeredAddress.flat = 8;
        person2.livingAddress = address1;

        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 30_000;



        System.out.println("Person:" +person1.firstName + " " + person1.lastName + " Pesel: " + person1.pesel);

    }

}

package bankapplication;

public class Checking extends Account {

    int debitCardNumber;
    int debitCardPin;

    public Checking(String name, String ssn, double initialDeposit) {
        super(name, ssn, initialDeposit);
        accountNumber = "2" + accountNumber;
    }

}

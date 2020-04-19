package bankapplication;

public class Saving extends Account {

    int safeDepositBoxID;
    int safeDepositBoxKey;

    public Saving(String name, String ssn, double initialDeposit) {
        super(name, ssn, initialDeposit);
        accountNumber = "1" + accountNumber;
    }
}

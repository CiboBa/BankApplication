package bankapplication;

public abstract class Account implements InterestRate {

    String name;
    String ssn;
    double balance;

    static int index = 10000;
    String accountNumber;
    double rate;

    public Account(String name, String ssn, double initialDeposit) {
        this.name = name;
        this.ssn = ssn;
        balance = initialDeposit;

        index++;
        this.accountNumber = setAccountNumber();
    }

    private String setAccountNumber() {
        String lastTwoOfSsn = ssn.substring(ssn.length() - 2);
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * 1000);
        return lastTwoOfSsn + uniqueID + randomNumber;
    }

    public void showInfo() {
        System.out.println(
                "NAME: " + name +
                        "\nACCOUNT NUMBER: " + accountNumber +
                        "\nSSN:" + ssn +
                        "\nBALANCE: $" + balance
        );
    }
}

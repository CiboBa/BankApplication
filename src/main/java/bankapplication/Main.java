package bankapplication;

public class Main {

    public static void main(String[] args) {

        Checking check1 = new Checking("Carlos Tevez", "321456789", 1500);
        check1.showInfo();

        System.out.println();

        Saving save1 = new Saving("Mino Raiola", "456314989", 2500);
        save1.showInfo();
    }
}

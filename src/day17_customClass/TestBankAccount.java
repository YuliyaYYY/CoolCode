package day17_customClass;

public class TestBankAccount {

    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount();

        obj1.accountHolder = "Julia";
        obj1.accountNumber = 357623868;

        System.out.println(obj1);

        obj1.deposit(1000);

        obj1.checkBalance();

        obj1.withdraw(500);

        obj1.checkBalance();

        obj1.deposit(-4000);

        obj1.checkBalance();

        obj1.withdraw(5000);

        obj1.checkBalance();

        System.out.println("-------------------------------");

        BankAccount account1 = new BankAccount();
        account1.setInfo("Gina",3938393);

        BankAccount account2 = new BankAccount();
        account2.setInfo("Bob",379739238);

        account1.deposit(5000);

        System.out.println(account1);
        System.out.println(account2);


    }

}

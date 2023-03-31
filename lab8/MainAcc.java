public class MainAcc {
    public static void main(String[] args) {
        Customer cust = new Customer("Somsri", "Boonjing");
        Account acct1 = new Account(5000, "Somsri01");
        Account acct2 = new Account(3000, "Somsri02");
        Account acct3 = new Account(3000, "Somsri02");
        Account acct4 = new Account(3000, "Somsri02");
        Account acct5 = new Account(3000, "Somsri02");
        Account acct6 = new Account(3000, "Somsri02");
        cust.addAccount(acct1);
        cust.addAccount(acct2);
        cust.addAccount(acct3);
        cust.addAccount(acct4);
        cust.addAccount(acct5);
        cust.addAccount(acct6);
        cust.getAccount(0).withdraw(3000);
        cust.getAccount(1).withdraw(3000);
        System.out.println(cust);
        for (int i = 0; i < cust.getNumOfAccount(); i++) {
            cust.getAccount(i).showAccount();
        }
    }
}
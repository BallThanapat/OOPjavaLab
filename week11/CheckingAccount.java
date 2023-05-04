public class CheckingAccount extends Account {
    private double credit;
    public CheckingAccount(){
        super(0, "");
        credit = 0;
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if(credit>0){
            this.credit = credit;
        }
    }
    public double getCredit(){
        return credit;
    }
    @Override
    public void withdraw(double a) throws WithdrawException {
        if(a>0){
            if(balance-a>0){
                balance -= a;
                System.out.println(a+" baht is withdrawn from "+name+" and your credit balance is "+credit+".");
            }else if(balance-a<0){
                if((balance-a)+credit>0){
                    credit -= balance-a;
                    balance = 0;
                    System.out.println(a+" baht is withdrawn from "+name+" and your credit balance is "+credit+".");
                }else{
                    throw new WithdrawException("Account"+name+"has not enough money.");
                }
            }
        }
    }
    @Override
    public String toString(){
        return "The "+name+" account has "+balance+" baht and "+credit+" credits.";
    }
}

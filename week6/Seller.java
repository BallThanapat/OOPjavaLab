public class Seller extends Employee{
    public Food sell(Employee e){
        Food food = new Food();
        if(e.getWallet().getBalance() >= Food.getPrice()){
            double total = this.getWallet().getBalance()+Food.getPrice();
            double total2 = e.getWallet().getBalance()-Food.getPrice();
            this.getWallet().setBalance(total);
            e.getWallet().setBalance(total2);
            return food;
        }else{
            System.out.println("Your money is not enough.");
            return null;
        }
    }
}

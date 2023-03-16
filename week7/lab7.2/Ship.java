public class Ship extends Vehicle implements Floatable{
    public Ship(){
        super(0.0);
    }
    public Ship(double fuel){
        super(fuel);
    }
    public void move(){
        this.fl0at();
    }
    public void move(int distance){
        for(int a=1; a<=distance; a++){
            this.fl0at();
        }
    }
    @Override
    public void fl0at(){
        if(super.fuel>=50){
            super.fuel -=50;
            System.out.println("Ship moves");
        }
        else{
            System.out.println("Fuel is not enough.");
        }
    }
    @Override
    public void startEngine(){
        if(super.fuel>=10){
            super.fuel -=10;
            System.out.println("Engine starts");
        }
        else{
            System.out.println("Fuel is not enough.");
        }
    }
    @Override
    public void stopEngine(){
        System.out.println("Engine stops");
    }
    @Override
    public void honk(){
        System.out.println("Shhhhh");
    }
}

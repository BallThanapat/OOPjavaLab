public class Car extends Vehicle {
    Vehicle x1 = new Vehicle();
    Car v1 = new Car();
    private String typeEngine;
    public void setTypeEngine(String t){
        typeEngine = t;
    }
    public String getTypeEngine(){
        return typeEngine;
    }
    public void showCarInfo(){
        System.out.print("Car engine is "+typeEngine+".");
        x1.showInfo();
    }
    public void setCarInfo (int s, String t, String y){
        x1.setFuel(s);
        x1.setTopSpeed(t);
        v1.setTypeEngine(y);
    }
    public void move(){
        if(x1.getFuel()-50>=0){
            System.out.println("Move.");
            
        }else{
            System.out.println("Please add fuel.");
        }
    }
    
}

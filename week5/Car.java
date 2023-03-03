public class Car extends Vehicle {
    Vehicle c1 = new Vehicle();
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
        System.out.println(c1.showInfo(c2));
    }
    public void setCarInfo (int s, String t, String y){
        c1.setFuel(s);
        c1.setTopSpeed(t);
        v1.setTypeEngine(y);
    }
    public void move(){
        System.out.println("Move.");
        c1.setFuel(-50);
    }
    
}

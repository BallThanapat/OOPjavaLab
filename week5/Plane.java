public class Plane extends Vehicle{
    public void showPlaneInfo(){
        System.out.println("Plane detail is, ");
        showInfo();
    }
    public void setPlaneInfo(int s, String t){
        setFuel(s);
        setTopSpeed(t);
    }
    public void fly(){
        int fuel = getFuel();
        if(fuel >= 200){
            System.out.println("Fly.");
            setFuel(getFuel()-200);
        }else{
            System.out.println("Please add fuel.");
        }
    }
}
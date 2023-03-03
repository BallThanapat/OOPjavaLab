public class Plane {
    Vehicle o1 = new Vehicle();
    Plane b1 = new Plane();
    public void showPlaneInfo(){
        System.out.println("Plane detail is, ");
        o1.showInfo();
    }
    public void setPlaneInfo(int s, String t){
        o1.setFuel(s);
        o1.setTopSpeed(t);
    }
    public void fly(){
        if(o1.getFuel()-200>=0){
            System.out.println("Move.");
            
        }else{
            System.out.println("Please add fuel.");
        }
    }
}

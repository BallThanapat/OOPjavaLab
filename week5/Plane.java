public class Plane {
    Vehicle p1 = new Vehicle();
    public void showPlaneInfo(){
        System.out.println("Plane detail is, "+p1.showInfo());
    }
    public void setPlaneInfo(int s, String t){
        p1.setFuel(s);
        p1.setTopSpeed(t);
    }
    public void fly(){
        System.out.println("Fly.");
        
    }
}

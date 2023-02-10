import java.util.Scanner;
public class taxlab02 {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        double n1 = input.nextDouble();
        if (n1 > 50000){
            System.out.println(n1*0.1);
        }else if (n1 <= 50000){
            System.out.println(n1*0.05);
        }
    } 
}
import java.util.Scanner;
public class banklab02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        char nType = input.next().charAt(0);
        if (nType == 'A'){
            System.out.println("Your total money in one year = "+(n1+(n1*0.015)));
        }else if (nType == 'B'){
            System.out.println("Your total money in one year = "+(n1+(n1*0.02)));
        }else if (nType == 'C'){
            System.out.println("Your total money in one year = "+(n1+(n1*0.015)));
        }else if (nType == 'X'){
            System.out.println("Your total money in one year = "+(n1+(n1*0.05)));
        }
    }
}
import java.util.Scanner;
public class Getline {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int n1 = num.nextInt();
        for (int x=1; x<=n1; x++){
            if (x%5 != 0){
                System.out.print("|");
            }else if(x%5 == 0){
                System.out.print("/");
            }
        }
    }
}

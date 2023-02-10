import java.util.Scanner;
public class OddEvenoop {
    public static void main(String[] args) {
        int n1;
        int odd = 0;
        int even = 0;
        Scanner num = new Scanner(System.in);
        while ((n1 = num.nextInt()) != -1){
            if (n1%2 == 0){
                even += 1;
            }else{
                odd += 1;
            }
        }
        System.out.println("Odd number = "+odd+" and Even number = "+even);
    }
}

import java.util.Scanner;
public class Tuekbaiyok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = "#-#-#-#-#";
        int high = sc.nextInt();
        for (int x = 0; x < high; x+=1 ){
            System.out.println(n1);
        }
    }
}

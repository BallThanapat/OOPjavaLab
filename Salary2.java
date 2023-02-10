import java.util.Scanner;
public class Salary2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int wg = sc.nextInt();
        int salary = 0;
        if (age<31 & age>20){
            salary = (n1*300)-(n2*50);
        }else if (age<41 & age>30){
            salary = (n1*500)-(n2*50);
        }else if (age<51 & age>40){
            salary = (n1*1000)-(n2*50);
        }else if (age<61 & age>50){
            salary = (n1*3000)-(n2*50);
        }
        System.out.println("Hi, "+name);
        System.out.println("Your salary is "+salary);
        if (wg<61 & wg>9){
            System.out.println("Your salary and bonus is " +(salary + 5000));
        }else if (wg<91 & wg>60){
            System.out.println("Your salary and bonus is " +(salary + (5000 - ((wg-60)*10))));
        }else if (wg>90){
            System.out.println("Your salary and bonus is " +salary);
        }
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String number1 = s.next();
        String number2 = s.next();
        Long num1 = Long.valueOf(number1);
        Long num2 = Long.valueOf(number2);
        if (num1 > num2){
                System.out.println("Махатма");
            } else {
                System.out.println("Джавахарлал");
            }


    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        String str3 = scan.next();
        Integer number1 = Integer.valueOf(str1);
        Integer number2 = Integer.valueOf(str2);
        Integer number3 = Integer.valueOf(str3);
            if (number1>=number2 && number1>=number3) System.out.println(number1);
            if (number2>=number1 && number2>=number3) System.out.println(number2);
            if (number3>=number2 && number3>=number1) System.out.println(number3);
    }
}

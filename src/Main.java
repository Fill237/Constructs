import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        Integer passwordSave = 111111;
        Integer passwordUser = Integer.valueOf(str1);
        if (passwordSave == passwordUser) {
                System.out.println("Access is granted");
            } else {
                System.out.println("Access is denied");
            }


    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        int l1 = str1.length();
        int l2 = str2.length();
        if (l1 > l2){
                System.out.println("Махатма");
            } else {
                System.out.println("Джавахарлал");
            }


    }
}

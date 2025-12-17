import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String octal = sc.next();
        int decimal = Integer.parseInt(octal, 8);

        System.out.println(decimal);

        sc.close();
    }
}

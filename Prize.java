import java.util.Scanner;

public class Prize {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter cash amount: ");
            int cash = sc.nextInt();

            if (cash < 10) {
                System.out.println("x: can not buy anything");
            } else if (cash >= 10 && cash < 50) {
                System.out.println("x: can buy one thing");
            } else {
                System.out.println("x: can buy anything");
            }
        }
    }
}


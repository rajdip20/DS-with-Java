import java.util.Scanner;

public class RectangularPattern {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Row number: ");
            int r = sc.nextInt();
            System.out.print("Enter column number: ");
            int c = sc.nextInt();

            for (int i = 1; i <= r; i++) {

                for (int j = 1; j <= c; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

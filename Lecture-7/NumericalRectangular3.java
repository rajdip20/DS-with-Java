import java.util.Scanner;

public class NumericalRectangular3 {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter row: ");
            int r = sc.nextInt();
            System.out.print("Enter Column: ");
            int c = sc.nextInt();

            for (int i = 1; i <= r; i++) {

                for (int j = 1; j <= c; j++) {

                    if ((j + i) % 2 == 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("2");
                    }
                }
                System.out.println();
            }
        }
    }
}

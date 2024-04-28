import java.util.Scanner;

public class NumberArranger {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three integers (separated by spaces or new line): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
      

        System.out.println("Original order: " + a + " " + b + " " + c);
        

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Ascending order: " + a + " " + b + " " + c);
    }
}

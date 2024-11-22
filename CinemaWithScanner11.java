import java.util.Scanner;
public class CinemaWithScanner11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        int row, column;
        String name, next;
        String[][] audience = new String[4][2];
        while (true) {
            System.out.print("Enter a name: ");
            name = input11.nextLine();
            System.out.print("Enter row number: ");
            row = input11.nextInt();
            System.out.print("Enter column number: ");
            column = input11.nextInt();
            input11.nextLine();

            audience[row - 1][column - 1] = name;
            System.out.print("Are there any other audience to be added? (y/n): ");
            next = input11.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}

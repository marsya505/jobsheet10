import java.util.Scanner;
public class CinemaWithScanner11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        int row = 0, column = 0;
        String name, next;
        String[][] audience = new String[4][2];
        while (true) {
            System.out.print("Enter a name: ");
            name = input11.nextLine();
        boolean validSeat = false;
        while (!validSeat) {
        while (true) {
            System.out.print("Enter row number: ");
            row = input11.nextInt();
            if (row < 1 || row > 4) {
                System.out.println("Invalid row number.");
            } else {
                break; 
            }
        }
        while (true) {
            System.out.print("Enter column number: ");
            column = input11.nextInt();
            input11.nextLine();
            if (column < 1 || column > 2) {
                System.out.println("Invalid column number.");
            } else {
                break; 
            }
        }
        if (audience[row - 1][column - 1] != null) {
            System.out.println("Seat at Row " + row + "and Column " + column + " is already occupied.");
        } else {
            validSeat = true;
            }
        }
            audience[row - 1][column - 1] = name;
            System.out.print("Are there any other audience to be added? (y/n): ");
            next = input11.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        System.out.println("Column      1      2");
        for (int i = 0; i < audience.length; i++) {
            System.out.print("Row " + (i + 1) + "     ");
            for (int j = 0; j < audience[i].length; j++) {
                if (audience[i][j] != null) {
                    System.out.print(audience[i][j] + "     ");
                } else {
                    System.out.print("***      ");
                }
            }
            System.out.println();
        }
    }
}
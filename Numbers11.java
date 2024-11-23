public class Numbers11 {
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[6];
        myNumbers[1] = new int[6];
        myNumbers[2] = new int[6];
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Length of row " + (i + 1) + ": " + myNumbers[i].length);
        }
    }
}
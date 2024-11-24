import java.util.Scanner;
public class Assignment11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int respondents = 10;
        int questions = 6;
        double total = 0;
        double average;
        double overallTotal = 0;
        double overallAverage;
        int[][] surveyResults = {
            {5, 4, 3, 4, 5, 2},
            {3, 2, 4, 5, 3, 4},
            {4, 4, 5, 4, 4, 5},
            {2, 3, 3, 2, 2, 2},
            {5, 5, 5, 5, 5, 5},
            {3, 4, 2, 3, 4, 4},
            {4, 3, 4, 4, 3, 4},
            {1, 2, 1, 2, 1, 1},
            {4, 5, 4, 5, 4, 5},
            {3, 3, 3, 3, 3, 3}
        };

        System.out.println("\nSurvey Results:");
        for (int i = 0; i < respondents; i++) {
            System.out.print("Respondent " + (i + 1) + ": ");
            for (int j = 0; j < questions; j++) {
                System.out.print(surveyResults[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nAverage value for each respondent:");
        for (int i = 0; i < respondents; i++) {
            for (int j = 0; j < questions; j++) {
                total += surveyResults[i][j];
            }
            average = total / questions;
            System.out.printf("Respondent %d: %.2f%n", (i + 1), average);
        }

        System.out.println("\nAverage value for each question:");
        for (int j = 0; j < questions; j++) {
            for (int i = 0; i < respondents; i++) {
                total += surveyResults[i][j];
            }
            average = total / respondents;
            System.out.printf("Question %d: %.2f%n", (j + 1), average);
        }
        for (int i = 0; i < respondents; i++) {
            for (int j = 0; j < questions; j++) {
                overallTotal += surveyResults[i][j];
            }
        }
        overallAverage = overallTotal / (respondents * questions);
        System.out.printf("\nOverall average value: %.2f%n", overallAverage);
        scanner.close(); 
    }
}
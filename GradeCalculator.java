import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = input.nextLine();

        System.out.print("Enter marks for Subject 1: ");
        int subject1 = input.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int subject2 = input.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int subject3 = input.nextInt();

        int total = subject1 + subject2 + subject3;
        double average = total / 3.0;

        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n--- Student Result ---");
        System.out.println("Name     : " + name);
        System.out.println("Total    : " + total);
        System.out.println("Average  : " + average);
        System.out.println("Grade    : " + grade);

        input.close();
    }
}

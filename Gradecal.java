import java.util.Scanner;

public class Gradecal {
    public String cal_grade(double avg_percentage) {
        if (avg_percentage >= 95) {
            return "A";
        } else if (avg_percentage >= 90) {
            return "B";
        } else if (avg_percentage >= 85) {
            return "C";
        } else if (avg_percentage >= 80) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Subjects : ");
        int Subjects = sc.nextInt();

        double[] marks = new double[Subjects];
        double t = 0;
        boolean a = false;

        for (int i = 0; i < Subjects; i++) {
            System.out.print("Enter The Marks for Subject " + (i + 1) + " => ");
            marks[i] = sc.nextDouble();
            if (marks[i] > 100) {
                System.out.println("Invalid Input");
                a = true;
                break;
            } else {
                t = t + marks[i];
            }

        }

        double avg_percentage = t / Subjects;
        Gradecal g = new Gradecal();
        String grade = g.cal_grade(avg_percentage);
        if (!a) {
            System.out.println("Total Marks : " + t);
            System.out.println("Average Percentage : " + avg_percentage);
            System.out.println("Grade : " + grade);
        } else {
            System.out.println("Retry");
        }
        sc.close();

    }
}

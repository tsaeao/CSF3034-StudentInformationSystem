package studentinformationsystem;

public class StudentInformationSystem {

    public static void main(String[] args) {

        String studentName = "Tg Safanah";
        String studentID = "85721";

        int mark1 = 85;
        int mark2 = 78;

        int total = mark1 + mark2;
        double average = total / 2.0;

        System.out.println("STUDENT INFORMATION SYSTEM");
        System.out.println("--------------------------");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks:"+ average);

        if (total >= 150) {
            System.out.println("Result: Excellent");
        } else if (total >= 100) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Needs Improvement");
        }
    }
}
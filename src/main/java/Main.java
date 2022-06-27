import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // your code here
        Scanner studentNameScanner = new Scanner(System.in);
        String[] studentList = new String[10];

        for (int i = 0; i < studentList.length; i++) {
            System.out.println("Enter student's name:");
            String studentName = studentNameScanner.nextLine();
            studentList[i] = studentName;
        }

        System.out.println("You have entered the following names:");

        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i]);
        }
    }
}

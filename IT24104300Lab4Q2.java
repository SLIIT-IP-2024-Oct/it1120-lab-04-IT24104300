import java.util.Scanner;

public class IT24104300Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

              System.out.print("Enter exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid exam marks. Must be between 0 and 100.");
            return;
        }

        System.out.print("Enter lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid lab submission marks. Must be between 0 and 100.");
            return;
        }

        System.out.print("Enter the percentage weight of the exam marks: ");
        double examPercentage = scanner.nextDouble();
        
        System.out.print("Enter the percentage weight of the lab marks: ");
        double labPercentage = scanner.nextDouble();
        
        if (examPercentage + labPercentage != 100) {
            System.out.println("Invalid percentages. The total must equal 100.");
            return;
        }

                double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

        System.out.println("The final mark for the module is: " + finalMark);

        scanner.close();
    }
}

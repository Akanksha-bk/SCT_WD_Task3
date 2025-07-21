import java.util.Scanner;

public class QuizGame {

    static String[] questions = {
        "1. What is the capital of India?",
        "2. Which data type is used to store true or false values?",
        "3. Fill in the blank: Java is a ____ language."
    };

    static String[][] options = {
        {"A. Mumbai", "B. Delhi", "C. Kolkata", "D. Chennai"},
        {"A. int", "B. String", "C. boolean", "D. double"},
        {"A. scripting", "B. functional", "C. compiled", "D. interpreted"}
    };

    static char[] answers = {'B', 'C', 'C'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Java Quiz Game!\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.length() == 1 && input.charAt(0) == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. Correct answer: " + answers[i] + "\n");
            }
        }

        System.out.println("Quiz Completed!");
        System.out.println("Your Score: " + score + " out of " + questions.length);

        scanner.close();
    }
}

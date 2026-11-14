
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class QuizGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== JAVA QUIZ GAME =====");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        Question[] questions = {

            new Question("Java was developed by?",
                new String[]{"Microsoft", "Sun Microsystems",
                             "Google", "Apple"}, 2),

            new Question("Which method starts Java execution?",
                new String[]{"start()", "main()",
                             "run()", "execute()"}, 2),

            new Question("Which keyword is used for inheritance?",
                new String[]{"this", "super",
                             "extends", "import"}, 3),

            new Question("Which type stores true or false?",
                new String[]{"int", "String",
                             "boolean", "char"}, 3),

            new Question("Which keyword creates an object?",
                new String[]{"class", "new",
                             "static", "void"}, 2),

            new Question("Which collection stores unique values?",
                new String[]{"ArrayList", "HashSet",
                             "LinkedList", "Vector"}, 2),

            new Question("Which package contains Scanner?",
                new String[]{"java.io", "java.net",
                             "java.util", "java.sql"}, 3),

            new Question("Which method compares String contents?",
                new String[]{"==", "equals()",
                             "compare()", "match()"}, 2),

            new Question("Which loop executes at least once?",
                new String[]{"for", "while",
                             "do-while", "foreach"}, 3),

            new Question("Which keyword prevents class inheritance?",
                new String[]{"static", "final",
                             "private", "abstract"}, 2)
        };

        String playAgain;

        do {
            int score = 0;

            System.out.println("\n===== NEW GAME =====");

            for (int i = 0; i < questions.length; i++) {

                System.out.println("\nQuestion " + (i + 1)
                                   + " of " + questions.length);

                questions[i].displayQuestion();

                int answer;

                while (true) {
                    System.out.print("Enter answer (1-4): ");

                    if (sc.hasNextInt()) {
                        answer = sc.nextInt();

                        if (answer >= 1 && answer <= 4) {
                            break;
                        }
                    } else {
                        sc.next();
                    }

                    System.out.println("Invalid input! Enter 1-4.");
                }

                if (questions[i].checkAnswer(answer)) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong! Correct option: "
                        + questions[i].getCorrectAnswer());
                }
            }

            double percentage = score * 100.0 / questions.length;

            System.out.println("\n===== FINAL RESULT =====");
            System.out.println("Name: " + name);
            System.out.println("Score: " + score + "/" + questions.length);
            System.out.printf("Percentage: %.2f%%\n", percentage);

            if (score == questions.length) {
                System.out.println("PERFECT SCORE! Java Champion!");
            } else if (percentage >= 80) {
                System.out.println("Excellent performance!");
            } else if (percentage >= 50) {
                System.out.println("Good effort!");
            } else {
                System.out.println("Keep practicing!");
            }

            // Save result to file
            try (FileWriter writer = new FileWriter("scores.txt", true)) {
                writer.write(name + " | Score: " + score
                    + "/" + questions.length
                    + " | Percentage: " + percentage + "%\n");

                System.out.println("\nResult saved successfully!");

            } catch (IOException e) {
                System.out.println("Error saving result: " + e.getMessage());
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("\nThank you for playing, " + name + "!");

        sc.close();
    }
}


import java.util.Scanner;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

public class QuizGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== MULTI-SUBJECT QUIZ GAME =====");
        System.out.print("Enter your name: ");
        String name = sc.nextLine().trim();

        if (name.isEmpty()) {
            name = "Player";
        }

        String playAgain;

        do {
            System.out.println("\n===== NEW GAME =====");

            // Subject selection
            System.out.println("\nChoose a subject:");
            System.out.println("1. Java");
            System.out.println("2. Physics");
            System.out.println("3. Chemistry");
            System.out.println("4. Mathematics");
            System.out.println("5. Biology");
            System.out.println("6. General Knowledge");

            int subjectChoice = readChoice(sc, 1, 6);

            String[] subjects = {
                "java", "physics", "chemistry",
                "math", "biology", "gk"
            };

            String subject = subjects[subjectChoice - 1];

            // Difficulty selection
            System.out.println("\nChoose difficulty:");
            System.out.println("1. Easy");
            System.out.println("2. Medium");
            System.out.println("3. Hard");

            int difficultyChoice = readChoice(sc, 1, 3);

            String[] difficulties = {
                "Easy", "Medium", "Hard"
            };

            String difficulty =
                difficulties[difficultyChoice - 1];

            // Load questions
            List<Question> questions =
                QuestionBank.getQuestionsByDifficulty(
                    subject, difficulty
                );

            if (questions.isEmpty()) {
                System.out.println(
                    "\nNo questions available for this selection yet."
                );
            } else {

                int score = 0;

                System.out.println("\nSubject: " +
                    subject.toUpperCase());

                System.out.println("Difficulty: " + difficulty);
                System.out.println("Total Questions: " +
                    questions.size());

                // Play quiz
                for (int i = 0; i < questions.size(); i++) {

                    Question question = questions.get(i);

                    System.out.println(
                        "\nQuestion " + (i + 1) +
                        " of " + questions.size()
                    );

                    question.displayQuestion();

                    System.out.print("Enter your answer:\n");

                    int answer = readChoice(sc, 1, 4);

                    if (question.checkAnswer(answer)) {
                        System.out.println("Correct!");
                        score++;
                    } else {
                        System.out.println(
                            "Wrong! Correct option: " +
                            question.getCorrectAnswer()
                        );
                    }
                }

                double percentage =
                    score * 100.0 / questions.size();

                System.out.println("\n===== FINAL RESULT =====");
                System.out.println("Name: " + name);
                System.out.println("Subject: " + subject);
                System.out.println("Difficulty: " + difficulty);
                System.out.println(
                    "Score: " + score + "/" + questions.size()
                );
                System.out.printf(
                    "Percentage: %.2f%%\n", percentage
                );

                if (score == questions.size()) {
                    System.out.println(
                        "PERFECT SCORE! Quiz Champion!"
                    );
                } else if (percentage >= 80) {
                    System.out.println(
                        "Excellent performance!"
                    );
                } else if (percentage >= 50) {
                    System.out.println("Good effort!");
                } else {
                    System.out.println("Keep practicing!");
                }

                // Save score history
                try (FileWriter writer =
                        new FileWriter("scores.txt", true)) {

                    writer.write(
                        name +
                        " | Subject: " + subject +
                        " | Difficulty: " + difficulty +
                        " | Score: " + score +
                        "/" + questions.size() +
                        " | Percentage: " +
                        String.format(
                            java.util.Locale.US,
                            "%.2f", percentage
                        ) + "%\n"
                    );

                    System.out.println(
                        "\nResult saved successfully!"
                    );

                } catch (IOException e) {
                    System.out.println(
                        "Error saving result: " +
                        e.getMessage()
                    );
                }
            }

            System.out.print(
                "\nDo you want to play again? (yes/no): "
            );

            playAgain = sc.next().trim();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println(
            "\nThank you for playing, " + name + "!"
        );

        sc.close();
    }

    // Input validation
    public static int readChoice(
            Scanner sc, int min, int max) {

        while (true) {

            System.out.print(
                "Enter choice (" + min + "-" + max + "): "
            );

            if (sc.hasNextInt()) {

                int choice = sc.nextInt();

                if (choice >= min && choice <= max) {
                    return choice;
                }

            } else {
                sc.next();
            }

            System.out.println(
                "Invalid input! Enter a number from " +
                min + " to " + max + "."
            );
        }
    }
}


import java.util.List;

public class TestQuestionBank {

    public static void main(String[] args) {

        String[] subjects = {
            "java", "physics", "chemistry",
            "math", "biology", "gk"
        };

        String[] difficulties = {
            "Easy", "Medium", "Hard"
        };

        for (String subject : subjects) {

            System.out.println("\n===== " +
                    subject.toUpperCase() + " =====");

            for (String difficulty : difficulties) {

                List<Question> questions =
                    QuestionBank.getQuestionsByDifficulty(
                        subject, difficulty
                    );

                System.out.println(
                    difficulty + ": " + questions.size() + " questions"
                );
            }
        }
    }
}

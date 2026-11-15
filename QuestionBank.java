
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class QuestionBank {

    // Helper method to add questions
    static void addQuestions(
            List<Question> questions,
            String subject,
            String difficulty,
            String[][] rows) {

        for (String[] row : rows) {

            String[] options = {
                row[1],
                row[2],
                row[3],
                row[4]
            };

            int correctAnswer = Integer.parseInt(row[5]);

            questions.add(new Question(
                row[0],
                options,
                correctAnswer,
                subject,
                difficulty
            ));
        }
    }

    // Subject methods
    public static List<Question> getJavaQuestions() {
        return JavaQuestions.getQuestions();
    }

    public static List<Question> getPhysicsQuestions() {
        return PhysicsQuestions.getQuestions();
    }

    public static List<Question> getChemistryQuestions() {
        return ChemistryQuestions.getQuestions();
    }

    public static List<Question> getMathQuestions() {
        return MathQuestions.getQuestions();
    }

    public static List<Question> getBiologyQuestions() {
        return BiologyQuestions.getQuestions();
    }

    public static List<Question> getGKQuestions() {
        return GKQuestions.getQuestions();
    }

    // Random question selection
    public static List<Question> getRandomQuestions(
            String subject) {

        List<Question> questions;

        if (subject == null) {
            return new ArrayList<>();
        }

        switch (subject.trim().toLowerCase(Locale.ROOT)) {

            case "java":
                questions = getJavaQuestions();
                break;

            case "physics":
                questions = getPhysicsQuestions();
                break;

            case "chemistry":
                questions = getChemistryQuestions();
                break;

            case "math":
            case "maths":
            case "mathematics":
                questions = getMathQuestions();
                break;

            case "biology":
                questions = getBiologyQuestions();
                break;

            case "gk":
            case "general knowledge":
                questions = getGKQuestions();
                break;

            default:
                questions = new ArrayList<>();
        }

        Collections.shuffle(questions);

        return questions;
    }

    // Difficulty filtering
    public static List<Question> getQuestionsByDifficulty(
            String subject,
            String difficulty) {

        List<Question> filteredQuestions =
                new ArrayList<>();

        if (difficulty == null) {
            return filteredQuestions;
        }

        List<Question> allQuestions =
                getRandomQuestions(subject);

        for (Question question : allQuestions) {

            if (question.getDifficulty()
                    .equalsIgnoreCase(difficulty.trim())) {

                filteredQuestions.add(question);
            }
        }

        Collections.shuffle(filteredQuestions);

        return filteredQuestions;
    }
}

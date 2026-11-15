
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionBank {

    public static List<Question> getJavaQuestions() {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question(
            "Which keyword is used to inherit a class in Java?",
            new String[]{"extends", "implements", "inherits", "super"},
            1
        ));

        questions.add(new Question(
            "Which method is the entry point of a Java program?",
            new String[]{"start()", "run()", "main()", "execute()"},
            3
        ));

        return questions;
    }

    public static List<Question> getPhysicsQuestions() {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question(
            "What is the SI unit of force?",
            new String[]{"Joule", "Newton", "Watt", "Pascal"},
            2
        ));

        questions.add(new Question(
            "What is the approximate speed of light in vacuum?",
            new String[]{"3 x 10^6 m/s", "3 x 10^8 m/s", "3 x 10^5 m/s", "3 x 10^4 m/s"},
            2
        ));

        return questions;
    }

    public static List<Question> getChemistryQuestions() {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question(
            "What is the chemical formula of water?",
            new String[]{"CO2", "H2O", "O2", "NaCl"},
            2
        ));

        return questions;
    }

    public static List<Question> getMathQuestions() {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question(
            "What is the square root of 144?",
            new String[]{"10", "11", "12", "14"},
            3
        ));

        return questions;
    }


public static List<Question> getRandomQuestions(String subject) {
    List<Question> questions;

    switch (subject.toLowerCase()) {
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
            questions = getMathQuestions();
            break;
        case "biology":
            questions = getBiologyQuestions();
            break;
        case "gk":
            questions = getGKQuestions();
            break;
        default:
            questions = new ArrayList<>();
    }

    Collections.shuffle(questions);
    return questions;
}

public static List<Question> getBiologyQuestions() {
    List<Question> questions = new ArrayList<>();

    questions.add(new Question(
        "Which organ pumps blood throughout the human body?",
        new String[]{"Lungs", "Heart", "Kidney", "Liver"},
        2, "Biology", "Easy"
    ));

    questions.add(new Question(
        "Which organelle is known as the powerhouse of the cell?",
        new String[]{"Nucleus", "Ribosome", "Mitochondria", "Golgi apparatus"},
        3, "Biology", "Medium"
    ));

    questions.add(new Question(
        "During which phase of mitosis do sister chromatids separate?",
        new String[]{"Prophase", "Metaphase", "Anaphase", "Telophase"},
        3, "Biology", "Hard"
    ));

    return questions;
}

public static List<Question> getGKQuestions() {
    List<Question> questions = new ArrayList<>();

    questions.add(new Question(
        "What is the capital of India?",
        new String[]{"Mumbai", "New Delhi", "Kolkata", "Chennai"},
        2, "GK", "Easy"
    ));

    questions.add(new Question(
        "Who wrote the Indian national anthem?",
        new String[]{"Bankim Chandra Chatterjee", "Rabindranath Tagore",
                     "Sarojini Naidu", "Subhas Chandra Bose"},
        2, "GK", "Medium"
    ));

    questions.add(new Question(
        "In which year was the Indian Constitution adopted?",
        new String[]{"1947", "1948", "1949", "1950"},
        3, "GK", "Hard"
    ));

    return questions;
}

public static List<Question> getQuestionsByDifficulty(
        String subject, String difficulty) {

    List<Question> allQuestions = getRandomQuestions(subject);
    List<Question> filteredQuestions = new ArrayList<>();

    for (Question question : allQuestions) {
        if (question.getDifficulty().equalsIgnoreCase(difficulty)) {
            filteredQuestions.add(question);
        }
    }

    Collections.shuffle(filteredQuestions);
    return filteredQuestions;
}

}

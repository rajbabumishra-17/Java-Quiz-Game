
public class Question {
    private String question;
    private String[] options;
    private int correctAnswer;
    private String subject;
    private String difficulty;

    // Existing questions ke liye
    public Question(String question, String[] options, int correctAnswer) {
        this(question, options, correctAnswer, "General", "Easy");
    }

    // New multi-subject questions ke liye
    public Question(String question, String[] options, int correctAnswer,
                    String subject, String difficulty) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.subject = subject;
        this.difficulty = difficulty;
    }

    public void displayQuestion() {
        System.out.println("\n" + question);

        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public boolean checkAnswer(int answer) {
        return answer == correctAnswer;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public String getSubject() {
        return subject;
    }

    public String getDifficulty() {
        return difficulty;
    }
}

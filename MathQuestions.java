
import java.util.ArrayList;
import java.util.List;

public class MathQuestions {

    public static List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();

        // EASY (10)
        QuestionBank.addQuestions(questions, "Math", "Easy", new String[][] {
            {"What is the square root of 144?", "10", "11", "12", "14", "3"},
            {"What is 7 multiplied by 8?", "48", "54", "56", "64", "3"},
            {"What is 15 + 27?", "32", "42", "52", "43", "2"},
            {"What is the sum of the interior angles of a triangle?", "90 degrees", "180 degrees", "270 degrees", "360 degrees", "2"},
            {"What is 25% of 200?", "25", "40", "50", "75", "3"},
            {"Which is a common approximation of pi to two decimal places?", "3.12", "3.14", "3.41", "3.24", "2"},
            {"What is 9 squared?", "18", "27", "81", "90", "3"},
            {"What is the perimeter of a square with side length 5 cm?", "10 cm", "15 cm", "20 cm", "25 cm", "3"},
            {"Solve x + 7 = 12.", "3", "4", "5", "6", "3"},
            {"What is 1/2 + 1/4?", "1/4", "2/6", "3/4", "1", "3"},
        });

        // MEDIUM (10)
        QuestionBank.addQuestions(questions, "Math", "Medium", new String[][] {
            {"Solve 3x - 5 = 16.", "5", "6", "7", "8", "3"},
            {"What is the area of a circle of radius 7 cm, using pi = 22/7?", "44 cm^2", "77 cm^2", "154 cm^2", "308 cm^2", "3"},
            {"What are the roots of x^2 - 5x + 6 = 0?", "1 and 6", "2 and 3", "-2 and -3", "3 and 5", "2"},
            {"What is sin(30 degrees)?", "0", "1/2", "sqrt(3)/2", "1", "2"},
            {"What comes next in the arithmetic sequence 2, 5, 8, ...?", "9", "10", "11", "13", "3"},
            {"What is the probability of an even result on a fair six-sided die?", "1/6", "1/3", "1/2", "2/3", "3"},
            {"What is the slope of the line through (1,2) and (3,6)?", "1", "2", "3", "4", "2"},
            {"What is the arithmetic mean of 4, 6, 8 and 10?", "6", "7", "8", "9", "2"},
            {"What is the simple interest on Rs 1000 at 5% per year for 2 years?", "Rs 50", "Rs 100", "Rs 150", "Rs 200", "2"},
            {"Which is the factorization of x^2 - 9?", "(x - 9)(x + 1)", "(x - 3)(x + 3)", "(x - 3)^2", "(x + 9)(x - 1)", "2"},
        });

        // HARD (10)
        QuestionBank.addQuestions(questions, "Math", "Hard", new String[][] {
            {"What is the derivative of x^3 evaluated at x = 2?", "6", "8", "12", "16", "3"},
            {"What is the definite integral of 2x from x = 0 to x = 3?", "3", "6", "9", "12", "3"},
            {"What is the determinant of the matrix [[2,3],[1,4]]?", "5", "8", "11", "-5", "1"},
            {"What is log base 2 of 32?", "4", "5", "6", "8", "2"},
            {"What is the limit of sin(x)/x as x approaches 0, in radians?", "0", "1", "Infinity", "-1", "2"},
            {"If a fair coin is tossed twice, what is the probability of two heads?", "1/2", "1/3", "1/4", "1/8", "3"},
            {"What is the sum of the integers from 1 through 20?", "190", "200", "210", "220", "3"},
            {"What is the coefficient of x^2 in (1 + x)^5?", "5", "10", "15", "20", "2"},
            {"What is the sum of the first four terms of 3, 6, 12, 24, ...?", "42", "45", "48", "51", "2"},
            {"What is the repeated root of x^2 + 4x + 4 = 0?", "-4", "-2", "2", "4", "2"},
        });

        return questions;
    }
}

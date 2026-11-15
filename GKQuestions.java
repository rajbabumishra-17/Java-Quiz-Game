
import java.util.ArrayList;
import java.util.List;

public class GKQuestions {

    public static List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();

        // EASY (10)
        QuestionBank.addQuestions(questions, "GK", "Easy", new String[][] {
            {"What is the capital of India?", "Mumbai", "New Delhi", "Kolkata", "Chennai", "2"},
            {"What is India's national animal?", "Lion", "Elephant", "Bengal tiger", "Leopard", "3"},
            {"What is the wheel at the center of the Indian national flag called?", "Dharma Wheel", "Ashoka Chakra", "Sudarshan Chakra", "Charkha", "2"},
            {"What is India's national bird?", "Sparrow", "Peacock", "Eagle", "Parrot", "2"},
            {"Which is the largest continent by area?", "Africa", "Asia", "Europe", "Australia", "2"},
            {"Which planet is known as the Red Planet?", "Venus", "Mars", "Jupiter", "Mercury", "2"},
            {"How many days are there in a leap year?", "364", "365", "366", "367", "3"},
            {"In which Indian city is the Taj Mahal located?", "Jaipur", "Agra", "Delhi", "Lucknow", "2"},
            {"In which year did India gain independence from British rule?", "1942", "1945", "1947", "1950", "3"},
            {"Which is the largest ocean on Earth?", "Atlantic", "Indian", "Pacific", "Arctic", "3"},
        });

        // MEDIUM (10)
        QuestionBank.addQuestions(questions, "GK", "Medium", new String[][] {
            {"Who wrote the Indian national anthem?", "Bankim Chandra Chatterjee", "Rabindranath Tagore", "Sarojini Naidu", "Subhas Chandra Bose", "2"},
            {"On which date was the Constitution of India adopted?", "15 August 1947", "26 January 1950", "26 November 1949", "2 October 1948", "3"},
            {"In which city is the headquarters of ISRO?", "Hyderabad", "Bengaluru", "Mumbai", "Chennai", "2"},
            {"What is the currency of Japan?", "Won", "Yuan", "Yen", "Baht", "3"},
            {"In which city is the United Nations headquarters?", "Geneva", "New York City", "Paris", "Vienna", "2"},
            {"Which mountain has the highest summit above sea level?", "K2", "Kangchenjunga", "Mount Everest", "Lhotse", "3"},
            {"Who wrote the book The Discovery of India?", "Mahatma Gandhi", "Jawaharlal Nehru", "Sardar Patel", "B. R. Ambedkar", "2"},
            {"Who was the first person to walk on the Moon?", "Yuri Gagarin", "Buzz Aldrin", "Neil Armstrong", "Michael Collins", "3"},
            {"On which date is World Environment Day observed?", "5 June", "22 April", "1 May", "16 September", "1"},
            {"On which date is International Day of Yoga observed?", "21 March", "21 June", "21 September", "21 December", "2"},
        });

        // HARD (10)
        QuestionBank.addQuestions(questions, "GK", "Hard", new String[][] {
            {"Which article of the Indian Constitution guarantees the right to constitutional remedies?", "Article 14", "Article 19", "Article 21", "Article 32", "4"},
            {"On which date did the Constitution of India come into effect?", "26 November 1949", "26 January 1950", "15 August 1947", "2 October 1950", "2"},
            {"Who was the first woman President of India?", "Indira Gandhi", "Pratibha Patil", "Sarojini Naidu", "Droupadi Murmu", "2"},
            {"Who was the first Indian Nobel Prize laureate?", "C. V. Raman", "Amartya Sen", "Rabindranath Tagore", "Mother Teresa", "3"},
            {"In which year was the Battle of Plassey fought?", "1757", "1764", "1857", "1947", "1"},
            {"Which treaty formally ended World War I between Germany and the Allied powers?", "Treaty of Paris (1783)", "Treaty of Versailles", "Treaty of Tordesillas", "Treaty of Utrecht", "2"},
            {"In which city is the Nobel Peace Prize awarded?", "Stockholm", "Copenhagen", "Oslo", "Helsinki", "3"},
            {"Where is UNESCO headquartered?", "London", "New York City", "Paris", "Rome", "3"},
            {"Who formulated the three laws of planetary motion?", "Isaac Newton", "Johannes Kepler", "Galileo Galilei", "Albert Einstein", "2"},
            {"Which strait separates India and Sri Lanka?", "Bering Strait", "Strait of Malacca", "Palk Strait", "Strait of Hormuz", "3"},
        });

        return questions;
    }
}


import java.util.ArrayList;
import java.util.List;

public class PhysicsQuestions {

    public static List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();

        // EASY (10)
        QuestionBank.addQuestions(questions, "Physics", "Easy", new String[][] {
            {"What is the SI unit of force?", "Joule", "Newton", "Watt", "Pascal", "2"},
            {"What is the approximate speed of light in a vacuum?", "3 x 10^6 m/s", "3 x 10^8 m/s", "3 x 10^5 m/s", "3 x 10^4 m/s", "2"},
            {"What is the SI unit of energy?", "Watt", "Newton", "Joule", "Hertz", "3"},
            {"What is the approximate acceleration due to gravity near Earth's surface?", "9.8 m/s^2", "98 m/s^2", "0.98 m/s^2", "980 m/s^2", "1"},
            {"What is the SI unit of electric current?", "Volt", "Ohm", "Ampere", "Coulomb", "3"},
            {"Which instrument measures electric current in a circuit?", "Voltmeter", "Ammeter", "Barometer", "Thermometer", "2"},
            {"What is the tendency of a body to resist changes in its motion called?", "Pressure", "Inertia", "Power", "Density", "2"},
            {"What is the SI unit of frequency?", "Tesla", "Hertz", "Weber", "Joule", "2"},
            {"In which medium can ordinary sound waves NOT propagate?", "Water", "Air", "Steel", "Vacuum", "4"},
            {"What is the SI unit of power?", "Watt", "Newton", "Joule", "Pascal", "1"},
        });

        // MEDIUM (10)
        QuestionBank.addQuestions(questions, "Physics", "Medium", new String[][] {
            {"A 4 kg body accelerates at 3 m/s^2. What is the net force?", "7 N", "12 N", "1.33 N", "24 N", "2"},
            {"What current flows through a 4-ohm resistor connected to 12 V?", "48 A", "8 A", "3 A", "0.33 A", "3"},
            {"What is the total resistance of 2 ohms and 3 ohms connected in series?", "1 ohm", "6 ohms", "5 ohms", "1.2 ohms", "3"},
            {"An object travels at a constant 5 m/s for 6 seconds. How far does it move?", "11 m", "30 m", "1.2 m", "60 m", "2"},
            {"Which mirror is commonly used for wide-angle rear-view observation?", "Concave mirror", "Plane mirror", "Convex mirror", "Parabolic mirror", "3"},
            {"Parallel rays entering a converging lens meet at which point?", "Optical center", "Principal focus", "Center of curvature", "Pole", "2"},
            {"What is the momentum of a 2 kg body moving at 4 m/s?", "2 kg m/s", "6 kg m/s", "8 kg m/s", "16 kg m/s", "3"},
            {"A 10 N force moves an object 5 m in its direction. What work is done?", "2 J", "15 J", "50 J", "100 J", "3"},
            {"A wave moves at 340 m/s with wavelength 2 m. What is its frequency?", "680 Hz", "170 Hz", "342 Hz", "0.0059 Hz", "2"},
            {"What is the period of a 50 Hz oscillation?", "50 s", "0.2 s", "0.02 s", "0.002 s", "3"},
        });

        // HARD (10)
        QuestionBank.addQuestions(questions, "Physics", "Hard", new String[][] {
            {"What is the kinetic energy of a 2 kg object moving at 6 m/s?", "12 J", "18 J", "36 J", "72 J", "3"},
            {"How much energy is transferred when 2 C of charge moves through 9 V?", "4.5 J", "11 J", "18 J", "81 J", "3"},
            {"What is the equivalent capacitance of 2 uF and 3 uF connected in parallel?", "1.2 uF", "5 uF", "6 uF", "0.83 uF", "2"},
            {"What is the equivalent resistance of 2 ohms and 3 ohms in parallel?", "5 ohms", "6 ohms", "1.2 ohms", "2.5 ohms", "3"},
            {"A ball is thrown upward at 20 m/s. If g = 10 m/s^2, what maximum height does it reach?", "10 m", "20 m", "30 m", "40 m", "2"},
            {"For a fixed amount of ideal gas at constant temperature, if pressure doubles, its volume becomes:", "Double", "Four times", "Half", "Unchanged", "3"},
            {"An ideal transformer has 200 primary turns and 50 secondary turns. At 240 V input, what is its output voltage?", "60 V", "120 V", "480 V", "960 V", "1"},
            {"What is the energy of a photon with frequency f, where h is Planck's constant?", "h/f", "f/h", "hf", "h + f", "3"},
            {"What are the dimensions of force?", "M L T^-1", "M L T^-2", "M L^2 T^-2", "M T^-2", "2"},
            {"A projectile launches at 20 m/s at 30 degrees above horizontal. What is its initial vertical speed?", "5 m/s", "10 m/s", "17.3 m/s", "20 m/s", "2"},
        });

        return questions;
    }
}


import java.util.ArrayList;
import java.util.List;

public class ChemistryQuestions {

    public static List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();

        // EASY (10)
        QuestionBank.addQuestions(questions, "Chemistry", "Easy", new String[][] {
            {"What is the chemical formula of water?", "CO2", "H2O", "O2", "NaCl", "2"},
            {"What is the chemical symbol for sodium?", "S", "So", "Na", "Sd", "3"},
            {"Which element has atomic number 1?", "Helium", "Hydrogen", "Lithium", "Oxygen", "2"},
            {"What is the pH of pure neutral water at 25 degrees Celsius?", "0", "7", "10", "14", "2"},
            {"What is the chemical formula of molecular oxygen?", "O", "O2", "O3", "CO2", "2"},
            {"What is the common name of CO2?", "Carbon monoxide", "Carbon dioxide", "Calcium oxide", "Carbonic acid", "2"},
            {"What acid is present in an aqueous solution of HCl?", "Nitric acid", "Sulfuric acid", "Hydrochloric acid", "Acetic acid", "3"},
            {"How many protons are present in a carbon atom?", "4", "6", "8", "12", "2"},
            {"Which gas do green plants absorb during photosynthesis?", "Oxygen", "Nitrogen", "Carbon dioxide", "Hydrogen", "3"},
            {"What happens to blue litmus paper in an acidic solution?", "Turns red", "Turns green", "Turns blue", "Turns black", "1"},
        });

        // MEDIUM (10)
        QuestionBank.addQuestions(questions, "Chemistry", "Medium", new String[][] {
            {"What type of bond is the main attraction in solid sodium chloride?", "Covalent bond", "Ionic bond", "Metallic bond", "Hydrogen bond", "2"},
            {"Approximately how many particles are in one mole?", "6.022 x 10^23", "3.14 x 10^8", "9.8 x 10^2", "1.00 x 10^6", "1"},
            {"What is the approximate molar mass of H2O?", "16 g/mol", "17 g/mol", "18 g/mol", "20 g/mol", "3"},
            {"What is the reaction between HCl and NaOH producing salt and water called?", "Combustion", "Neutralization", "Polymerization", "Decomposition", "2"},
            {"Oxidation of a species involves what change in its electrons?", "Gain of electrons", "Loss of electrons", "No electron change", "Sharing of all electrons", "2"},
            {"What is the name of CH4?", "Ethane", "Methane", "Propane", "Butane", "2"},
            {"At 25 degrees Celsius, which pH represents an acidic aqueous solution?", "pH 9", "pH 7", "pH 4", "pH 12", "3"},
            {"What electric charge does an electron carry?", "Positive", "Negative", "Zero", "Variable positive", "2"},
            {"Which element is an alkali metal?", "Calcium", "Aluminum", "Potassium", "Neon", "3"},
            {"What type of bond forms when atoms share electron pairs?", "Ionic", "Covalent", "Metallic", "Electrostatic ionic", "2"},
        });

        // HARD (10)
        QuestionBank.addQuestions(questions, "Chemistry", "Hard", new String[][] {
            {"What is the oxidation number of sulfur in H2SO4?", "+2", "+4", "+6", "+8", "3"},
            {"At 25 degrees Celsius, what is the pH of a 0.001 M fully dissociated monoprotic acid?", "1", "2", "3", "11", "3"},
            {"For N2 + 3H2 in equilibrium with 2NH3, increasing pressure at constant temperature favors:", "N2 and H2", "NH3", "Neither side", "Only H2", "2"},
            {"What is the approximate molar mass of Na2CO3?", "84 g/mol", "96 g/mol", "106 g/mol", "116 g/mol", "3"},
            {"What is the hybridization of carbon in methane, CH4?", "sp", "sp2", "sp3", "sp3d", "3"},
            {"What is the oxidation number of manganese in KMnO4?", "+2", "+4", "+6", "+7", "4"},
            {"What is the approximate H-O-H bond angle in a water molecule?", "90 degrees", "104.5 degrees", "120 degrees", "180 degrees", "2"},
            {"In the ideal-gas approximation, what volume does one mole of gas occupy at 0 degrees Celsius and 1 atm?", "11.2 L", "22.4 L", "24.5 L", "44.8 L", "2"},
            {"Approximately how much charge is carried by one mole of electrons?", "965 C", "9,650 C", "96,500 C", "965,000 C", "3"},
            {"For 2H2 + O2 -> 2H2O, how many moles of O2 fully react with 4 moles of H2?", "1 mole", "2 moles", "4 moles", "8 moles", "2"},
        });

        return questions;
    }
}

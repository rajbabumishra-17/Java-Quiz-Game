
import java.util.ArrayList;
import java.util.List;

public class BiologyQuestions {

    public static List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();

        // EASY (10)
        QuestionBank.addQuestions(questions, "Biology", "Easy", new String[][] {
            {"Which organ pumps blood throughout the human body?", "Lungs", "Heart", "Kidney", "Liver", "2"},
            {"Which cell structure contains chlorophyll in green plants?", "Mitochondrion", "Chloroplast", "Nucleus", "Ribosome", "2"},
            {"What is the basic structural and functional unit of life?", "Tissue", "Organ", "Cell", "Organ system", "3"},
            {"Which organ is mainly responsible for gas exchange in humans?", "Stomach", "Lungs", "Liver", "Brain", "2"},
            {"What does DNA stand for?", "Deoxyribonucleic acid", "Dinucleic acid", "Deoxyribose nitrogen acid", "Double nucleic atom", "1"},
            {"How many chromosomes are normally found in a human body cell?", "23", "44", "46", "48", "3"},
            {"What is the largest organ of the human body?", "Heart", "Skin", "Liver", "Lung", "2"},
            {"What are the tiny pores on leaves used in gas exchange called?", "Stomata", "Nephrons", "Alveoli", "Villi", "1"},
            {"Which blood cells primarily carry oxygen?", "White blood cells", "Red blood cells", "Platelets", "Plasma cells", "2"},
            {"Which plant organ typically absorbs most water from the soil?", "Flower", "Stem", "Root", "Fruit", "3"},
        });

        // MEDIUM (10)
        QuestionBank.addQuestions(questions, "Biology", "Medium", new String[][] {
            {"Which organelle is often called the powerhouse of the cell?", "Nucleus", "Ribosome", "Mitochondrion", "Golgi apparatus", "3"},
            {"Which process converts light energy into chemical energy in green plants?", "Respiration", "Photosynthesis", "Fermentation", "Digestion", "2"},
            {"Which organ secretes the hormone insulin?", "Liver", "Pancreas", "Kidney", "Thyroid", "2"},
            {"What is the liquid portion of blood called?", "Plasma", "Platelet", "Hemoglobin", "Lymph node", "1"},
            {"What is the functional filtering unit of the kidney?", "Neuron", "Nephron", "Alveolus", "Villus", "2"},
            {"Which blood components are primarily involved in clot formation?", "Platelets", "Red blood cells", "Neurons", "Osteocytes", "1"},
            {"In normal DNA base pairing, adenine pairs with which base?", "Cytosine", "Guanine", "Thymine", "Uracil", "3"},
            {"How many daughter cells usually result from one completed mitosis and cytokinesis?", "One", "Two", "Three", "Four", "2"},
            {"Which plant tissue transports water and minerals upward?", "Phloem", "Xylem", "Epidermis", "Cambium", "2"},
            {"Which enzyme begins major protein digestion in the human stomach?", "Amylase", "Pepsin", "Lipase", "Lactase", "2"},
        });

        // HARD (10)
        QuestionBank.addQuestions(questions, "Biology", "Hard", new String[][] {
            {"During which phase of mitosis do sister chromatids separate?", "Prophase", "Metaphase", "Anaphase", "Telophase", "3"},
            {"What is the main effect of meiosis on chromosome number in its resulting haploid cells?", "It doubles", "It halves", "It remains diploid", "It triples", "2"},
            {"Which heart chamber receives oxygenated blood from the lungs?", "Right atrium", "Right ventricle", "Left atrium", "Left ventricle", "3"},
            {"Which enzyme synthesizes RNA from a DNA template during transcription?", "DNA ligase", "RNA polymerase", "DNA helicase", "Protease", "2"},
            {"Which RNA codon commonly initiates translation?", "UAA", "UGA", "AUG", "UAG", "3"},
            {"In humans, mitochondrial DNA is inherited primarily from which parent?", "Father", "Mother", "Both equally", "Neither parent", "2"},
            {"What is the final electron acceptor in aerobic cellular respiration?", "Carbon dioxide", "Nitrogen", "Oxygen", "Glucose", "3"},
            {"Which plant tissue transports sugars from source leaves to other regions?", "Xylem", "Phloem", "Cork", "Epidermis", "2"},
            {"In a simple Aa x Aa cross, what is the probability of an aa offspring?", "0", "1/4", "1/2", "3/4", "2"},
            {"Which immune cells differentiate into plasma cells that secrete antibodies?", "B lymphocytes", "Red blood cells", "Neutrophils", "Platelets", "1"},
        });

        return questions;
    }
}


import java.util.ArrayList;
import java.util.List;

public class JavaQuestions {

    public static List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();

        // EASY (10)
        QuestionBank.addQuestions(questions, "Java", "Easy", new String[][] {
            {"Which keyword is used to inherit a class in Java?", "extends", "implements", "inherits", "super", "1"},
            {"Which method is the entry point of a standard Java application?", "start()", "run()", "main()", "execute()", "3"},
            {"Which keyword is used to create an object?", "class", "new", "static", "void", "2"},
            {"Which primitive data type stores true or false?", "int", "String", "boolean", "char", "3"},
            {"Which package contains the Scanner class?", "java.io", "java.net", "java.util", "java.sql", "3"},
            {"Which symbol terminates most Java statements?", ":", ";", ".", ",", "2"},
            {"Which keyword is used to declare a class?", "object", "class", "define", "struct", "2"},
            {"Which primitive data type stores a single character?", "String", "char", "int", "boolean", "2"},
            {"Which operator tests equality of two primitive int values?", "=", "==", "!=", ">=", "2"},
            {"Which loop checks its condition after running its body?", "for", "while", "do-while", "enhanced for", "3"},
        });

        // MEDIUM (10)
        QuestionBank.addQuestions(questions, "Java", "Medium", new String[][] {
            {"Which collection stores unique elements?", "ArrayList", "HashSet", "LinkedList", "Vector", "2"},
            {"Which String method checks whether two strings have the same characters?", "==", "equals()", "compare()", "match()", "2"},
            {"Which modifier prevents a class from being subclassed?", "static", "final", "private", "abstract", "2"},
            {"Which interface defines the natural ordering of objects?", "Runnable", "Comparable", "Cloneable", "Serializable", "2"},
            {"Which exception occurs when an array index is outside its bounds?", "NullPointerException", "IOException", "ArrayIndexOutOfBoundsException", "ClassNotFoundException", "3"},
            {"Which keyword refers to the current object?", "super", "this", "static", "final", "2"},
            {"Which Thread method launches a new thread of execution?", "run()", "start()", "execute()", "begin()", "2"},
            {"Which access modifier restricts a member to its own enclosing class?", "public", "protected", "private", "default", "3"},
            {"Which collection preserves insertion order and allows duplicates?", "HashSet", "TreeSet", "ArrayList", "HashMap", "3"},
            {"Which keyword introduces a block that handles a thrown exception?", "catch", "throws", "throw", "final", "1"},
        });

        // HARD (10)
        QuestionBank.addQuestions(questions, "Java", "Hard", new String[][] {
            {"Which JVM memory area usually holds newly created objects?", "Stack", "Heap", "PC Register", "Native Method Stack", "2"},
            {"Which field modifier provides visibility guarantees between Java threads?", "final", "volatile", "static", "transient", "2"},
            {"Which method requests that the JVM consider running garbage collection?", "System.gc()", "System.clean()", "Runtime.delete()", "Object.destroy()", "1"},
            {"Which legacy List implementation synchronizes its individual methods?", "ArrayList", "HashMap", "Vector", "HashSet", "3"},
            {"What is the average-case time complexity of HashMap.get()?", "O(n)", "O(log n)", "O(1)", "O(n log n)", "3"},
            {"Which Java feature allows a class to implement multiple types?", "Class inheritance", "Interfaces", "Constructors", "Packages", "2"},
            {"Which modifier skips an instance field during default Java serialization?", "static", "final", "transient", "volatile", "3"},
            {"Which method must a class implementing Runnable provide?", "start()", "run()", "execute()", "call()", "2"},
            {"Which class is a synchronized mutable sequence of characters?", "String", "StringBuilder", "StringBuffer", "CharSequence", "3"},
            {"Which Java API offers map, filter and reduce operations on streams?", "JDBC", "Stream API", "Reflection API", "RMI", "2"},
        });

        return questions;
    }
}

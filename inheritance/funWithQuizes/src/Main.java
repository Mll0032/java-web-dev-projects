import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        MultipleChoiceQuestion oneQuestion = new MultipleChoiceQuestion(
                "What is the capital of france? ", Array.asList("Paris", "London", "Rome", "Berlin"), "Paris"
        );

        quiz.addQuestion(oneQuestion);

    }
}
import java.util.ArrayList;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        ArrayList<String> oneOptions = new ArrayList<>();
        oneOptions.add("Paris");
        oneOptions.add("London");
        oneOptions.add("Berlin");
        oneOptions.add("Madrid");

        MultipleChoiceQuestion oneQuestion = new MultipleChoiceQuestion(
                "What is the capital of France?", oneOptions, "1");

        ArrayList<String> twoOptions = new ArrayList<>();
        twoOptions.add("Beijing");
        twoOptions.add("Tokyo");
        twoOptions.add("Seoul");
        twoOptions.add("Bangkok");

        MultipleChoiceQuestion twoQuestion = new MultipleChoiceQuestion(
                "What is the capital of Japan?", twoOptions, "2");


        ArrayList<String> oneCheckBoxOptions = new ArrayList<>();
        oneCheckBoxOptions.add("Duck a l'Orange");
        oneCheckBoxOptions.add("Banh mi ");
        oneCheckBoxOptions.add("Ratatouille");
        oneCheckBoxOptions.add("Empanada");
        ArrayList<String> oneCheckBoxCorrectAnswers = new ArrayList<>();
        oneCheckBoxCorrectAnswers.add("1");
        oneCheckBoxCorrectAnswers.add("3");
        CheckboxQuestion oneCheckBoxQuestion= new CheckboxQuestion(
                 "Which are famous Fench dishes: Select all that Apply.", oneCheckBoxOptions, oneCheckBoxCorrectAnswers);

        TrueFalseQuestion oneTrueFalseQuestion = new TrueFalseQuestion(
                "France is in in Asia", false
        );

        quiz.addQuestion(oneQuestion);
        quiz.addQuestion(twoQuestion);
        quiz.addQuestion(oneCheckBoxQuestion);
        quiz.addQuestion(oneTrueFalseQuestion);

        quiz.runQuiz();

        quiz.gradeQuiz();
    }
}

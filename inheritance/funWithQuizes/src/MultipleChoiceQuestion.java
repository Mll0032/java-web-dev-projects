import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question {
    private ArrayList<String> options;
    private String correctAnswer;

    public MultipleChoiceQuestion(String questionText, ArrayList<String> options, String correctAnswer) {
        super(questionText);
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public void displayOptions() {
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

  @Override
    public boolean checkAnswer(String userAnswer) {
        return userAnswer.trim().equalsIgnoreCase(correctAnswer);
    }
}

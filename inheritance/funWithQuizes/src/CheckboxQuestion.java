import java.util.ArrayList;
import java.util.Arrays;

public class CheckboxQuestion extends Question {
    private ArrayList<String> options;
    private ArrayList<String> correctAnswers;

    public CheckboxQuestion(String questionText, ArrayList<String> options, ArrayList<String> correctAnswers) {
        super(questionText);
        this.options = options;
        this.correctAnswers = correctAnswers;
    }

    public void displayOptions() {
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        String[] userAnswersArray = userAnswer.split(",");
        ArrayList<String> userAnswerList = new ArrayList<>();
        for (String ans : userAnswersArray) {
            userAnswerList.add(ans.trim());
        }
        return  correctAnswers.containsAll(userAnswerList) && userAnswerList.containsAll(correctAnswers);
    }
}
import java.util.List;

public class MultipleChoiceQuestion extends Question {
    private List<String> choices;
    private String correctAnswer;

    public MultipleChoiceQuestion(String, questionPrompt, List<String> choices, String correctAnswer) {
        super(questionPrompt);
        this.choices = choices;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayQuestion() {
        System.out.println(getQuestionPrompt());
        for (int i = 0; i < choices.size(); i++) {
            System.out.println(i+1) + "." + choices.get(o));
        }
    }

    @Override public boolean checkAnswer(String userAnswer){
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }
}
